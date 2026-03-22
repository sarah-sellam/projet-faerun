package tp5.dalton;

import tp3.etudiant.Etudiant;

/**
 * Classe Dalton, de définition d'un dalton.
 * @author Sarah Sellam
 */
public class Dalton {
    private String nom;

    private Taille taille;

    //========================================================
    // === Constructeurs ===

    public Dalton(String nom, Taille taille) {
        this.nom = nom;
        this.taille = taille;
    }

    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner le nom du dalton.
     * @return  le nom du dalton
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourner la taille du dalton.
     * @return  la taille du dalton
     */
    public Taille getTaille() {
        return taille;
    }

    //========================================================
    // === Autres Méthodes ===

    @Override
    public String toString() {
        return nom + " (" + taille + ")";
    }

}
