package tp2.telephone;

public class Processeur {
    private String libelle;
    private double frequence;

    //========================================================
    // === Constructeurs ===
    public Processeur(String libelle, double frequence) {
        this.libelle = libelle;
        this.frequence = frequence;
    }

    //========================================================
    // === Méthodes Getters ===
    public String getLibelle() {
        return libelle;
    }

    public double getFrequence() {
        return frequence;
    }



    //========================================================
    // === Autres Méthodes ===

    @Override
    public String toString() {
        return "processeur = " + getLibelle() + " (" + getFrequence() + "GHz)";
    }
}
