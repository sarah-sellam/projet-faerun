package jeu;

import java.util.ArrayList;
import java.util.Collection;

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
     * Ajoute un guerrier novice à la liste des guerriers novices du château.
     * @param guerrier le guerrier novice à ajouter.
     */
    public void ajouterGuerrierNovice(Guerrier guerrier) {
        guerriersNovices.add(guerrier);
    }

    /**
     * Renvoie la liste ordonnée des guerriers novices du château.
     * @return la liste ordonnée des guerriers novices du château.
     */
    public Collection<Guerrier> getGuerriersNovices() {
        return guerriersNovices;
    }


    /**
     * Incrémente les ressources du château du nombre de ressources ajoutées par tour, à partir de la constante RESSOURCES_AJOUTEE_PAR_TOUR;
     */
    private void incrementerRessources() {
        ressources += RESSOURCES_AJOUTEE_PAR_TOUR;
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
