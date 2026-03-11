package tp2.universite;

public class UniversiteUtilitaire {

    public static void affichePersonne(Personne p) {
        System.out.println("----------");
        System.out.println("Login : " + p.getLogin());
        System.out.println("Nom complet : " + p.getNomComplet());
        System.out.println("Mail : " + p.getMail());

        System.out.print("Adresse : ");
        if (p.existAdresse()) {
            System.out.println(p.getAdresse());
        } else {
            System.out.println("aucune");
        }
    }

    public static void affichePersonnel(Personnel pl) {
        System.out.println("----------");
        System.out.println("Login : " + pl.getLogin());
        System.out.println("Nom complet : " + pl.getNomComplet());
        System.out.println("Mail : " + pl.getMail());

        System.out.print("Adresse : ");
        if (pl.existAdresse()) {
            System.out.println(pl.getAdresse());
        } else {
            System.out.println("aucune");
        }

        System.out.println("Echelon : " + pl.getEchelon());
        System.out.println("Point d'indice : " + pl.getPointDIndice());
        System.out.println("Salaire : " + pl.getSalaire());
    }

    //CREER AFFICHE ETUDIANT AVEC NOTES ET MOYENNE
}
