package tp3.billeterie;

public class Billet {
    public static final double PRIX_AU_KM_MIN = 0.1;
    public static final double PRIX_AU_KM_MAX = 2;

    private double prixAuKm;
    private Trajet trajet;



    //========================================================
    // === Constructeurs ===

    public Billet(Trajet trajet, double prixAuKm) {
        this.trajet = trajet;
        this.setPrixAuKm(prixAuKm);
    }

    //========================================================
    // === Méthodes Getters ===

    public String getDepart() {
        return this.trajet.getDepart();
    }

    public String getArrivee() {
        return this.trajet.getArrivee();
    }

    public int getDistance() {
        return this.trajet.getDistance();
    }

    public double getPrixAuKm() {
        return prixAuKm;
    }

    public double getPrix() {
        return prixAuKm*getDistance();
    }


    //========================================================
    // === Méthodes Setters ===

    public void setPrixAuKm(double prixAuKm) {
        if (prixAuKm > PRIX_AU_KM_MAX) {
            this.prixAuKm = PRIX_AU_KM_MAX;
        } else if (prixAuKm < PRIX_AU_KM_MIN) {
            this.prixAuKm = PRIX_AU_KM_MIN;
        } else {
            this.prixAuKm = prixAuKm;
        }
    }


    //========================================================
    // === Autres Méthodes ===

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : [" + this.trajet.toString() + "], prix : " + BilletUtilitaire.arrondir(getPrix()) + " euros";
    }


}
