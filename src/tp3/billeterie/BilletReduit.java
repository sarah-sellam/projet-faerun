package tp3.billeterie;

/**
 * Classe BilletReduit, classe de gestion de réduction du prix des billets, héritant de la classe Billet.
 * @author Sarah Sellam
 */
public class BilletReduit extends Billet {
    public static final double TAUX_MIN = 0.05;
    public static final double TAUX_MAX = 0.50;

    private double tauxDeReduction;

    //========================================================
    // === Constructeurs ===

    /** Construire un objet de type BilletReduit, à partir du trajet, du prix au kilomètre et du taux de réduction.
     *
     * @param trajet    le trajet
     * @param prixAuKm  le prix au kilomètre
     * @param tauxDeReduc   le taux de réduction
     */
    public BilletReduit(Trajet trajet, double prixAuKm, double tauxDeReduc) {
        super(trajet, prixAuKm);
        this.setTauxDeReduction(tauxDeReduc);
    }

    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner le taux de réduction du billet en réduction.
     * @return  le taux de réduction
     */
    public double getTauxDeReduction() {
        return tauxDeReduction;
    }

    /**
     * Retourner le prix du billet après réduction.
     * @return  le prix réduit du billet
     */
    public double getPrix() {
        return super.getPrix()-super.getPrix()*tauxDeReduction;
    }

    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier le taux de réduction du billet.
     *
     * @param tauxDeReduction   le taux de réduction
     */
    public void setTauxDeReduction(double tauxDeReduction) {
        if (tauxDeReduction > TAUX_MAX) {
            this.tauxDeReduction = TAUX_MAX;
        } else if (tauxDeReduction < TAUX_MIN) {
            this.tauxDeReduction = TAUX_MIN;
        } else {
            this.tauxDeReduction = tauxDeReduction;
        }
    }


    //========================================================
    // === Autres Méthodes ===

    /**
     * Redéfinition de la méthode toString() pour l'affichage d'un billet à prix réduit sous la forme :
     *  "BilletReduit : [Trajet : départ -> arrivée (distance en km)], prix : prix avec réduction en euros,
     *     avec une réduction de taux de réduction en pourcentage"
     * @return  affichage d'un billet avec réduction
     */
    @Override
    public String toString() {
        return super.toString() + ", avec une réduction de " + getTauxDeReduction()*100 + "%";
    }


}
