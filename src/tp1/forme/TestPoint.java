package tp1.forme;

/**
 * Classe TestPoint
 * @author Sarah Sellam
 */
public class TestPoint {
    public static void main(String[] args) {
        // Créer un objet point1 de type Point
        //  avec le constructeur par défaut Point()
        Point point1 = new Point();
        // Créer un objet point2 de type Point
        //  avec le constructeur Point(int valX, int valY)
        Point point2 = new Point(-1,4);
        // Afficher les Points avec la méthode affiche()
        //  de la classe FormeUtilitaire
        System.out.println("----------");
        System.out.println("Les points :");
        FormeUtilitaire.affichePoint(point1);
        FormeUtilitaire.affichePoint(point2);
        // Déplacer le Point point1 de dX=23 et de dY=-2
        // Déplacer le Point point2 de dX=-10 et de dY=20
        System.out.println("----------");
        System.out.println("Les points se déplacent");
        point1.deplaceXY(23, -2);
        point2.deplaceXY(-10, -6);
        // Afficher les Points
        //  (Avez vous vérifié si x et/ou y étaient négatifs ?)
        //  (Car, comme indiqué précedement, un point doit toujours avoir un x et un y supérieur ou égal à 0)
        System.out.println("----------");
        System.out.println("Les points :");
        FormeUtilitaire.affichePoint(point1);
        FormeUtilitaire.affichePoint(point2);
    }
}
