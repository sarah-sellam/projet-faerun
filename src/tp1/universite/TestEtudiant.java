package tp1.universite;

/**
 * Classe TestEtudiant, de test des classes Etudiant et Groupe
 * @author Sarah Sellam
 */
public class TestEtudiant {

    /**
     * Méthode principale
     *
     * @param args arguments
     */
    public static void main(String[] args) {
//        String chaine = "sellams";
//        System.out.println(EtudiantUtilitaire.capitalize(chaine));

        // Création des étudiants
        // (IMPORTANT mettre des valeurs qui ne respectent pas les contraintes
        //    pour vérifier leur prise en compte)
        Etudiant etudiant1 = new Etudiant("DUPONTP", "pierre", "DUPONT");
        Etudiant etudiant2 = new Etudiant("martinf", "francis", "martin");
        //Etudiant etudiant3 = new Etudiant("SeLlAmS", "SaRaH", "sEllAM");


        // Définition d'une adresse pour l'etudiant2
        etudiant2.setAdresse("2 Place Doyen Gosse");

        // Ajouts de note pour l'étudiant 2
        etudiant2.addNote(8.5);
        etudiant2.addNote(10.0);
        etudiant2.addNote(11.5);

        //
        etudiant1.setGroupe(new Groupe("A"));

        // (TODO À compléter...)

        EtudiantUtilitaire.affiche(etudiant1);
        EtudiantUtilitaire.affiche(etudiant2);
        //EtudiantUtilitaire.affiche(etudiant3);


        // Test du principe d'encapsulation
        //etudiant1.login = "LOGIN_QUI_NE_RESPECTE_PAS_LA_CONTRAINTE";

    }
}
