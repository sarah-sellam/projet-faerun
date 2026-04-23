package jeu;

import java.util.ArrayList;

public class Carreau {

    /**
     * Liste des guerriers bleus présents sur le carreau.
     */
    private ArrayList<Guerrier> guerriersBleus;

    /**
     * Liste des guerriers rouges présents sur le carreau.
     */
    private ArrayList<Guerrier> guerriersRouges;

    /**
     * Initialise un nouveau carreau vide.
     */
    public Carreau() {
        this.guerriersBleus = new ArrayList<>();
        this.guerriersRouges = new ArrayList<>();
    }

    /**
     * Renvoie les guerriers bleus présents sur le carreau.
     * @return les guerriers bleus présents sur le carreau.
     */
    public Guerrier[] getGuerriersBleus() {
        Guerrier[] guerriers = new Guerrier[guerriersBleus.size()];
        for (int i = 0 ; i < guerriersBleus.size() ; i++ ) {
            guerriers[i] = guerriersBleus.get(i);
        }
        return guerriers;
    }

    /**
     * Renvoie les guerriers rouges présents sur le carreau.
     * @return les guerriers rouges présents sur le carreau.
     */
    public Guerrier[] getGuerriersRouges() {
        Guerrier[] guerriers = new Guerrier[guerriersRouges.size()];
        for (int i = 0 ; i < guerriersRouges.size() ; i++ ) {
            guerriers[i] = guerriersRouges.get(i);
        }
        return guerriers;
    }

    /**
     * Ajoute des guerriers bleus sur le carreau.
     * @param guerriers les guerriers bleus à ajouter.
     */
    public void ajoutGuerriersBleus(Guerrier[] guerriers) {
        for (int i = 0 ; i < guerriers.length ; i++) {
            guerriersBleus.add(guerriers[i]);
        }
    }

    /**
     * Ajoute des guerriers rouges sur le carreau.
     * @param guerriers les guerriers rouges à ajouter.
     */
    public void ajoutGuerriersRouges(Guerrier[] guerriers) {
        for (int i = 0 ; i < guerriers.length ; i++) {
            guerriersRouges.add(guerriers[i]);
        }
    }

    /**
     * Retire les guerriers bleus du carreau et renvoie la liste des guerriers bleus retirés.
     * @return la liste des guerriers bleus retirés.
     */
    public Guerrier[] retirerGuerriersBleus() {
        Guerrier[] guerriersRetires = getGuerriersBleus();
        guerriersBleus.clear();
        return guerriersRetires;
    }

    /**
     * Retire les guerriers rouges du carreau et renvoie la liste des guerriers rouges retirés.
     * @return la liste des guerriers rouges retirés.
     */
    public Guerrier[] retirerGuerriersRouges() {
        Guerrier[] guerriersRetires = getGuerriersRouges();
        guerriersRouges.clear();
        return guerriersRetires;
    }


    /**
     * Supprime le guerrier, passé en paramètre, du carreau.
     * @param guerrier le guerrier à supprimer.
     */
    public void supprimerGuerrier(Guerrier guerrier) {
        guerriersBleus.remove(guerrier);
        guerriersRouges.remove(guerrier);
    }


    /**
     * Renvoie vrai si le carreau contient des guerriers rouges, faux sinon.
     * @return vrai si le carreau contient des guerriers rouges, faux sinon.
     */
    public boolean estRouge() {
        return !guerriersRouges.isEmpty();
    }

    /**
     * Renvoie vrai si le carreau contient des guerriers bleus, faux sinon.
     * @return vrai si le carreau contient des guerriers bleus, faux sinon.
     */
    public boolean estBleu() {
        return !guerriersBleus.isEmpty();
    }





}
