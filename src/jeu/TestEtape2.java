package jeu;

/**
 * Classe TestEtape2, classe de test des classes Guerrier, Nain, ChefNain, Elfe et ChefElfe.
 * @author Sarah Sellam
 */
public class TestEtape2 {
    /**
     * procédure principale.
     * @param args  arguments
     */
    public static void main(String[] args) {

        // création de guerriers de tous types
        Guerrier nain = new Nain();
        Guerrier chefNain = new ChefNain();
        Guerrier elfe = new Elfe();
        Guerrier chefElfe = new ChefElfe();


        // définition du tour
        int tour = 1;

        //========================================================================================
        // Simulation d'un combat entre un Nain et un Elfe
        System.out.println("==================================================");
        System.out.println("Simulation d'un combat entre un Nain et un Elfe : ");
        System.out.println();

        // affichage de l'état initial de guerriers avant le combat
        System.out.println("Etat inital des guerriers : ");
        GuerrierUtilitaire.printEtat(nain, "Nain");
        GuerrierUtilitaire.printEtat(elfe, "Elfe");
        System.out.println();

        // itération simulant un combat entre ces 2 guerriers
        // l'arrêt de l'itération étant provoqué par la mort de l'un des 2 guerriers.
        while (nain.estVivant() && elfe.estVivant()) {
            GuerrierUtilitaire.printCombatA2(nain,"Nain", elfe, "Elfe", tour);
            tour++;
        }



        // redéfinition du tour
        tour = 1;
        //========================================================================================
        // Simulation d'un combat entre un Chef Nain et un Chef Elfe
        System.out.println("============================================================");
        System.out.println("Simulation d'un combat entre un Chef Nain et un Chef Elfe : ");
        System.out.println();

        // affichage de l'état initial de guerriers avant le combat
        System.out.println("Etat inital des guerriers : ");
        GuerrierUtilitaire.printEtat(chefNain, "Chef Nain");
        GuerrierUtilitaire.printEtat(chefElfe, "Chef Elfe");
        System.out.println();

        // itération simulant un combat entre ces 2 guerriers
        // l'arrêt de l'itération étant provoqué par la mort de l'un des 2 guerriers.
        while (chefNain.estVivant() && chefElfe.estVivant()) {
            GuerrierUtilitaire.printCombatA2(chefNain,"Chef Nain", chefElfe, "Chef Elfe", tour);
            tour++;
        }



        // redéfinition du tour
        tour = 1;
        nain = new Nain();
        chefElfe = new ChefElfe();
        //========================================================================================
        // Simulation d'un combat entre un Nain et un Chef Elfe
        System.out.println("============================================================");
        System.out.println("Simulation d'un combat entre un Nain et un Chef Elfe : ");
        System.out.println();

        // affichage de l'état initial de guerriers avant le combat
        System.out.println("Etat inital des guerriers : ");
        GuerrierUtilitaire.printEtat(nain, "Nain");
        GuerrierUtilitaire.printEtat(chefElfe, "Chef Elfe");
        System.out.println();

        // itération simulant un combat entre ces 2 guerriers
        // l'arrêt de l'itération étant provoqué par la mort de l'un des 2 guerriers.
        while (nain.estVivant() && chefElfe.estVivant()) {
            GuerrierUtilitaire.printCombatA2(nain,"Nain", chefElfe, "Chef Elfe", tour);
            tour++;
        }


        // redéfinition du tour
        tour = 1;
        chefNain = new ChefNain();
        elfe = new Elfe();
        //========================================================================================
        // Simulation d'un combat entre un Chef Nain et un Elfe
        System.out.println("============================================================");
        System.out.println("Simulation d'un combat entre un Chef Nain et un Elfe : ");
        System.out.println();

        // affichage de l'état initial de guerriers avant le combat
        System.out.println("Etat inital des guerriers : ");
        GuerrierUtilitaire.printEtat(chefNain, "Chef Nain");
        GuerrierUtilitaire.printEtat(elfe, "Elfe");
        System.out.println();

        // itération simulant un combat entre ces 2 guerriers
        // l'arrêt de l'itération étant provoqué par la mort de l'un des 2 guerriers.
        while (chefNain.estVivant() && elfe.estVivant()) {
            GuerrierUtilitaire.printCombatA2(chefNain,"Chef Nain", elfe, "Elfe", tour);
            tour++;
        }



    }

}
