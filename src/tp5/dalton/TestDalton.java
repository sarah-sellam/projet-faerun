package tp5.dalton;

import java.util.TreeSet;

import static tp5.collection.CollectionUtilitaire.afficheCollection;

/**
 * Classe TestDalton, de test des classes Dalton, Taille, ComparateurNom et ComparateurTaille.
 * @author Sarah Sellam
 */
public class TestDalton {

    /**
     * procédure principale
     * @param args  arguments
     */
    public static void main(String[] args) {
        // Création des Daltons
        Dalton joe = new Dalton("Joe", Taille.PETIT);
        Dalton jack = new Dalton("Jack", Taille.MOYEN);
        Dalton william = new Dalton("William", Taille.MOYEN);
        Dalton averell = new Dalton("Averell", Taille.GRAND);

        // Faire un ensemble triés des daltons sur l'ordre naturel (compareTo)
        TreeSet<Dalton> lesDaltons = new TreeSet<Dalton>();
        lesDaltons.add(averell);
        lesDaltons.add(joe);
        lesDaltons.add(william);
        lesDaltons.add(jack);

        // Affichage
        afficheCollection("Les daltons triés par ordre naturel (compareTo) :", lesDaltons);

        // Faire un ensemble triés des daltons avec le comparateur de Taille (Solution 1)
        TreeSet<Dalton> lesDaltonsTaille = new TreeSet<Dalton>(new ComparateurTaille());
        lesDaltonsTaille.addAll(lesDaltons);

        // Affichage
        // (ATTENTION : On a 2 daltons avec la même taille, donc un des 2 daltons ne sera pas conservé,
        //   vu que les doublons ne sont pas autorisés dans un `Set` (ensemble))
        afficheCollection("Les daltons triés par taille :", lesDaltonsTaille);

        // Faire un ensemble triés des daltons avec le comparateur de Nom (Solution 1)
        TreeSet<Dalton> lesDaltonsNom = new TreeSet<Dalton>(new ComparateurNom());
        lesDaltonsNom.addAll(lesDaltons);

        // Affichage
        afficheCollection("Les daltons triés par nom (Solution 1 du Cours 3) :", lesDaltonsNom);

        // Faire un ensemble triés des daltons avec le comparateur de Nom (Solution 2)
        TreeSet<Dalton> lesDaltonsNom2 = new TreeSet<Dalton>(Dalton.comparateurNomSolution2);
        lesDaltonsNom2.addAll(lesDaltons);

        // Affichage
        afficheCollection("Les daltons triés par nom (Solution 2 du Cours 3) :", lesDaltonsNom2);

    }
}
