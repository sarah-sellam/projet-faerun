package tp2.contrainte;

import java.util.Scanner;

/**
 * Classe ContrainteUtilitaire
 * @autor Sarah Sellam
 */
public class ContrainteUtilitaire {

    /**
     *  Retourner un objet de type ReelContraint,
     *  dont la valeur est saisie par l’utilisateur
     *  et est comprise dans l’intervalle [min, max].
     *
     * @param min   le minimun
     * @param max   le maximum
     * @return R
     */
    public static ReelContraint saisir(double min, double max) {
        Scanner lecteur = new Scanner(System.in);
        double valeur;

        do {
            System.out.print("Entrez une valeur entre " + min + " et " + max + " : ");
            valeur = lecteur.nextDouble();
            if (valeur < min || valeur > max) {
                System.out.println("Valeur incorrecte, recommencez !");
            }
        } while (valeur < min || valeur > max);

        ReelContraint R = new ReelContraint(min, max);
        R.setValeur(valeur);
        return R;
    }
}
