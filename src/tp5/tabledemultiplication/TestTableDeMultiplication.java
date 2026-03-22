package tp5.tabledemultiplication;

import java.util.Scanner;


/**
 * Classe TestTabledeMultiplication, classe de test des classes Multiplication et TableDeMultiplication.
 * @author Sarah Sellam
 */
public class TestTableDeMultiplication {
    private static Scanner entree = new Scanner(System.in);

    /**
     * Demande une réponse d'une table de multiplication à l'utilisateur ;
     * Lève une exception et envoie un message si la réponse donnée n'est pas bonne
     * @param multiplication    multiplication dont on demande la réponse
     */
    private static void demandeReponseUtilisateur(Multiplication multiplication){
        // Affichage de la multiplication
        // (Cela appellera automatiquement la méthode toString() sur l'objet)
        do {
            System.out.print(multiplication);
            // Demander la réponse utilisateur
            int reponseUtilisateur = entree.nextInt();
            entree.nextLine();

            // Enregistrer la réponse utilisateur
            // Mode sans erreur : attraper l'exception si la réponse de l'utilisateur
            //  n'est pas la bonne et redemander la reponse utilisateur.
            // À COMPLETER...
            try {
                multiplication.setReponseUtilisateur(reponseUtilisateur);
            } catch (ErreurMultiplicationException e) {
                System.out.println(e.getMessage());
            }
        } while(!multiplication.isReponseJuste());
    }


    /**
     * procédure principale
     * @param args  arguments
     * @throws ErreurMultiplicationException    exception sur Multiplication
     */
    public static void main(String[] args) throws ErreurMultiplicationException {

        int nb;
        int modeEntOuExo;
        boolean modeSansErreur;
        boolean estMelange;

        // Demande d'un nombre entre 1 et 10
        System.out.print("Donner un nombre pour la table de multiplication entre 1 et 10 : ");
        nb = entree.nextInt();
        entree.nextLine();

        // Redemande si le nombre entré par l'utilisateur n'est pas compris entre 1 et 10
        while (nb > 10 || nb < 1) {
            System.out.print("Merci de répondre entre 1 et 10 ? ");
            nb = entree.nextInt();
            entree.nextLine();
        }


        // Choix entre entrainement et exercice
        System.out.print("Entrainement 1 ou exercice 2 ? ");
        modeEntOuExo = entree.nextInt();
        entree.nextLine();

        // Redemande si le nombre entré par l'utilisateur n'est pas compris entre 1 et 10
        while (modeEntOuExo != 1 && modeEntOuExo != 2) {
            System.out.print("Merci de répondre par 1 ou 2 ? ");
            modeEntOuExo = entree.nextInt();
            entree.nextLine();
        }

        // Création de la table selon le mode
        if (modeEntOuExo==2) {
            estMelange = true;
        } else {
            estMelange = false;
        }

        // Choix entre mode avec ou sans erreur
        System.out.print("Mode sans erreur true ou false ? ");
        modeSansErreur = entree.nextBoolean();
        entree.nextLine();


        TableDeMultiplication table = new TableDeMultiplication(nb,estMelange, modeSansErreur);

        // Affichage questions sur la table
        System.out.println("Donner les réponses aux multiplications :");
        for( int i = 0 ; i < table.getNombreDeMultiplications() ; i++) {
//            System.out.print(table.getMultiplication(i).toString());
//            int reponse = lecteur.nextInt();
//            table.getMultiplication(i).setReponseUtilisateur(reponse);

            demandeReponseUtilisateur(table.getMultiplication(i));

        }
        // affichage du résultat
        if(!modeSansErreur) {
            System.out.print("Nombre de réponses justes : " + table.getNombreReponsesJustes());
        }

    }
}
