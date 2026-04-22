package jeu;

import java.util.ArrayList;

/**
 * La classe Chateau, de définition et de gestion des châteaux de la bataille de Faërun.
 * @author Sarah Sellam
 */
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
     * Initialise un nouvel objet Chateau, dont la couleur et le nombre de ressources sont respectivement initialisés à partir de la couleur passée en paramètre et la constante RESSOURCES_INITIAL ; la liste des guerriers novices est également initailisée.
     * @param couleur la couleur du chateau.
     */
    public Chateau(Couleur couleur) {
        this.couleur = couleur;
        this.ressources = RESSOURCES_INITIAL;
        this.guerriersNovices = new ArrayList<>();
    }


    /**
     * Renvoie la couleur du château.
     * @return la couleur du château.
     */
    public Couleur getCouleur() {
        return couleur;
    }

    /**
     * Renvoie vrai si le château est de couleur bleue, faux sinon.
     * @return vrai si le château est de couleur bleue, faux sinon.
     */
    public boolean estBleu() {
        return couleur == Couleur.BLEU;
    }

    /**
     * Renvoie vrai si le château est de couleur rouge, faux sinon.
     * @return vrai si le château est de couleur rouge, faux sinon.
     */
    public boolean estRouge() {
        return couleur == Couleur.ROUGE;
    }
}
