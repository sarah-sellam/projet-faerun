package tp5.dalton;

/**
 * Enumération Taille, de définition de la taille d'un Dalton.
 * @author Sarah Sellam
 */
public enum Taille {
    PETIT("petit"),
    MOYEN("moyen"),
    GRAND("grand");

    private String libelle;

    /**
     * Construire un objet de type Taille avec un libellée
     * @param libelle   libellé de la taille
     */
    private Taille(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Redéfinition de la méthode toString() d'une taille retourner le libellé de la taille.
     * @return  libellé de la taille
     */
    @Override
    public String toString() {
        return libelle;
    }
}
