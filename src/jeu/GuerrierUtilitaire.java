package jeu;

import java.util.Random;

/**
 * La classe utilitaire GuerrierUtilitaire : toutes les méthodes sont statiques et cette classe n'est pas destinée à être instanciée.
 * @author Sarah Sellam
 */
public class GuerrierUtilitaire {
    // Attribut contenant un objet de type random
    private static final Random RANDOM = new Random();

    /**
     * Affiche le nombre de points de vie de l’unité (du guerrier) passé en paramètre.
     * @param unite guerrier dont on veut connaître le nombre de points de vie.
     */
    public static void printUnite(Guerrier unite) {
        System.out.println("Points de vie : " + unite.getPointsDeVie() );
    }

    /**
     * Renvoie un entier entre 1 et 3, représentant la valeur obtenu suite au lancer d’un "dé de 3" (dé à 3 faces).
     * @return  une valeur entre 1 et 3 compris.
     */
    private static int de3() {
        return RANDOM.nextInt(3) + 1 ;
    }

    /**
     * Renvoie la somme des valeurs obtenues suite à un certain nombre de lancers (nbLancers, donné en paramètre) d'un "dé de 3" (dé à 3 faces).
     * @param nbLancers nombre de lancés du dé
     * @return  la somme des valeurs obtenues suite à un certain nombre de lancers d'un dé à 3 faces.
     */
    public static int de3(int nbLancers) {
        int somme = 0;
        for (int i = 0 ; i < nbLancers ; i++) {
            somme += de3();
        }
        return somme;
    }


    /**
     * Affiche l'état d'un guerrier : son type (Nain, Chef Nain, Elfe ou Chef Elfe), suivi de son nombre de points de vie.
     * @param guerrier  le guerrier
     * @param type      son type
     */
    public static void printEtat(Guerrier guerrier, String type) {
        System.out.print(type + " - ");
        GuerrierUtilitaire.printUnite(guerrier);
    }


    /**
     * Réalise une itération simulant un combat entre 2 guerriers passés en paramètres avec que leurs types respectifs (nain, chef nain, elfe ou chef elfe), tout en affichant de l'état des guerriers à chaque tour de l’itération, l’arrêt de l’itération étant provoqué par la mort de l’un des 2 guerriers.
     * @param guerrier1     premier guerrier participant au combat.
     * @param guerrier2     deuxième guerrier participant au combat.
     */
    public static void printCombatA2(Guerrier guerrier1, String type1, Guerrier guerrier2, String type2, int tour) {

        System.out.println("TOUR N°" + tour + " : ");
        System.out.println();

        // combat : attaques chacun son tour
        if (tour % 2 != 0) {
            System.out.println("Un " + type2 + " attaque un " + type1 + " !");
            System.out.println();
            guerrier2.attaquer(guerrier1);
        } else {
            System.out.println("Un " + type1 + " attaque un " + type2 + " !");
            System.out.println();
            guerrier1.attaquer(guerrier2);
        }
        // affichage de l'état des guerriers à chaque fin de tour de l'itération
        System.out.println("Etat des guerriers à la fin du tour :");
        GuerrierUtilitaire.printEtat(guerrier1, type1);
        GuerrierUtilitaire.printEtat(guerrier2, type2);
        System.out.println("-------------------------------------------");
    }

}
