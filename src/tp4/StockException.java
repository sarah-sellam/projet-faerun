package tp4;

/**
 * Classe StockException, classe Exception pour le stock d'un article.
 * @author Sarah Sellam
 */
public class StockException extends RuntimeException {
    /**
     * Exception sans message
     */
    public StockException() {
        super();
    }

    /**
     * Exception avec message
     * @param message   message
     */
    public StockException(String message) {
        super(message);
    }
}
