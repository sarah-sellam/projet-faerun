package tp5.tabledemultiplication;

/**
 * Classe ErreurMultiplicationException, classe d'exception pour les multiplications
 * @author Sarah Sellam
 */
public class ErreurMultiplicationException extends Exception {
    /**
     * Exception avec message pour une multiplication
     * @param message message
     */
    public ErreurMultiplicationException(String message) {
        super(message);
    }
}
