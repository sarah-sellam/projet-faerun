package tp2.telephone;

public class Memoire {
    private String type;
    private int nombreGiga;

    //========================================================
    // === Constructeurs ===
    public Memoire(String type, int nombreGiga) {
        this.type = type;
        this.nombreGiga = nombreGiga;
    }

    //========================================================
    // === Méthodes Getters ===

    public String getType() {
        return type;
    }

    public int getNombreGiga() {
        return nombreGiga;
    }




    //========================================================
    // === Autres Méthodes ===

    @Override
    public String toString() {
        return "stockage = [" + getType() + ", " + getNombreGiga() + "Giga]";
    }
}
