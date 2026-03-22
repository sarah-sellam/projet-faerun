package tp3.billeterie;

import java.util.ArrayList;

/**
 * Classe Utilitaire
 * @author Sarah Sellam
 */
public class BilletUtilitaire {

    /**
     * Retourner le prix du billet arrondi à deux chiffres après la virgule.
     * @param prix   le prix du billet
     * @return le prix du billet arrondi à deux chiffres après la virgule
     */
    public static double arrondir(double prix) {
        return Math.round(prix*100)/100.0;
    }

    /**
     * Afficher les détails d'une liste de trajets (ArrayList de Trajets).
     * @param trajets    la liste de trajets
     */
    public static void afficheTrajets(ArrayList<Trajet> trajets) {
        System.out.println("  ----- Les trajets -----");
        for(int i=0 ; i<trajets.size() ; i++) {
            System.out.println(trajets.get(i));
        }
    }

    /**
     * Afficher les détails d'une liste de billets
     * @param billets   la liste de billets
     */
    public static void afficheBillets(ArrayList<Billet> billets) {
        System.out.println("  ----- Les billets -----");
        for (int i = 0 ; i < billets.size() ; i++) {
            System.out.println(billets.get(i));
        }
    }


}
