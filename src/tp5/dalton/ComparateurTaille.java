package tp5.dalton;

import java.util.Comparator;

/**
 * Classe ComparateurTaille, de comparaison sur la taille.
 * @author Sarah Sellam
 */
public class ComparateurTaille implements Comparator<Dalton> {
    /**
     * Redéfinition de la comparaison entre 2 daltons par taille.
     * @param d1    dalton 1
     * @param d2    dalton 2
     * @return  -1 si la taille de d1 est avant celui de d2 lexicographiquement,
     *          0 si ils ont le même nom,
     *          1 dans tous les autres cas (le nom de d1 est après celui de d2 lexicographiquement).
     */
    @Override
    public int compare(Dalton d1, Dalton d2) {
        if (d1.getTaille() == d2.getTaille()) {
            return 0;
        } else if (d1.getTaille() == Taille.PETIT || d1.getTaille() == Taille.MOYEN && d2.getTaille() == Taille.GRAND ) {
            return 0;
        } else {
            return 1;
        }
    }
}
