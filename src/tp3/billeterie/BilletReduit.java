package tp3.billeterie;

public class BilletReduit extends Billet {
    public static final double TAUX_MIN = 0.05;
    public static final double TAUX_MAX = 0.50;

    private double tauxDeReduction;

    //AJOUT CONSTANTES POUR VERIF  TAUX ENTRE 5 et 50%


    //========================================================
    // === Constructeurs ===
    public BilletReduit(Trajet trajet, double prixAuKm, double tauxDeReduc) {
        super(trajet, prixAuKm);
        this.setTauxDeReduction(tauxDeReduc);
    }

    //========================================================
    // === Méthodes Getters ===

    public double getTauxDeReduction() {
        return tauxDeReduction;
    }

    public double getPrix() {
        return super.getPrix()-super.getPrix()*tauxDeReduction;
    }

    //========================================================
    // === Méthodes Setters ===

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

    @Override
    public String toString() {
        return super.toString() + ", avec une réduction de " + getTauxDeReduction()*100 + "%";
    }


}
