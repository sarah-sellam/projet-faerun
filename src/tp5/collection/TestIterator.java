package tp5.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe TestIterator
 */
public class TestIterator {
    /**
     * Méthode principale
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        // Création d'une liste d'entiers
        ArrayList<Integer> premiereListeDEntiers = new ArrayList<>();
        premiereListeDEntiers.add(5);
        premiereListeDEntiers.add(1);
        premiereListeDEntiers.add(10);
        premiereListeDEntiers.add(3);
        premiereListeDEntiers.add(20);
        premiereListeDEntiers.add(5);

        // Création d'une deuxième liste d'entiers
        ArrayList<Integer> deuxiemeListeDEntiers = new ArrayList<>(premiereListeDEntiers);

        // Affichage de la première liste d'entiers
        CollectionUtilitaire.afficheCollection("Première liste d'entiers :", premiereListeDEntiers);

        // Enlever les entiers inferieurs à 10 dans la 1ère liste d'entiers en utilisant un FOR
        for (int i = 0; i < premiereListeDEntiers.size(); i++) {
            if (premiereListeDEntiers.get(i) < 10) {
                premiereListeDEntiers.remove(i);
            }
        }

        // Affichage de la liste première d'entiers après filtre
        CollectionUtilitaire.afficheCollection("Première liste d'entiers après filtre :", premiereListeDEntiers);

        // Affichage de la deuxième liste d'entiers
        CollectionUtilitaire.afficheCollection("Deuxième liste d'entiers :", deuxiemeListeDEntiers);

        // Enlever les entiers inferieurs à 10 dans la 2ème liste d'entiers en utilisant un WHILE
        int j = 0;
        while (j < deuxiemeListeDEntiers.size()) {
            if (deuxiemeListeDEntiers.get(j) < 10) {
                deuxiemeListeDEntiers.remove(j);
            }
            j++;
        }

        // Affichage de la 2ème liste d'entiers après filtre
        CollectionUtilitaire.afficheCollection("Deuxième liste d'entiers après filtre :", deuxiemeListeDEntiers);




        // Création d'une troisième liste d'entiers
        ArrayList<Integer> troisiemeListeDEntiers = new ArrayList<>(premiereListeDEntiers);

        // Affichage de la troisième liste d'entiers
        CollectionUtilitaire.afficheCollection("Troisème liste d'entiers :", troisiemeListeDEntiers);

        // Enlever les entiers inférieurs à 10 dans la troisième liste d’entiers en parcourant son iterator
        // version while
        Iterator itr = troisiemeListeDEntiers.iterator();
        while(itr.hasNext()) {
            Integer a = (Integer) itr.next();

        }

        // version for
        for (Iterator i = troisiemeListeDEntiers.iterator(); i.hasNext(); ) {
            if (!cond(i.next()))
                i.remove();
        }

        // Affichage de la 3ème liste d'entiers après filtre
        CollectionUtilitaire.afficheCollection("Troisième liste d'entiers après filtre avec un ITERATOR :", troisiemeListeDEntiers);





    }

}
