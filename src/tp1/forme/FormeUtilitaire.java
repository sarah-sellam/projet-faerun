package tp1.forme;

/**
 * Classe FormeUtilitaire, classe utilitaire
 * @author Sarah Sellam
 */
public class FormeUtilitaire {

    /**
     * Afficher le point sous la forme "Point : x=..., y=..." .
     * @param p     le point à afficher
     */
    public static void affichePoint(Point p) {
        System.out.println("Point : x=" + p.getX() + ", y=" + p.getY() );

    }

    /**
     * Afficher le cercle sous la forme suivante :
     * "Cercle : R=rayon, Centre=(x,y), Périmètre=..., Aire=..."
     *
     * @param c  le cercle à afficher
     */
    public static void afficheCercle(Cercle c) {
        System.out.println("Cercle : R=" + c.getRayon() + ", Centre=(" + c.getCentre().getX() + "," + c.getCentre().getY()  + "), Périmètre=" + c.getPerimetre() + ", Aire=" + c.getAire());
    }


    /**
     * Afficher le rectangle sous la forme suivante :
     *
     * "Rectangle : l=largeur, L=longueur, Origine=(x,y), Périmètre=..., Aire=..."
     *
     * @param rec   le rectangle à afficher
     */
    public static void afficheRectangle(Rectangle rec) {
        System.out.println(
                "Rectangle : l=" + rec.getLargeur() +
                        ", L=" + rec.getLongueur() +
                        ", Origine=(" + rec.getOrigine().getX() +
                        "," + rec.getOrigine().getY() +
                        "), Périmètre=" + rec.getPerimetre() +
                        ", Aire=" + rec.getAire()
        );
    }


}
