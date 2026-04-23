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
