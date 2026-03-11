package tp1.forme;

/**
 * Classe Point
 * @author Sarah Sellam
 */
public class Point {
    private int x;
    private int y;

    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet Point donc les coordonnées sont (0,0).
     */
    public Point() {
        // Appel au constructeur Point(int x, int y)
        this(0, 0);
    }

    /**
     * Construire un objet Point donc les coordonnées sont (x,y).
     *
     * @param x l'abscisse du point
     * @param y l'ordonnée du point
     */
    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    //========================================================
    // === Méthodes ===

    /**
     * Déplacer le point de +dX et +dY
     *
     * @param dX la variation sur l'axe des abscisses
     * @param dY la variation sur l'axe des ordonnées
     */
    public void deplaceXY(int dX, int dY) {
        this.setX(x + dX);
        this.setY(y + dY);
    }

    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner l'abscisse du point.
     * @return x    l'abscisse du point
     */
    public int getX() {
        return x;
    }

    /**
     * Retourner l'ordonnée du point.
     * @return y    l'ordonnée du point
     */
    public int getY() {
        return y;
    }


    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier l'abscisse du point si celle passée en paramètre est positive ou nulle, sinon l'abscisse est fixée à 0.
     * @param x     l'abscisse du point
     */
    public void setX(int x) {
        // `x` correspond au paramètre de cette méthode.
        // Alors que `this.x` correspond à l'attribut `x` de la classe.
        if (x<0) {
            this.x = 0;
        } else {
            this.x = x; // (L’attribut this.x prend la valeur du paramètre x)
        }
    }

    /**
     * Modifier l'ordonnée du point si celle passée en paramètre est positive ou nulle, sinon l'ordonnée est fixée à 0.
     * @param y     l'ordonnée du point
     */
    public void setY(int y) {
        // `y` correspond au paramètre de cette méthode.
        // Alors que `this.y` correspond à l'attribut `y` de la classe.
        if (y<0) {
            this.y = 0;
        } else {
            this.y = y; // (L’attribut this.y prend la valeur du paramètre y)
        }
    }

}


