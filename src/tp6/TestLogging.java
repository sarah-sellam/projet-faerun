package tp6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe Testlogging
 * @author Sarah Sellam
 */
public class TestLogging {

    // Récupération du logger
    private static Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());

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
