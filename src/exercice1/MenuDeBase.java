package exercice1;

import java.util.ArrayList;

public class MenuDeBase {

    private String nom;
    private Plat entree;
    private Plat platPrincipal;


    /**
     * Construire un objet de type MenuDeBase
     * à partir d'un nom de menu, une entrée et un plat principal.
     *
     * @param nom   nom du menu
     * @param entree    entrée du menu
     * @param platPrincipal     plat principal du menu
     */
    public MenuDeBase(String nom, Plat entree, Plat platPrincipal) {
        this.nom = nom;
        this.entree = entree;
        this.platPrincipal = platPrincipal;
    }

    public String getNom() {
        return nom;
    }



    public Plat getEntree() {
        return entree;
    }

    public Plat getPlatPrincipal() {
        return platPrincipal;
    }

    private double getPrixDeVenteAvantRemise() {
        return entree.getPrixDeVente() + platPrincipal.getPrixDeVente();
    }


    /**
     * Retourne le prix arrondi du menu basé sur le prix de
     * vente avant remise auquel on applique une remise de 20%.
     * @return prix de vente après réduction
     */
    public double getPrixDeVente() {
        return CarteUtilitaire.arrondi(this.getPrixDeVenteAvantRemise()*0.8);
    }

    public String getDescription() {
        return "Menu : " + nom  + " - " + this.getPrixDeVente()
                + "\n \t Entrée : " + this.getEntree().getNom()
                + "\n \t Plat Principal : " + this.getPlatPrincipal().getNom();
    }

}
