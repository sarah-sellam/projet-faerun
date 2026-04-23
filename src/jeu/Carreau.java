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
}
