package tp4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {

    @Test
    void getIntitule() throws IntituleException, PrixException {

        // Test minuscule
        Article article1 = new Article("minuscule", 2.0, 10);
        assertEquals("Minuscule", article1.getIntitule(), "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");

        // Test majuscule
        Article article2 = new Article("MAJUSCULE", 2.0, 10);
        assertEquals("Majuscule", article2.getIntitule(), "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");


    }

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


    @Test
    void getPrix() throws PrixException, IntituleException {

        Article article3 = new Article ("article 3", 7, 88);
        assertTrue(article3.getPrix(96)==article3.getPrix(5));
        assertFalse(article3.getPrix(127)==article3.getPrix(5));
    }

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

    @Test
    void existQuantite() throws PrixException, IntituleException {
        Article article4 = new Article ("article 4", 15, 150);

        assertTrue(article4.existQuantite(149));
        assertFalse(article4.existQuantite(151));
    }

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