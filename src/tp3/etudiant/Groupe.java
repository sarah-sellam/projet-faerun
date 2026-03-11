package tp3.etudiant;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Classe des groupes
 */
public class Groupe {
    private String libelle;

    private TreeSet<Etudiant> etudiants = new TreeSet<>();

    //========================================================
    // === Constructeurs ===

    /**
     * * Construit un objet Groupe avec le libellé du groupe de l'étudiant.
     *
     * @param libelle le libellé du groupe de l'étudiant
     */
    public Groupe(String libelle) {
        this.setLibelle(libelle);
    }

    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner le libellé du groupe de l'étudiant.
     *
     * @return libelle      le libellé du groupe de l'étudiant
     */
    public String getLibelle() {
        return libelle;
    }



    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier le libellé du groupe.
     *
     * @param libelle   le nouveau libellé
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    //========================================================
    // === Autres Méthodes ===

    /**
     * Ajouter un étudiant au groupe
     *
     * @param etudiant      l'étudiant à ajouter
     */
    public void addEtudiant(Etudiant etudiant) {
        // si etudiants n'est pas null et alors que etudiant n'est pas déjà dans le groupe
        if (etudiants != null && !containsEtudiant(etudiant)) {
            //on ajoute l'étudiant au groupe
            etudiants.add(etudiant);
            // si le groupe de l'étudiant n'est pas le même, on le modifie
            if (etudiant.getGroupe() != this) {
                etudiant.setGroupe(this);
            }
        }
    }

    /**
     * Retirer un étudiant du groupe.
     *
     * @param etudiant      l'étudiant à retirer
     */
    public void removeEtudiant(Etudiant etudiant) {
        if (etudiants.contains(etudiant)) {
            etudiants.remove(etudiant);
        }
    }

    /**
     * Vérifier si l'étudiant appartient déjà au groupe.
     * Retourne vrai si l'étudiant est dans le groupe, faux sinon.
     *
     * @param etudiant      l'étudiant pour lequel on veit vérifier la présence dans le groupe.
     * @return true ou false
     */
    public boolean containsEtudiant(Etudiant etudiant) {
        if (etudiants != null ) {
            return etudiants.contains(etudiant);
        } else {
            return false;
        }
    }

    /**
     * Retourner l'ensemble des étudiants dans le groupe.
     *
     * @return  etudiants
     */
    public Collection<Etudiant> getEtudiants() {
        return etudiants;
    }



}



