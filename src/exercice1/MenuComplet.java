package exercice1;

public class MenuComplet extends MenuDeBase {

    private Plat dessert;

    public MenuComplet(String nom, Plat entree, Plat platPrincipal, Plat dessert) {
        super(nom, entree, platPrincipal);
        this.dessert = dessert;
    }

    public Plat getDessert() {
        return dessert;
    }

    private double getPrixDeVenteAvantRemise() {
        return super.getPrixDeVente() + CarteUtilitaire.arrondi(dessert.getPrixDeVente()*0.8);
    }

    public String getDescription() {
        return super.getDescription()
                + "\n \t Dessert : " + this.getDessert().getNom();
    }


}
