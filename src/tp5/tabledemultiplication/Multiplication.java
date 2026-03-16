package tp5.tabledemultiplication;

public class Multiplication {

    private int terme1;
    private int terme2;
    private Integer reponseUtilisateur;

    private Boolean modeSansErreur;

    //========================================================
    // === Constructeurs ===

    public Multiplication(int terme1, int terme2) {
        this.terme1 = terme1;
        this.terme2 = terme2;

        this.modeSansErreur = modeSansErreur;
    }

    //========================================================
    // === Méthodes Setters ===

    public void setReponseUtilisateur(int reponse) throws ErreurMultiplicationException {
        if (reponse != reponseUtilisateur) {
            throw new ErreurMultiplicationException("Votre réponse n'est pas correcte, réessayer !");
        }
        this.reponseUtilisateur = reponse;
    }

    //========================================================
    // === Autres Méthodes ===

    public boolean isReponseJuste() {
        if( reponseUtilisateur == null) {
            return false;
        } else {
            return terme1*terme2 == reponseUtilisateur;
        }
    }

    @Override
    public String toString() {
        return terme1 + " x " + terme2 + " = ";
    }

}
