package tp3.billeterie;

import java.util.ArrayList;

/**
 * Classe TestBillet, classe de test des classes Billet, BilletReduit et Trajet.
 * @author Sarah Sellam
 */
public class TestBillet {
    /**
     * procédure principale
     * @param args  arguments
     */
    public static void main(String[] args) {
        // Creation d'une liste de trajets
        ArrayList<Trajet> trajets = new ArrayList<>();

        // Creation de trajets
        Trajet t1, t2, t3;
        t1 = new Trajet("Paris", "Grenoble", 576);
        t2 = new Trajet("Grenoble", "Marseille", 307);
        t3 = new Trajet("Grenoble", "Voreppe", 16);

        // Ajout des trajets dans la liste
        trajets.add(t1);
        trajets.add(t2);
        trajets.add(t3);

        // Affichage des trajets
        BilletUtilitaire.afficheTrajets(trajets);


        System.out.println();


        // Creation d'une liste de billets
        ArrayList<Billet> billets = new ArrayList<>();

        // Creation de billets "normaux"
        Billet b1, b2, b3;
        b1 = new Billet(t1, 0.53);
        b2 = new Billet(t2, 0.43);
        b3 = new Billet(t3, 0.82);

        // Ajout des billets "normaux" dans la liste de billets
        billets.add(b1);
        billets.add(b2);
        billets.add(b3);

        // Affichage de la liste de billets
        BilletUtilitaire.afficheBillets(billets);


        System.out.println();


        // Creation de billets réduits
        BilletReduit br1, br2, br3;
        br1 = new BilletReduit(t1, 0.53, .2);
        br2 = new BilletReduit(t2, 0.43, .3);
        br3 = new BilletReduit(t3, 0.82, .4);

        // Ajout des billets réduits dans la liste de billets
        billets.add(br1);
        billets.add(br2);
        billets.add(br3);

        // Affichage de la liste de billets
        // (Le mécanisme de polymorphisme s’applique ici !)
        // => Vérifiez bien le prix pour chaque billet normal ou réduit !
        BilletUtilitaire.afficheBillets(billets);



    }
}
