package tp4;


public class Article {

    private String intitule;
    private double prix;
    private int stock;

    private static final int SEUIL = 100;

    //========================================================
    // === Constructeurs ===

    public Article(String intitule, double prix, int stock) throws IntituleException {
        setIntitule(intitule);
        setPrix(prix);
        setStock(stock);
    }


    //========================================================
    // === Méthodes Getters ===

    public String getIntitule() {
        return intitule;
    }

    public double getPrix() {
        return prix;
    }

    public double getPrix(int quantite) {
        if (quantite>=SEUIL) {
            return prix - ((double) 10 /100)*prix;
        } else {
            return prix;
        }
    }

    public int getStock() {
        return stock;
    }


    //========================================================
    // === Méthodes Setters ===

    public void setIntitule(String intitule) throws IntituleException {
        if (intitule == null || intitule.isEmpty()) {
            throw new IntituleException("Un intitulé ne peut être null ou vide");
        }
        this.intitule = ArticleUtilitaire.capitalize(intitule);
        // pour tester      this.intitule = intitule;
    }

    public void setPrix(double prix) throws PrixException{
        if ( prix <= 0 ) {
            throw new PrixException("Un prix ne peut pas valoir zéro ou être négatif");
        }
        this.prix = prix;
    }

    public void setStock(int stock) throws StockException{
        if ( stock <=0 ) {
            throw new StockException("Le stock ne peut pas commencer à zéro ou être négatif");
        }
        this.stock = stock;
    }


    //========================================================
    // === Autres Méthodes ===

    public boolean existQuantite(int quantite) {
        return quantite<=stock;
    }

    public void removeQuantite(int quantite) {
        if (existQuantite(quantite)) {
            setStock(stock-quantite);
        }
    }


}
