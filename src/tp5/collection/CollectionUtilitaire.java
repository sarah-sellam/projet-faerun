package tp5.collection;

import java.util.Collection;
import java.util.Iterator;

/**
 * Classe CollectionUtilitaire
 *
 */
public class CollectionUtilitaire {

    public static void afficheCollection(String message, Collection<Integer> collection) {
        System.out.println(message);
        for (int i = 0 ; i < collection.size() ; i++) {
            System.out.println(collection.stream().toList().get(i));
        }
    }


}
