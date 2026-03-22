package tp4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe ArticleTest, classe de tests unitaires sur la classe Article
 * @author Sarah Sellam
 */
class ArticleTest {

    /**
     * Tests unitaires sur l'intitulé d'un article :
     * Un intitulé doit avoir la première lettre en majuscule et le reste en minuscule.
     * @throws IntituleException    exception sur l'intitulé
     * @throws PrixException    exception sur le prix
     */
    @Test
    void getIntitule() throws IntituleException, PrixException {

        // Test minuscule
        Article article1 = new Article("minuscule", 2.0, 10);
        assertEquals("Minuscule", article1.getIntitule(), "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");

        // Test majuscule
        Article article2 = new Article("MAJUSCULE", 2.0, 10);
        assertEquals("Majuscule", article2.getIntitule(), "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");


    }

    /**
     * Tests unitaires sur la modification de l'intitulé d'un article :
     * l'intitulé ne peut pas être nul ou vide.
     * @throws IntituleException    exception sur l'intitulé
     * @throws PrixException    exception sur le prix
     */
    @Test
    void setIntitule() throws IntituleException, PrixException {

        // Vérification du renvoi d'exception != assertEquals  !!!!
        assertThrows(IntituleException.class, () -> {
            new Article(null, 2.0, 10);
        }, "Un intitulé ne peut pas être null.");

        //
        assertThrows(IntituleException.class, () -> {
            new Article("", 2.0, 10);
        }, "Un intitulé ne peut pas être vide.");

        assertDoesNotThrow( () -> {
            new Article("article2", 2, 10);
        },"L'intitulé est ni null, ni vide.");

    }

    /**
     * Tests unitaires sur le prix d'un article :
     * le prix doit être différend si la quantité demandée est supérieure à 100.
     * @throws PrixException    exception sur le prix
     * @throws IntituleException    exception sur l'intitulé
     */
    @Test
    void getPrix() throws PrixException, IntituleException {

        Article article3 = new Article ("article 3", 7, 88);
        assertTrue(article3.getPrix(96)==article3.getPrix(5));
        assertFalse(article3.getPrix(127)==article3.getPrix(5));
    }

    /**
     * Tests unitaires sur la modification du prix d'un article :
     * un prix ne peut pas être null ou négatif.
     */
    @Test
    void setPrix() {

        assertThrows(PrixException.class, () -> {
            new Article("article1", 0, 10);
        }, "Un prix ne peut pas être null.");

        assertThrows(PrixException.class, () -> {
            new Article("article2", -7, 10);
        }, "Un prix ne peut pas être négatif.");

        assertDoesNotThrow( () -> {
            new Article("article2", 2, 10);
        },"Le prix doit être strictement positif.");


    }

    /**
     * Test unitaires de la méthode existQuantite() :
     * vérifier que la quantité est disponible en stock.
     *  * @throws PrixException    exception sur le prix
     * @throws IntituleException    exception sur l'intitulé
     */
    @Test
    void existQuantite() throws PrixException, IntituleException {
        Article article4 = new Article ("article 4", 15, 150);

        assertTrue(article4.existQuantite(149));
        assertFalse(article4.existQuantite(151));
    }

    /**
     * Tests unitaire sur la méthode removeQuantite() :
     * vérifier que le stock est suffisant après qu'on ait retiré une certaine quantité ;
     * lever un exception lorsque la quantité disponible est insuffisante.
     * @throws PrixException    exception sur le prix
     * @throws IntituleException    exception sur l'intitulé
     * @throws StockException   exception sur le stock
     */
    @Test
    void removeQuantite() throws PrixException, IntituleException, StockException {


        assertDoesNotThrow(() -> {
            Article article5 = new Article("article 5", 15, 150);
            article5.removeQuantite(140);
        }, "Le stock est suffisant.");

        assertThrows( StockException.class, () -> {
            Article article6 = new Article("article 6", 15, 4);
            article6.removeQuantite(5);
        }, "Le stock n'est pas suffisant.");
    }


    }