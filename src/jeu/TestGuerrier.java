package jeu;

public class TestGuerrier {
    public static void main(String[] args) {

        // création de 2 objets de type Guerrier
        Guerrier guerrier1 = new Guerrier();
        Guerrier guerrier2 = new Guerrier();

        // attaque du guerrier 1 sur le guerrier 2
        guerrier1.attaquer(guerrier2);

        // affichage de l'état du guerrier 2
        GuerrierUtilitaire.prixUnite(guerrier2);

        // itération simulant un combat entre ces 2 guerriers
        // arrêt de l'itération étant provoqué par la mort de l'un des 2 guerriers.
        // affichage de l'état des guerriers à chaque tour de l'itération

        while (guerrier1.estVivant() && guerrier2.estVivant()) {

        }


    }
}
