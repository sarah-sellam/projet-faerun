package tp4;

/**
 * Classe PrixException, classe Exception pour le prix d'un article.
 * @author Sarah Sellam
 */
public class PrixException extends RuntimeException {
    /**
     * Exception sans message
     */
    public PrixException() {
        super();
    }

    /**
     * Exception avec message
     * @param message   message
     */
    public PrixException(String message) {
        super(message);
    }
}
