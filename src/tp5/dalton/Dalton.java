package tp5.dalton;

import tp3.etudiant.Etudiant;

import java.util.Comparator;

/**
 * Classe Dalton, de définition d'un dalton.
 * @author Sarah Sellam
 */
public class Dalton implements Comparable<Dalton>{
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

    //========================================================
    // === Comparaisons ===

    @Override
    public int compareTo(Dalton dalton) {
        if(this.taille != dalton.getTaille()) {
            if (this.taille == Taille.PETIT || dalton.getTaille() == Taille.GRAND) {
                return -1;
            }
            if (this.taille == Taille.GRAND || dalton.getTaille() == Taille.PETIT) {
                return 1;
            }
        }
        return this.nom.compareTo(dalton.getNom());
    }


    public static final Comparator<Dalton> comparateurNomSolution2 = new Comparator<Dalton>() {
        @Override
        public int compare(Dalton d1, Dalton d2) {
            if (d1.getNom().compareTo(d2.getNom()) < 0) {
                return -1;
            } else if (d1.getNom().compareTo(d2.getNom()) == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    };

}
