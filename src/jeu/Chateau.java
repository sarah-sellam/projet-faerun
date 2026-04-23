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
     * Nombre de ressources déjà dépensées pour l'entraînement du guerrier novice en cours.
     */
    private int ressourcesEnCours = 0;

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
    public void ajoutGuerrierNovice(Guerrier guerrier) {
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
     * Retourne la liste des guerriers entrainés (0 ou plusieurs guerriers) en fonction des ressources disponibles dans la château à un instant i.
     * @return la liste des guerriers entrainés.
     */
    public Collection<Guerrier> entrainer() {

        incrementerRessources();                                     // on incrémente les ressources au début du tour
        ArrayList<Guerrier> guerriersEntraines = new ArrayList<>();     // on crée une liste de guerriers entrainés

        // tant qu'il y a des guerriers novices et (alors) qu'on a assez de ressources pour les entraîner
        while (!guerriersNovices.isEmpty() && ressources >0) {

            Guerrier guerrierAEntrainer = guerriersNovices.get(0);              // on récupère le premier guerrier de la liste
            int ressourcesNecessaires = guerrierAEntrainer.getRessourcesPourEntrainement();

            if (ressources >= ressourcesNecessaires) {
                ressources -= ressourcesNecessaires;
                ressourcesEnCours = 0;
                guerriersNovices.remove(0);             // on retire le guerrier entrainé de la liste des novices
                guerriersEntraines.add(guerrierAEntrainer);     // on l'ajoute à liste des guerriers entrainés
                System.out.println("Entrainement : OK (-" + ressourcesNecessaires + " ressource(s))");
            } else {
                System.out.println("Entrainement : PARTIEL (-" + ressources + " ressource(s))");
                ressourcesEnCours += ressources;
                ressources = 0;
            }

        }

        if (!guerriersNovices.isEmpty()) {
            System.out.println("Entrainement impossible pour le moment !");
        }

        System.out.println("Etat final : " + ressources + " ressources, "
                            + guerriersEntraines.size() + " guerriers entraînés, "
                            + guerriersNovices.size() + " novices restants.");

        return guerriersEntraines;
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
