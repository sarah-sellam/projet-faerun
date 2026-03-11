package tp1.forme;

/**
 * Classe TestCercle de test de la classe Cercle
 * @author Sarah Sellam
 */
public class TestCercle {
    /**
     * Méthode principale
     * @param args  arguments
     */
    public static void main(String[] args) {
        // Créer un point
        Point point = new Point(0,2);
        // Créer 2 cercles avec le même point pour centre
        Cercle cercle = new Cercle(10, point);
        Cercle cercle2 = new Cercle(2, point);
        // Afficher le point et les 2 cercles
        FormeUtilitaire.affichePoint(point);
        FormeUtilitaire.afficheCercle(cercle);
        FormeUtilitaire.afficheCercle(cercle2);
        // Déplacer un cercle
        System.out.println("On déplace le point de dX=10 et dY=4");
        cercle.deplaceCentre(10,4);
        // Afficher le point et les 2 cercles
        FormeUtilitaire.affichePoint(point);
        FormeUtilitaire.afficheCercle(cercle);
        FormeUtilitaire.afficheCercle(cercle2);
    }
}
