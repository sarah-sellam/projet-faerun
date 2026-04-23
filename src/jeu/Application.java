package jeu;

import java.util.Collection;
import java.util.Scanner;

/**
 * Classe Application, contenant le moteur de jeu : itération comportant les tours de jeu jusqu’à la victoire d’un des joueurs.
 * @author Sarah Sellam
 * */
public class Application {
    /**
     * procédure principale
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Plateau plateau = new Plateau(5);

        Chateau chateauBleu = new Chateau(Couleur.BLEU);
        Chateau chateauRouge = new Chateau(Couleur.ROUGE);

        chateauBleu.ajoutGuerrierNovice(new Nain());
        chateauBleu.ajoutGuerrierNovice(new Elfe());
        chateauBleu.ajoutGuerrierNovice(new ChefNain());

        chateauRouge.ajoutGuerrierNovice(new Nain());
        chateauRouge.ajoutGuerrierNovice(new Elfe());
        chateauRouge.ajoutGuerrierNovice(new ChefElfe());

        int tour = 1;
        while (!plateau.estPartieTerminee()) {
            System.out.println("--------------------------------------");
            System.out.println("TOUR N°" + tour + " : ");

            System.out.println("* Entraînement des bleus : ");
            Collection<Guerrier> entrenesBleus = chateauBleu.entrainer();
            System.out.println();
            System.out.println("* Entraînement des rouges : ");
            Collection<Guerrier> entrenesRouges = chateauRouge.entrainer();

            // ajout des guerriers entraînés sur le plateau
            plateau.ajoutGuerriers(chateauBleu, entrenesBleus.toArray(new Guerrier[0]));
            plateau.ajoutGuerriers(chateauRouge, entrenesRouges.toArray(new Guerrier[0]));

            System.out.println("* Déplacement des guerriers");
            plateau.deplaceGuerriers();

            System.out.println("* Combat");
            plateau.lanceCombat();

            tour++;
        }
        System.out.println("==========================================");
        System.out.println("FIN DE PARTIE");
        System.out.println("Gagnant : " + plateau.getGagnant());
    }
}
