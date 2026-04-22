package jeu;

import java.util.ArrayList;

public class Chateau {
    /**
     * RESSOURCES_INITIAL est attribut privé, une constante de type entier, désignant le nombre de ressources initial du chateau.
     */
    private static final int RESSOURCES_INITIAL = 3;

    /**
     * RESSOURCES_AJOUTEE_PAR_TOUR est attribut privé, une constante de type entier, désignant le nombre de ressources ajoutées par tour du chateau.
     */
    private static final int RESSOURCES_AJOUTEE_PAR_TOUR = 1;



    /**
     * ressources est attribut privé, de type entier, désignant le nombre de ressources d'un chateau.
     */
    private int ressources;

    /**
     * couleur est attribut privé, de type Couleur, désignant la couleur d'un chateau.
     */
    private Couleur couleur;

    /**
     * guerriersNovices est attribut privé, de type ArrayList de Guerriers , contenant les guerriers novices d'un chateau.
     */
    private ArrayList<Guerrier> guerriersNovices;


    /**
     * Initialise un nouvel objet Chateau, dont la couleur est initialisée à partir de la couleur passée en paramètre et le nombre de ressources est initialisé grâce à la constante RESSOURCES_INITIAL.
     * @param couleur la couleur du chateau.
     */
    public Chateau(Couleur couleur) {
        this.couleur = couleur;
        this.ressources = RESSOURCES_INITIAL;
    }


    
}
