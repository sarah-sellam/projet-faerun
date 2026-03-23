package tp6.tabledoperation;

/**
 * Enumération Operation, de définition d'une opération
 * @author Sarah Sellam
 */
public enum OperationEnum {
    ADDITION("+"),
    SOUSTRACTION("-"),
    MULTIPLICATION("*");

    private String libelle;

    /**
     * Construire un objet de type Operation avec un libellée
     * @param libelle   libellé de l'opération
     */
    OperationEnum(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Redéfinition de la méthode toString() d'une taille retourner le libellé de l'opération.
     * @return  libellé de l'opération
     */
    @Override
    public String toString() {
        return libelle;
    }
}
