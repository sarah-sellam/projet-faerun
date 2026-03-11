package tp1;
import java.util.Scanner;

/**
 * Classe TestString
 * @author Sarah Sellam
 */
public class TestString {
    public static void main(String[] args) {

        Scanner entree = new Scanner(System.in);    // Déclarer une variable entree de type Scanner
        String maChaine;                            // Déclarer une variable maChaine de type String (chaîne de caractères)
        String deuxiemeChaine;                      // Déclarer une variable deuxiemeChaine de type String initialisée par lecture sur entree.


        System.out.println("Donner une chaîne de caractères (maChaine) : ");
        maChaine = entree.nextLine();           // maChaine de type String (chaîne de caractères) initialisée par lecture sur entree.
        //System.out.println(maChaine);         // Afficher la valeur de maChaine dans la console Java avec : System.out.println(...);.

        System.out.println("1. Nombre de caractères de la chaîne de caractères maChaine : " + maChaine.length());   // Afficher le nombre de caractères dans la chaîne maChaine.
        System.out.println("2. La chaîne de caractères maChaine en majuscule : " + maChaine.toUpperCase());         // Afficher maChaine en majuscules.


        //Contrôler que deux chaînes sont identiques sans tenir compte de la casse.
        System.out.println("3. Donner une deuxieme chaîne de caractères (deuxiemeChaine) : ");
        deuxiemeChaine = entree.nextLine();         // maChaine de type String (chaîne de caractères) initialisée par lecture sur entree.
        //System.out.println(deuxiemeChaine);       // Afficher la valeur de deuxiemeChaine dans la console Java avec : System.out.println(...);.

        if (maChaine.compareToIgnoreCase(deuxiemeChaine)==0) {
            System.out.println("=> Les deux chaînes sont identiques - sans tenir compte de la casse.");     // si les chaînes sont égales
        } else {
            System.out.println("=> Les deux chaînes sont différentes - sans tenir compte de la casse.");    // sinon (=si les chaînes NE sont PAS égales)
        }


        // Contrôler que maChaine est en minuscules (en affichant un message approprié selon la situation).
        if (maChaine.compareTo(maChaine.toLowerCase())==0) {
            System.out.println("4. La chaîne de caractères maChaine est en minuscule.");        // si maChaine est en minuscule (trouvé par comparaison entre maChaine en minusucles et maChaine)
        } else {
            System.out.println("4. La chaîne de caractères maChaine n'est en pas minuscule.");  // sinon (= si au moins un caractère de maChaine n'est pas en minuscule)
        }


        // Afficher maChaine entièrement en majuscules à laquelle on aura enlevé les éventuels blancs au début et à la fin.
        // -> trim() retire les espaces en début et en fin de maChaine et toUpperCase() met le résultat en majuscules
        System.out.println("5. La chaîne de caractères maChaine en majuscule sans les 'blancs' en début et fin de chaîne : " + maChaine.trim().toUpperCase());

        StringBuilder maChaineSB = new StringBuilder(maChaine);         // Déclarer une variable maChaineSB de type StringBuilder à partir du String maChaine

        StringBuilder maChaineAlEnvers = new StringBuilder(maChaine);   // Déclarer une variable maChaineAlEnvers de type StringBuilder à partir du String maChaine
        maChaineAlEnvers = maChaineAlEnvers.reverse();                  // Inverser l'ordre des caractères de maChaine (maChaine à l'envers)

        if (maChaineSB.compareTo(maChaineAlEnvers)==0) {
            System.out.println("6. La chaîne de caractères maChaine est un palindrome.");           // si maChaine est un palindrome (trouvé par comparaison entre maChaineSB et maChaineAlEnvers)
        } else {
            System.out.println("6. La chaîne de caractères maChaine n'est pas un palindrome.");     // sinon (= si maChaine N'est PAS un palindrome)
        }


    }
}
