package tp5.dalton;

import java.util.Comparator;

/**
 * Classe ComparateurNom, de comparaison sur le nom.
 * @author Sarah Sellam
 */
public class ComparateurNom implements Comparator<Dalton> {
    /**
     * Redéfinition de la comparaison entre 2 daltons par nom.
     * @param d1    dalton 1
     * @param d2    dalton 2
     * @return  -1 si le nom de d1 est avant celui de d2 lexicographiquement,
     *          0 si ils ont le même nom,
     *          1 dans tous les autres cas (le nom de d1 est après celui de d2 lexicographiquement).
     */
    @Override
    public int compare(Dalton d1, Dalton d2) {
        if (d1.getNom().compareTo(d2.getNom()) < 0) {
            return -1;
        } else if (d1.getNom().compareTo(d2.getNom()) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

}
