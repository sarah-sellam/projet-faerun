package tp3.billeterie;

/**
 * Classe Billet, de gestion des billets
 * @author Sarah Sellam
 */
public class Billet {
    public static final double PRIX_AU_KM_MIN = 0.1;
    public static final double PRIX_AU_KM_MAX = 2;

    private double prixAuKm;
    private Trajet trajet;



    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet Billet, à partir du trajet et du prix au kilomètre.
     * @param trajet    trajet
     * @param prixAuKm  prix du billet au kilomètre
     */
    public Billet(Trajet trajet, double prixAuKm) {
        this.trajet = trajet;
        this.setPrixAuKm(prixAuKm);
    }

    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner le départ du trajet.
     *
     * @return  le départ du trajet
     */
    public String getDepart() {
        return this.trajet.getDepart();
    }

    /**
     * Retourner l'arrivée du trajet.
     * @return  l'arrivée du trajet
     */
    public String getArrivee() {
        return this.trajet.getArrivee();
    }

    /**
     * Retourner la distance du trajet.
     * @return  la distance du trajet
     */
    public int getDistance() {
        return this.trajet.getDistance();
    }

    /**
     * Retourner le prix au kilomètre.
     * @return le prix au kilomètre
     */
    public double getPrixAuKm() {
        return prixAuKm;
    }

    /**
     * Retourner le prix total du trajet (produit de la distance en km et du prix au km).
     * @return  le prix du trajet
     */
    public double getPrix() {
        return prixAuKm*getDistance();
    }


    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier le prix au kilomètre. La valeur est bornée entre 0.1 et 2 :
     * si La valeur entrée est inférieure à 0.1, le prix au kilomètre sera fixé par défaut à 0.1 ou
     * si La valeur entrée est supérieure à 2, le prix au kilomètre sera fixé par défaut à 2.
     * @param prixAuKm  le nouveau prix au kilomètre
     */
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

    /**
     * Redéfinition de la méthode toString() pour afficher un Billet sous la forme :
     * "  Billet : [Trajet : départ -> arrivée (distance en km)], prix : prix total en euros"
     * @return  le billet
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : [" + this.trajet.toString() + "], prix : " + BilletUtilitaire.arrondir(getPrix()) + " euros";
    }


}
