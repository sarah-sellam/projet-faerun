package jeu;

import java.util.Collection;

/**
 * Classe TestEtape3, classe de test des classes Guerrier, Nain, ChefNain, Elfe, ChefElfe et Chateau.
 * @author Sarah Sellam
 */
public class TestEtape3 {
    /**
     * procédure principale
     * @param args  arguments
     */
    public static void main(String[] args) {

//        Guerrier nain = new Nain();
//        nain.getCouleur();
        // Château avec 3 ressources initiales
        Chateau chateau = new Chateau(Couleur.BLEU);

        // Ajout de guerriers novices : Nain(1), Nain(1), Elfe(2), Elfe(2)
        chateau.ajoutGuerrierNovice(new Nain());
        chateau.ajoutGuerrierNovice(new Nain());
        chateau.ajoutGuerrierNovice(new Elfe());
        chateau.ajoutGuerrierNovice(new Elfe());

        // Tour 1 : 3 ressources disponibles
        // Attendu : 2 nains entraînés + 1 ressource dépensée sur le 1er elfe
        Collection<Guerrier> entraines = chateau.entrainer();
        System.out.println("Tour 1 - guerriers entraînés : " + entraines.size());
        System.out.println("Attendu : 2");
        System.out.println("Novices restants : " + chateau.getGuerriersNovices().size());
        System.out.println("Attendu : 2");
        System.out.println();

        // Tour 2 : récupère 1 ressource → 1 disponible
        // Attendu : 1er elfe complété (manquait 1 ressource) = 1 elfe entraîné
        entraines = chateau.entrainer();
        System.out.println("Tour 2 - guerriers entraînés : " + entraines.size());
        System.out.println("Attendu : 1");
        System.out.println("Novices restants : " + chateau.getGuerriersNovices().size());
        System.out.println("Attendu : 1");
        System.out.println();

        // Tour 3 : récupère 1 ressource → 1 disponible
        // Attendu : 0 elfe entraîné (manque encore 1 ressource pour le 2ème elfe)
        entraines = chateau.entrainer();
        System.out.println("Tour 3 - guerriers entraînés : " + entraines.size());
        System.out.println("Attendu : 0");
        System.out.println("Novices restants : " + chateau.getGuerriersNovices().size());
        System.out.println("Attendu : 1");

    }
}
