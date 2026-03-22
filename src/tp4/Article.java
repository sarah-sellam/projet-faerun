package tp4;

/**
 * Classe des Articles, classe de gestion des articles.
 * @author Sarah Sellam
 */
public class Article {

    private String intitule;
    private double prix;
    private int stock;

    private static final int SEUIL = 100;

    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet de Article, à partir de son intitulé, son prix et son stock.
     * @param intitule  intitulé de l'article
     * @param prix      prix de l'article
     * @param stock     stock de l'article
     * @throws IntituleException
     */
    public Article(String intitule, double prix, int stock) throws IntituleException {
        setIntitule(intitule);
        setPrix(prix);
        setStock(stock);
    }


    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner l'intitulé de l'article.
     * @return  l'intitulé de l'article
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     * Retourner le prix de l'article.
     * @return  le prix de l'article
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Retourner le prix unitaire d'un article selon la quantité :
     * retourne le prix unitaire si la quantité demandée est inférieure à 100,
     * ou retourne le prix unitaire avec une ristourne de 10% si la quantité demandée est supérieur ou égal à 100.
     *
     * @param quantite  quantité demandée d'un article
     * @return  le prix unitaire
     */
    public double getPrix(int quantite) {
        if (quantite>=SEUIL) {
            return prix - ((double) 10 /100)*prix;
        } else {
            return prix;
        }
    }

    /**
     * Retourner le stock d'un article.
     * @return  le stock d'un article.
     */
    public int getStock() {
        return stock;
    }


    //========================================================
    // === Méthodes Setters ===

    /**
     *  Enregistrer l’intitule de l’article en faisant respecter les spécifications
     *  (modifie la chaîne de caractères passée en paramètre) ;
     *  Provoque une exception de type IntituleException
     *  si la chaîne de caractères en paramètre est null ou vide.
     * @param intitule  nouvel intitulé de l'article
     * @throws IntituleException    excpetion sur l'intitulé
     */
    public void setIntitule(String intitule) throws IntituleException {
        if (intitule == null || intitule.isEmpty()) {
            throw new IntituleException("Un intitulé ne peut être null ou vide");
        }
        this.intitule = ArticleUtilitaire.capitalize(intitule);
        // pour tester      this.intitule = intitule;
    }

    /**
     * Enregistre le prix unitaire de l’article ;
     * Provoque une exception de type PrixException
     * si le prix en paramètre est 0, ou inférieur à 0.
     * @param prix  nouveau prix de l'article
     * @throws PrixException    exception sur le prix
     */
    public void setPrix(double prix) throws PrixException{
        if ( prix <= 0 ) {
            throw new PrixException("Un prix ne peut pas valoir zéro ou être négatif");
        }
        this.prix = prix;
    }

    /**
     * Enregistre le stock de l'article ;
     * Provoque une exception de type StockException
     *  si la quantité en paramètre est 0, ou inférieur à 0.
     * @param stock     nouveau stock de l'article
     * @throws StockException       exception sur le stock
     */
    public void setStock(int stock) throws StockException{
        if ( stock <=0 ) {
            throw new StockException("Le stock ne peut pas commencer à zéro ou être négatif");
        }
        this.stock = stock;
    }


    //========================================================
    // === Autres Méthodes ===

    /**
     * Retourne vrai si la quantité d’articles demandée en paramètre est présente dans le stock, retourne faux sinon.
     * @param quantite
     * @return
     */
    public boolean existQuantite(int quantite) {
        return quantite<=stock;
    }

    /**
     * retire la quantité d’articles demandée en paramètre du stock de l’article.
     * Normalement, cette méthode ne doit être appelée que si la quantité existe dans le stock (en utilisant la méthode ci-avant).
     * Pour plus de sécurité, cette méthode provoque une exception de type StockException
     * si la quantité en paramètre n’est pas présente dans le stock.
     * @param quantite  quantité à retirer du stock
     */
    public void removeQuantite(int quantite) {
        if (existQuantite(quantite)) {
            setStock(stock-quantite);
        }
    }


}
