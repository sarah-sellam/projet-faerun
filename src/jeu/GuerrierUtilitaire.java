package jeu;

public class GuerrierUtilitaire {

    public static void prixUnite(Guerrier unite) {
        System.out.println("Points de vie : " + unite.getPointsDeVie() );
    }

    public static int de3() {
        return 1 + (int)(Math.random() * (4 - 1) );
    }

    public static int de3(int nbLancers) {
        int somme = 0;
        for (int i = 0 ; i < nbLancers ; i++) {
            somme += de3();
        }
        return somme;
    }
}
