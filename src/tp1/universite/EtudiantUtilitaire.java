package tp1.universite;

import java.util.Arrays;

/**
 * Classe EtudiantUtilitaire, classe utilitaire
 * @author Sarah Sellam
 */
public class EtudiantUtilitaire {

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

    /**
     * Affiche les informations de l'étudiant : son login, son nom complet, son mail,
     * son groupe (s'il en a un, sinon "aucun"),
     * son adresse (s'il en a une, sinon "aucune"),
     * sa moyenne (s'il en a des notes, sinon "aucune"),
     * son nombre de notes et ses notes (s'il en a).
     *
     * @param etudiant  l'étudiant
     */
    public static void affiche(Etudiant etudiant) {
        System.out.println("----------");
        System.out.println("Login : " + etudiant.getLogin());
        System.out.println("Nom complet : " + etudiant.getNomComplet());
        System.out.println("Mail : " + etudiant.getMail());

        System.out.print("Groupe : ");
        if (etudiant.existGroupe()) {
            System.out.println(etudiant.getGroupe().getLibelle());
        } else {
            System.out.println("aucun");
        }

        System.out.print("Adresse : ");
        if (etudiant.existAdresse()) {
            System.out.println(etudiant.getAdresse());
        } else {
            System.out.println("aucune");
        }

        System.out.print("Moyenne : ");
        if (etudiant.getMoyenne()==-1 ) {
            System.out.println("aucune note");
        } else {
            System.out.println(etudiant.getMoyenne());
            System.out.print(etudiant.getNbNotes() + " notes : ");
            for (int i=0 ; i< etudiant.getNbNotes() ; i++) {
                System.out.print(etudiant.getNotes()[i] + " ");
            }
        }


    }

}
