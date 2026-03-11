package tp1.forme;

/**
 * Classe de définition d'un cercle
 * @author Sarah Sellam
 */
public class Cercle {
    private int rayon;
    private Point centre;


    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet Cercle à partir du Point centre (le centre du rayon) et de l'entier MonRayon (le rayon du cercle).
     * @param monRayon      le rayon du cercle
     * @param centre        le centre du cercle
     */
    public Cercle(int monRayon, Point centre) {
        this.setRayon(monRayon);
        this.centre = centre;
    }


    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier du rayon du cercle.
     *
     * @param nouveauRayon      le nouveau rayon du cercle
     */
    public void setRayon(int nouveauRayon) {
        this.rayon = nouveauRayon;
    }


    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner le rayon du cercle.
     *
     * @return       le rayon du cercle
     */
    public int getRayon() {
        return rayon;
    }

    /**
     * Retourner le centre du point.
     *
     * @return centre   le centre du point
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * Retourner le périmètre du cercle à partir de la formule 2*pi*rayon.
     * @return      le périmètre du cercle
     */
    public double getPerimetre() {
        return 2*Math.PI*rayon;
    }

    /**
     * Retourner l'aire du cercle à partir de la formule pi*rayon*rayon.
     * @return      l'aire du cercle
     */
    public double getAire() {
        return Math.PI*Math.pow(rayon,2);
    }


    //========================================================
    // === Autres Méthodes ===

    /**
     * Déplacer le centre du cercle de +dX et +dY.
     *
     * @param dX la variation sur l'axe des abscisses
     * @param dY la variation sur l'axe des ordonnées
     */
    public void deplaceCentre(int dX, int dY) {
        centre.deplaceXY(dX, dY);
    }



}
