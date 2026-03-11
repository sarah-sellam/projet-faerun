package tp2.telephone;

public class Ecran {
    private String type;
    private int taille;

    //========================================================
    // === Constructeurs ===
    public Ecran(String type, int taille) {
        this.type = type;
        this.taille = taille;
    }

    //========================================================
    // === Méthodes Getters ===

    public String getType() {
        return type;
    }

    public int getTaille() {
        return taille;
    }



    //========================================================
    // === Autres Méthodes ===

    @Override
    public String toString() {
        return "ecran = [" + getType() + ", " + getTaille() + " pouces]";
    }


}
