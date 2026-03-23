package tp6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Classe Testlogging
 * @author Sarah Sellam
 */
public class TestLogging {

    // Récupération du logger
    private static Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());


    /*
    // => Option 1 - Soit en modifiant le main pour remplacer la configuration du logger par :
    // Récupérarion du gestionnaire de logs
    private static final LogManager logManager = LogManager.getLogManager();

    // Configuration du logger
    static{
        try {
            logManager.readConfiguration( new FileInputStream("conf/debug-logging.properties") );
        } catch ( IOException exception ) {
            LOGGER.log( Level.SEVERE, "Cannot read configuration file", exception );
        }
    }
    */

    // Configuration du logger
//    static {
//        LOGGER.setLevel(Level.WARNING);
//    }
//    // Configuration du logger
//    static {
//        System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$s] %4$-10s | (%3$s) %2$-15s | %5$s\n");
//        LOGGER.setLevel(Level.WARNING);
//    }
    /**
     * procédure principale
     * @param args  arguments
     */
    public static void main(String[] args) {

        try {
            int dividende = (int) (9 * Math.random());
            int diviseur = (int) (2 * Math.random());

            // TODO Utiliser le logger...
            LOGGER.log(Level.INFO, "Mon premier log !" );
            LOGGER.log(Level.WARNING, "Attention à une division par zéro peut se produire");

            int quotient = dividende/diviseur;

            Object[] data = { dividende, diviseur, quotient };
            LOGGER.log(Level.INFO, "dividende = {0}, diviseur = {1} et quotient = {2}" , data);

        } catch (ArithmeticException e){
            LOGGER.log(Level.SEVERE, "Le message d'exception : java.lang.ArithmeticException: divide by zero");


        }



    }
}
