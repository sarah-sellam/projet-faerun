package jeu;

/**
 * Enumération Couleur, de définition d'une couleur.
 * @author Sarah Sellam
 */
public enum Couleur {
    BLEU("Bleu"),
    ROUGE("Rouge");

    private String libelle;

    /**
     * Construire un objet de type Couleur avec un libellée
     * @param libelle   libellé de la couleur
     */
    Couleur(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Redéfinition de la méthode toString() afin de retourner le libellé de la couleur.
     * @return  libellé de la couleur
     */
    @Override
    public String toString() {
        return libelle;
    }
}
