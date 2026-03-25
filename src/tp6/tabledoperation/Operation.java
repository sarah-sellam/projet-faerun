package tp6.tabledoperation;

public abstract class Operation {
    private double terme1;
    private double terme2;
    private Double reponseUtilisateur = null;


    //========================================================
    // === Constructeur ===

    Operation(double terme1, double terme2) {
        this.terme1 = terme1;
        this.terme2 = terme2;

        //this.setReponseUtilisateur(0.0);
    }

    //========================================================
    // === Méthodes Getters ===

    public double getTerme1() {
        return terme1;
    }

    public double getTerme2() {
        return terme2;
    }

    //========================================================
    // === Méthodes Setters ===

    public void setReponseUtilisateur(double reponse) {
        this.reponseUtilisateur = reponse;
    }

    //========================================================
    // === Autres Méthodes ===

    public boolean existeReponseUtilisateur() {
        return reponseUtilisateur==null;
    }

    public boolean isReponseJuste() {
        return reponseUtilisateur == terme1*terme2;
    }

    public abstract double calculResultat();



}
