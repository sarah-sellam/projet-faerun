package exercice1;

public class CarteUtilitaire {
    
    
    /**
     * Affiche la carte sur le terminal
     * 
     * @param carte 
     */
    public static void printCarte(Carte carte) {
        
        // Afficher les menus
        for (MenuDeBase m : carte.getMenus()) {
            System.out.println(m.getDescription());
        }
        // Afficher les entrées

        // Afficher les plats
        // A COMPLETER
        
        // Afficher les desserts
        // A COMPLETER
    }
    
    
    /**
     * 
     * Cette méthode renvoie l'entier le plus proche supérieur ou égal à l'argument
     * 
     * NE PAS MODIFIER
     * 
     * @param valeur
     * @return entier le plus proche supérieur ou égal à l'argument
     */
    public static double arrondi(double valeur) {
        return Math.ceil(valeur);
    }

    /**
     * Transforme la chaine de caractères passée en paramètre :
     * - Première lettre en majuscule
     * - Le reste en minuscule
     *
     * @param chaine de caractères
     *
     * @return chaine premier caractère majuscule suivi de minuscule
     */
    public static String capitalize(String chaine) {
        return chaine.substring(0,1).toUpperCase() + chaine.substring(1,chaine.length()).toLowerCase();
    }
}
