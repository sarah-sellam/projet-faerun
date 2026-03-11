package tp4;

public class ArticleUtilitaire {

    /**
     * Retourne une chaine de caractère avec le premier caractère en majuscule et les autres en minuscule.
     *
     * @param chaine     la chaine à modifier
     * @return la chaine de caractère chaine avec le premier caractère en majuscule et les autres en minuscule
     */
    public static String capitalize(String chaine) {
        if (chaine.isEmpty()) {
            return chaine;          // si la chaine est vide, on la retourne directement
        } else {
            return chaine.substring(0,1).toUpperCase() + chaine.substring(1).toLowerCase();   //sinon on met le premier caractère de chaine chaine.substring(0,1) en majuscule avec .toUpperCase()
            // et on le concatène avec le reste de la chaine chaine.substring(1) en minuscule
        }
    }




}
