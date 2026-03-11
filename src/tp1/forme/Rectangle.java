package tp1.forme;

/**
 * Classe Rectangle de définition d'un objet de type rectangle
 * @author Sarah Sellam
 */
public class Rectangle {
    private int largeur;
    private int longueur;
    private Point origine;

    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet Rectangle de largeur l, de longueur L et d'origine (0,0).
     *
     * @param l     la largeur du rectangle
     * @param L     la longueur du rectangle
     */
    public Rectangle(int l, int L) {
        this.setLargeur(l);
        this.setLongueur(L);
        this.origine = new Point(0,0);
    }

    /**
     * Construire un objet Rectangle de largeur l, de longueur L et d'origine (valX,valY).
     *
     * @param l     la largeur du rectangle
     * @param L     la longueur du rectangle
     * @param valX     l'abscisse de l'origine du rectangle
     * @param valY     l'ordonnée de l'origine du rectangle
     */
    public Rectangle(int l, int L, int valX, int valY) {
        this.setLargeur(l);
        this.setLongueur(L);
        this.origine = new Point(valX, valY);
    }

    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier la largeur du rectangle
     *
     * @param l     la largeur du rectangle
     */
    public void setLargeur(int l) {
        this.largeur = l;
    }

    /**
     * Modifier la longueur du rectangle
     *
     * @param L     la longueur du rectangle
     */
    public void setLongueur(int L) {
        this.longueur = L;
    }

    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner la largeur du rectangle
     * @return largeur      la largeur du rectangle
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * Retourner la longueur du rectangle
     * @return longueur      la longueur du rectangle
     */
    public int getLongueur() {
        return longueur;
    }

    /**
     * Retourner un clone de l'objet Origine du rectangle
     *
     * @return origine  l'origine du rectangle
     */
    public Point getOrigine() {
        return new Point(origine.getX(),origine.getY()); // en créant un nouvel objet de type Point
    }

    /**
     * Retourner le périmètre du rectangle à partir de la formule 2*(largeur + longueur).
     * @return      le périmètre du rectangle
     */
    public double getPerimetre() {
        return 2*(largeur+longueur);
    }

    /**
     * Retourner l'aire du rectangle à partir de la formule longueur*largeur.
     * @return      l'aire du rectangle
     */
    public double getAire() {
        return longueur*largeur;
    }

    //========================================================
    // === Autres Méthodes ===

    /**
     * Déplace l'origine de +dX et +dY
     *
     * @param dX la variation sur l'axe des abscisses
     * @param dY la variation sur l'axe des ordonnées
     */
    public void deplaceOrigine(int dX, int dY) {
        origine.deplaceXY(dX, dY);
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
