package jeu;

import java.util.ArrayList;

public class Plateau {

    /**
     * Liste ordonnée des carreaux du plateau.
     */
    private ArrayList<Carreau> Carreaux;


    /**
     * Château bleu du plateau.
     */
    private Chateau chateauBleu;

    /**
     * Château rouge du plateau.
     */
    private Chateau chateauRouge;


    /**
     * Initialise un nouveau plateau avec un nombre de carreaux donnée en paramètre (longueur).
     * @param longueur le nombre de carreaux du plateau.
     */
    public Plateau(int longueur) {
        this.Carreaux = new ArrayList<>();
        for (int i = 0 ; i < longueur ; i++ ) {
            Carreaux.add(new Carreau());
        }
    }

    /**
     * Ajoute des guerriers d'un chateau sur le carreau de départ correspondant : les bleus partent du carreau 0, les rouges du dernier carreau.
     * @param chateau   le chateau auquel les guerriers sont ajoutés.
     * @param guerriers les guerriers à ajouter.
     */
    public void ajoutGuerriers(Chateau chateau, Guerrier[] guerriers) {
        if (chateau.estBleu()) {
            getDepartBleu().ajoutGuerriersBleus(guerriers);
        } else {
            getDepartRouge().ajoutGuerriersRouges(guerriers);
        }
    }

    /**
     * Déplace tous les guerriers d'un carreau vers le suivant : les bleus se déplacent de gauche à droite ; les rouges se déplacent de droite à gauche.
     */
    public void deplaceGuerriers() {
        for (int i = 0 ; i < Carreaux.size() ; i++) {
            // sens inverse pour les guerriers rouges
            if (i > 0 && Carreaux.get(i).estRouge()) {
                Guerrier[] rouges = Carreaux.get(i).retirerGuerriersRouges();
                Carreaux.get(i-1).ajoutGuerriersRouges(rouges);
            }
            // sens normal pour les guerriers bleus
            if (i < Carreaux.size()-1 && Carreaux.get(i).estBleu()) {
                Guerrier[] bleus = Carreaux.get(i).retirerGuerriersBleus();
                Carreaux.get(i+1).ajoutGuerriersBleus(bleus);
            }
        }
    }


    /**
     * Lance les combats sur tous les carreaux qui sont des champs de bataille.
     */
    public void lanceCombat() {
        for (Carreau carreau : Carreaux) {
            if (carreau.estChampDeBataille()) {
                carreau.lanceCombat();
            }
        }
    }

    /**
     * Renvoie vrai si la partie est terminée (les bleus sont sur le dernier carreau ou les rouges sont sur le premier carreau), faux sinon.
     * @return vrai si la partie est terminée, faux sinon.
     */
    public boolean estPartieTerminee() {
        return getDepartBleu().estRouge() || getDepartRouge().estBleu();
    }


    /**
     * Renvoie la couleur du gagnant.
     * @return la couleur du gagnant.
     */
    public Couleur getGagnant() {
        if (getDepartBleu().estRouge()) {
            return Couleur.ROUGE;
        } else if (getDepartRouge().estBleu()) {
            return Couleur.BLEU;
        } else {
            return null;
        }
    }

    /**
     * Renvoie la liste des carreaux du plateau.
     * @return la liste des carreaux du plateau.
     */
    public Carreau[] getCarreaux() {
        Carreau[] car = new Carreau[Carreaux.size()];
        for (int i = 0 ; i < Carreaux.size() ; i++ ) {
            car[i] = Carreaux.get(i);
        }
        return car;
    }

    /**
     * Renvoie le carreau de départ des bleus (premier carreau).
     * @return  le carreau de départ des bleus.
     */
    private Carreau getDepartBleu() {
        return Carreaux.get(0);
    }

    /**
     * Renvoie le carreau de départ des rouges (dernier carreau).
     * @return  le carreau de départ des rouges.
     */
    private Carreau getDepartRouge() {
        return Carreaux.get(Carreaux.size() - 1);
    }
}
