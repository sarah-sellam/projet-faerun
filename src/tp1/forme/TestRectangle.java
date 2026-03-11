package tp1.forme;

/**
 * Classe TestRectangle
 * @author Sarah Sellam
 */
public class TestRectangle {
    public static void main(String[] args) {
        // Créer un rectangle
        Rectangle rectangle = new Rectangle(2, 4, 2, 3);
        // Afficher le rectangle
        FormeUtilitaire.afficheRectangle(rectangle);
        // Déplacer le rectangle
        System.out.println("On déplace l'origine de dx=10 et dy=4");
        rectangle.deplaceOrigine(10, 4);
        // Afficher le rectangle
        FormeUtilitaire.afficheRectangle(rectangle);
        // Récupérer l'origine
        Point origine = rectangle.getOrigine();
        // Déplacer le point origine
        System.out.println("On déplace le point donné par la méthode getOrigine() de dx=-5 et dy=-6");
        origine.deplaceXY(-5, -6);
        // Afficher le point et le rectangle
        FormeUtilitaire.affichePoint(origine);
        FormeUtilitaire.afficheRectangle(rectangle);

        // Créer un rectangle à l'origine (0,0)
        Rectangle rectangleSansOrigine = new Rectangle(14, 62);
        // Afficher le rectangle
        FormeUtilitaire.afficheRectangle(rectangleSansOrigine);
    }
}
