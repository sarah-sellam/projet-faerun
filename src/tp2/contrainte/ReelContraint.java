package tp2.contrainte;

/**
 * Classe ReelContraint qui permet de définir des réels
 * pour lesquels on assure que leur valeur est comprise dans un intervalle fixé par une valeur minimale (min) et une valeur maximale (max).
 * @autor Sarah Sellam
 */
public class ReelContraint {
    private double min;
    private double max;
    private double valeur;


    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet de type ReelContraint à partir de valeurs doubles min et max.
     * La valeur initiale (à la construction) d’un ReelContraint est la valeur minimale (min).
     *
     * @param min   la valeur minimale
     * @param max   la valeur maximale
     */
    public ReelContraint(double min, double max) {
        this.min = min;
        this.max = max;
        this.valeur = min;
    }



    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner la valeur du ReelContraint.
     *
     * @return      valeur
     */
    public double getValeur() {
        return valeur;
    }



    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier la valeur du ReelContraint,
     * uniquement si valeur est dans l’intervalle [min, max].
     *
     * @param valeur     la nouvelle valeur du ReelContraint
     */
    public void setValeur(double valeur) {
        if (valeur >= min && valeur <= max) {
            this.valeur = valeur;
        }
    }


    //========================================================
    // === Autres Méthodes ===


    /**
     *  Retourner une chaine de caractère représentant l’entier contraint :
     *  “valeur : X, min : Y, max : Z“.
     *
     * @return valeur : X, min : Y, max : Z
     */
    @Override
    public String toString() {
        return "valeur : " + getValeur() + ", min : " + min + ", max : " + max;
    }
}
