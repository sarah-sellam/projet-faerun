package tp4;

/**
 * Classe IntituleeException, classe Exception pour l'intitulé d'un article.
 * @author Sarah Sellam
 */
public class IntituleException extends RuntimeException {
    /**
     * Exception sans message
     */
    public IntituleException() {
        super();
    }

    /**
     * Exception avec message
     * @param message   message
     */
    public IntituleException(String message) {
        super(message);
    }
}
