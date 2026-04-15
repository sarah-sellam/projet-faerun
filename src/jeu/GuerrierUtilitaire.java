package jeu;

/**
 * La classe GuerrierUtilitaire, classe utilitaire.
 * Toutes les méthodes sont statiques et cette classe n'est pas destinée à être instanciée.
 *
 * @author Sarah Sellam
 */
public class GuerrierUtilitaire {

    /**
     * Affiche le nombre de points de vie de l’unité (du guerrier) passé en paramètre.
     *
     * @param unite guerrier dont on veut connaître le nombre de points de vie.
     */
    public static void prixUnite(Guerrier unite) {
        System.out.println("Points de vie : " + unite.getPointsDeVie() );
    }

    /**
     * Renvoie un entier entre 1 et 3, représentant la valeur obtenu suite au lancer d’un "dé de 3" (dé à 3 faces).
     *
     * @return  une valeur entre 1 et 3 compris.
     */
    public static int de3() {
        return 1 + (int)(Math.random() * (4 - 1) );
    }

    /**
     * Renvoie la somme des valeurs obtenues suite à un certain nombre de lancers (nbLancers, donné en paramètre) d'un "dé de 3" (dé à 3 faces).
     *
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
}
