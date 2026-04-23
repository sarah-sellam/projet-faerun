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
}
