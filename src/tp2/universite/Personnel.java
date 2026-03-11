package tp2.universite;

import tp2.contrainte.ReelContraint;

/**
 * Classe des personnels de l'établissement
 * @author Sarah Sellam
 */
public class Personnel extends Personne {
    public static final int ECHELON_MIN = 1;
    public static final int ECHELON_MAX = 4;
    public static final float POINTDINDICE_MIN = 1000.0f;
    public static final float POINTDINDICE_MAX = 1200.0f;


    private int echelon;
    private ReelContraint pointDindice;

    //public static final : java public static final int ECHELON_MIN = 1;


    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet Personnel à partir des informations du personnel
     * (son login, son prénom et son nom).
     * Par défaut son échelon et sa valeur du point d'indice sont minimaux
     * (1 pour l'échelon et 1000 pour la valeur du point d'indice).
     *
     * @param login     le login du personnel
     * @param prenom    le prenom du personnel
     * @param nom       le nom du personnel
     */
    public Personnel(String login, String prenom, String nom) {
        super(login,prenom,nom);
        this.echelon = ECHELON_MIN;
        this.pointDindice = new ReelContraint(POINTDINDICE_MIN, POINTDINDICE_MAX);
    }

    /**
     * Construire un objet Personnel à partir des informations du personnel
     * (son login, son prénom, son nom, son échelon et sa valeur du point d'indice).
     *
     * @param login     le login du personnel
     * @param prenom    le prenom du personnel
     * @param nom       le nom du personnel
     * @param echelon   l'échelon du personnel
     * @param ptIndice
     */
    public Personnel(String login, String prenom, String nom, int echelon, double ptIndice) {
        super(login,prenom,nom);
        this.setEchelon(echelon);
        this.setPointDIndice(ptIndice);
    }


    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner l'échelon du personnel.
     *
     * @return echelon
     */
    public int getEchelon() {
        return echelon;
    }

    /**
     * Retourner la valeur du point d'indice du personnel.
     *
     * @return pointDindice
     */
    public ReelContraint getPointDIndice() {
        return pointDindice;
    }


    /**
     * Retourner le salaire du personnel
     * (produit de l'échelon et de la valeur du point d'indice).
     *
     * @return salaire
     */
    public double getSalaire() {
        return echelon*pointDindice.getValeur();
    }


    /**
     * Retourner l'adresse email du personnel
     * à partir de son prenom en minuscule et de son nom en minuscule séparés par un point
     * ainsi que du format de mail "@univ-grenoble-alpes.fr".
     *
     * @return l'adresse email du personnel.
     */
    @Override
    public String getMail() {
        return super.getPrenom().toLowerCase() + "." + super.getNom().toLowerCase() + "@univ-grenoble-alpes.fr";
    }


    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier l'échelon du personnel.
     *
     * Si l'échelon est strictement supérieur à l'échelon maximal (4),
     * alors il est remplacé par l'échelon maximal.
     *
     * Si l'échelon est strictement inférieur à l'échelon minimal (1),
     * alors il est remplacé par l'échelon minimal.
     *
     * Sinon, l'échelon est modifié avec le nouvel échelon echelon passé en paramètre.
     *
     * @param echelon   l'échelon du personnel
     */
    public void setEchelon(int echelon) {
        if (echelon>ECHELON_MAX) {
            this.echelon = ECHELON_MAX;
        } else if (echelon<ECHELON_MIN) {
            this.echelon = ECHELON_MIN;
        } else {
            this.echelon = echelon;
        }
    }

    /**
     * Modifier la valeur du point d'indice du personnel.
     *
     * Si la valeur du point d'indice est strictement supérieure à la valeur maximale (1200),
     * alors elle est remplacée par la valeur maximale.
     *
     * Si la valeur du point d'indice est strictement inférieure à la valeur minimale (1000),
     * alors elle est remplacée par la valeur minimale.
     *
     * Sinon, la valeur du point d'indice est modifié avec la nouvelle valeur pointDIndice passée en paramètre.
     *
     * @param pointDIndice      la valeur du point d'indice du personnel
     */
    public void setPointDIndice(double pointDIndice) {
        this.pointDindice.setValeur(pointDIndice);
//        if (pointDIndice>POINTDINDICE_MAX) {
//            this.pointDindice = POINTDINDICE_MAX;
//        } else if (pointDIndice<POINTDINDICE_MIN) {
//            this.pointDindice = POINTDINDICE_MIN;
//        } else {
//            this.pointDindice = pointDIndice;
//        }

    }


}
