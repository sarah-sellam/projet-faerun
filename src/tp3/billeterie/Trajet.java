package tp3.billeterie;

public class Trajet {

    public static final int DISTANCE_MIN = 5;
    public static final int DISTANCE_MAX = 2000;

    private String depart;
    private String arrivee;
    private int distance;


    //========================================================
    // === Constructeurs ===

    public Trajet(String depart, String arrivee, int distance) {
        this.setDepart(depart);
        this.setArrivee(arrivee);
        this.setDistance(distance);
    }

    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner la ville de départ du trajet.
     *
     * @return depart
     */
    public String getDepart() {
        return depart;
    }

    /**
     * Retourner la ville d'arrivée du trajet.
     *
     * @return  arrivee
     */
    public String getArrivee() {
        return arrivee;
    }

    /**
     * Retourner la distance du trajet.
     *
     * @return  distance
     */
    public int getDistance() {
        return distance;
    }



    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier la ville de départ du trajet, tout en le convertissant en majuscules.
     *
     * @param depart    la ville de départ
     */
    public void setDepart(String depart) {
        this.depart = depart.toUpperCase();
    }

    /**
     * Modifier la ville d'arrivée du trajet, tout en la convertissant en majuscules.
     *
     * @param arrivee   la ville d'arrivée
     */
    public void setArrivee(String arrivee) {
        this.arrivee = arrivee.toUpperCase();
    }

    /**
     * Modifier la distance du trajet, en la bornant par son min ou son max :
     * si la distance donnée est < 5, la distance prend comme valeur 5
     * et si la distance donnée est > 2000, la distance prend comme valeur 2000.
     *
     * @param distance  la distance du trajet
     */
    public void setDistance(int distance) {
        if (distance>DISTANCE_MAX) {
            this.distance = DISTANCE_MAX;
        } else if (distance < DISTANCE_MIN) {
            this.distance = DISTANCE_MIN;
        } else {
            this.distance = distance;
        }
    }



    //========================================================
    // === Autres Méthodes ===

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : " + getDepart() + " -> " + getArrivee() + " (" + getDistance() + " km)";
    }

}
