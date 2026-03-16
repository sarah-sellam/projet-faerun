package tp5.tabledemultiplication;

import java.util.Scanner;

public class TestTableDeMultiplication {
    public static void main(String[] args) throws ErreurMultiplicationException {
        Scanner lecteur = new Scanner(System.in);
        int nb;
        int mode;
        boolean estMelange;

        // Demande d'un nombre entre 1 et 10
        System.out.print("Donner un nombre pour la table de multiplication entre 1 et 10 : ");
        nb = lecteur.nextInt();
        lecteur.nextLine();

        // Redemande si le nombre entré par l'utilisateur n'est pas compris entre 1 et 10
        while (nb > 10 || nb < 1) {
            System.out.print("Merci de répondre entre 1 et 10 ? ");
            nb = lecteur.nextInt();
            lecteur.nextLine();
        }


        // Choix entre entrainement et exercice
        System.out.print("Entrainement 1 ou exercice 2 ? ");
        mode = lecteur.nextInt();
        lecteur.nextLine();

        // Redemande si le nombre entré par l'utilisateur n'est pas compris entre 1 et 10
        while (mode != 1 && mode != 2) {
            System.out.print("Merci de répondre par 1 ou 2 ? ");
            mode = lecteur.nextInt();
            lecteur.nextLine();
        }

        // Création de la table selon le mode

        if (mode==1) {
            estMelange = false;
        } else {
            estMelange = true;
        }

        TableDeMultiplication table = new TableDeMultiplication(nb,estMelange);

        // Affichage questions sur la table
        System.out.println("Donner les réponses aux multiplications :");
        for( int i = 0 ; i < table.getNombreDeMultiplications() ; i++) {
            System.out.print(table.getMultiplication(i).toString());
            int reponse = lecteur.nextInt();
            table.getMultiplication(i).setReponseUtilisateur(reponse);
        }
        // affichage du résultat
        System.out.print("Nombre de réponses justes : " + table.getNombreReponsesJustes());

    }
}
