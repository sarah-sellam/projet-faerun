package jeu;

import java.util.Scanner;

/**
 * La classe TestGuerrier, classe de test des classes Guerrier et GuerrierUtilitaire.
 *
 * @author Sarah Sellam
 */
public class TestGuerrier {
    /**
     * Procédure principale.
     * @param args  arguments
     */
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);

        // création de 2 objets de type Guerrier
        Guerrier guerrier1 = new Guerrier();
        Guerrier guerrier2 = new Guerrier();

        // attaque du guerrier 1 sur le guerrier 2
        guerrier1.attaquer(guerrier2);

        // affichage de l'état du guerrier 2
        GuerrierUtilitaire.printUnite(guerrier2);



        //======================================================================
        // Simulation d'un combat entre 2 guerriers

        System.out.println("===========================================");
        System.out.println("Simulation d'un combat entre 2 guerriers : ");
        System.out.println();

        // définition du tour
        int tour = 1;

        // itération simulant un combat entre ces 2 guerriers
        // l'arrêt de l'itération étant provoqué par la mort de l'un des 2 guerriers.
        while (guerrier1.estVivant() && guerrier2.estVivant()) {
            System.out.println("TOUR N°" + tour + " : ");
            System.out.println();

            // affichage de l'état initial de guerriers au début de chaque tour
            System.out.println("Etat inital des guerriers : ");
            System.out.print("Guerrier 1 - ");
            GuerrierUtilitaire.printUnite(guerrier1);
            System.out.print("Guerrier 2 - ");
            GuerrierUtilitaire.printUnite(guerrier2);
            System.out.println();

            // combat : attaques chacun son tour
            if (tour % 2 != 0) {
                System.out.println("Le guerrier 2 attaque le guerrier 1 !");
                System.out.println();
                guerrier2.attaquer(guerrier1);
            } else {
                System.out.println("Le guerrier 1 attaque le guerrier 2 !");
                System.out.println();
                guerrier1.attaquer(guerrier2);
            }

            // affichage de l'état des guerriers à chaque tour de l'itération
            System.out.println("Etat des guerriers à la fin du tour :");
            System.out.println("Guerrier 1 : ");
            GuerrierUtilitaire.printUnite(guerrier1);
            System.out.println("Guerrier 2 : ");
            GuerrierUtilitaire.printUnite(guerrier2);
            System.out.println("-------------------------------------------");

            tour++;
        }

    }
}
