package tp1.universite;

/**
 * Classe Groupe, de définition et de gestion des groupes (des étudiants)
 * @author Sarah Sellam
 */
public class Groupe {
    private String libelle;

    //========================================================
    // === Constructeurs ===

    /**
     *      * Construit un objet Groupe avec le libellé du groupe de l'étudiant.
     * @param libelle   le libellé du groupe de l'étudiant
     */
    public Groupe(String libelle) {
        this.libelle = libelle;
    }

    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourne le libellé du groupe de l'étudiant.
     *
     * @return libelle      le libellé du groupe de l'étudiant
     */
    public String getLibelle() {
        return libelle;
    }


}

