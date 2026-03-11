package tp2.contrainte;

/**
 * Classe Note qui hérite de la classe ReelContraint qui va permettre de représenter
 * des notes obtenues par les étudiants. Une note étant bien sûr comprise entre 0 et 20.
 */
public class Note extends ReelContraint {
    public static final double NOTE_MIN = 0;
    public static final double NOTE_MAX = 20;

    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet de type Note et initialiser le constructeur parent ReelContraint
     * avec min 0, max 20 et une valeur initiale égale à min.
     */
    public Note() {
        super(NOTE_MIN,NOTE_MAX);
    }

    /**
     * Construire un objet de type Note et initialiser le constructeur parent ReelContraint
     * avec min 0, max 20 et une valeur initiale connue.
     *
     * @param valeur    valeur initiale
     */
    public Note(double valeur) {
        super(NOTE_MIN,NOTE_MAX);

        if (valeur > NOTE_MAX) {
            setValeur(NOTE_MAX);
        } else if (valeur < NOTE_MIN) {
            setValeur(NOTE_MIN);
        } else {
            setValeur(valeur);
        }
    }


}
