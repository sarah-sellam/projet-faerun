package tp2.contrainte;

import java.sql.SQLOutput;

/**
 * Classe TestContrainte
 * @autor Sarah Sellam
 */
public class TestContrainte {
    public static void main(String[] args) {
        // Test de la classe ReelContraint
        System.out.println("Tests de la classe ReelContraint : ");
        System.out.println();

        ReelContraint R1 = new ReelContraint(0,100);
        System.out.println(R1);

        // test avec valeur intermédiaire
        System.out.print("On essaie de changer la valeur à 50 : ");
        R1.setValeur(50);
        System.out.println(R1);

        // test avec valeur max
        System.out.print("On essaie de changer la valeur à 100 : ");
        R1.setValeur(100);
        System.out.println(R1);

        // test avec valeur min
        System.out.print("On essaie de changer la valeur à 0 : ");
        R1.setValeur(0);
        System.out.println(R1);

        // tests avec valeur en dehors de l'intervalle
        // valeur supérieure
        System.out.print("On essaie de changer la valeur à 110 : ");
        R1.setValeur(110);
        System.out.println(R1);
        // valeur inférieure
        System.out.print("On essaie de changer la valeur à -1 : ");
        R1.setValeur(-1);
        System.out.println(R1);

        System.out.println();



        System.out.println("===============================================================");
        System.out.println("Tests de la méthode saisir de la classe ContrainteUtilitaire : ");
        System.out.println();

        // Tests de la méthode saisir
        ReelContraint R2 = ContrainteUtilitaire.saisir(21,36);
        System.out.println(R2);

        ReelContraint R3 = ContrainteUtilitaire.saisir(7,18);
        System.out.println(R3);

        System.out.println();




        System.out.println("===============================================================");
        System.out.println("Tests de la classe Note : ");
        System.out.println();

        //test du constructeur sans paramètre
        Note N1 = new Note();
        System.out.println("Note n°1 : " + N1.getValeur());
        System.out.println(N1);

        System.out.print("On essaie de changer la valeur à 19 : ");
        N1.setValeur(19);
        System.out.println("Note n°1 : " + N1.getValeur());


        // test avec une valeur supérieure à la valeur max (20)
        System.out.print("On essaie de changer la valeur à 23 : ");
        N1.setValeur(23);
        System.out.println("Note n°1 : " + N1.getValeur());

        // test avec une valeur inférieure à la valeur min (0)
        System.out.print("On essaie de changer la valeur à -5 : ");
        N1.setValeur(-5);
        System.out.println("Note n°1 : " + N1.getValeur());

        System.out.println();

        //test du constructeur avec valeur dans l'intervalle [0,20]
        Note N2 = new Note(17);
        System.out.println("Note n°2 : " + N2.getValeur());
        System.out.println(N2);

        //test du constructeur avec des valeurs en dehors de l'intervalle [0,20]
        // valeur supérieure
        Note N3 = new Note(32);
        System.out.println("Note n°3 : " + N3.getValeur());
        System.out.println(N3);

        // valeur inférieure
        Note N4 = new Note(-3);
        System.out.println("Note n°4 : " + N4.getValeur());
        System.out.println(N4);


    }

}
