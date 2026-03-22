package tp5.tabledemultiplication;

/**
 * Classe Multiplication, de définition d'une multiplication
 * @author Sarah Sellam
 */
public class Multiplication {

    private int terme1;
    private int terme2;
    private Integer reponseUtilisateur; //(Par défault, il est null)

    private boolean modeSansErreur = false;

    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet de type Multiplication , à partir de deux termes et
     * d'un booléen qui définit si le mode est avec ou sans erreur (true pour sans erreur, false sinon).
     * @param terme1    terme 1
     * @param terme2    terme 2
     * @param modeSansErreur    mode avec ou sans erreur
     */
    public Multiplication(int terme1, int terme2, boolean modeSansErreur) {
        this.terme1 = terme1;
        this.terme2 = terme2;
        this.modeSansErreur = modeSansErreur;
    }

    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier la réponse de l'utilisateur.
     * Lève une exception si le mode choisi est sans erreur et que la réponse entrée en paramètre est incorrecte.
     * @param reponse   nouvelle réponse
     * @throws ErreurMultiplicationException
     */
    public void setReponseUtilisateur(int reponse) throws ErreurMultiplicationException {
        if (modeSansErreur && reponse != terme1*terme2) {
            throw new ErreurMultiplicationException("Votre réponse n'est pas correcte, réessayer !");
        }
        this.reponseUtilisateur = reponse;
    }

    //========================================================
    // === Autres Méthodes ===

    /**
     * Retourne vrai si la réponse entrée par l'utilisateur est juste, faux sinon.
     * @return vrai ou faux
     */
    public boolean isReponseJuste() {
        if( reponseUtilisateur == null) {
            return false;
        } else {
            return terme1*terme2 == reponseUtilisateur;
        }
    }

    /**
     * Redéfinition de la méthode toString() pour l'affichage d'une multiplication sous la forme :
     * "terme1 x terme2 = "
     * @return affichage de la multiplication
     */
    @Override
    public String toString() {
        return terme1 + " x " + terme2 + " = ";
    }

}
