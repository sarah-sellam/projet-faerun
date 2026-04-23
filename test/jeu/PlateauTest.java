package jeu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe PlateauTest, de tests unitaires sur les méthodes de la classe Plateau
 * @author Sarah Sellam
 */
class PlateauTest {


    /**
     * Test de déplacement des guerriers bleus.
     */
    @Test
    public void deplacerGuerriers_bleu() {
        Plateau plateau = new Plateau(3);
        Chateau bleu = new Chateau(Couleur.BLEU);

        Guerrier g = new Nain();

        plateau.ajoutGuerriers(bleu, new Guerrier[]{g});

        plateau.deplaceGuerriers();

        Carreau[] carreaux = plateau.getCarreaux();

        assertEquals(0, carreaux[0].getGuerriersBleus().length);
        assertEquals(1, carreaux[1].getGuerriersBleus().length);
    }

    /**
     * Test de déplacement des guerriers rouges.
     */
    @Test
    public void deplacerGuerriers_rouge() {
        Plateau plateau = new Plateau(3);
        Chateau rouge = new Chateau(Couleur.ROUGE);

        Guerrier g = new Nain();

        plateau.ajoutGuerriers(rouge, new Guerrier[]{g});

        plateau.deplaceGuerriers();

        Carreau[] carreaux = plateau.getCarreaux();

        assertEquals(0, carreaux[2].getGuerriersRouges().length);
        assertEquals(1, carreaux[1].getGuerriersRouges().length);
    }


    /**
     * Test de déplacement des guerriers bleus et rouges.
     */
    @Test
    public void deplacerGuerriers_bleusEtRouges() {
        Plateau plateau = new Plateau(3);

        Chateau bleu = new Chateau(Couleur.BLEU);
        Chateau rouge = new Chateau(Couleur.ROUGE);

        Guerrier gb = new Nain();
        Guerrier gr = new Elfe();

        plateau.ajoutGuerriers(bleu, new Guerrier[]{gb});
        plateau.ajoutGuerriers(rouge, new Guerrier[]{gr});

        plateau.deplaceGuerriers();

        Carreau[] carreaux = plateau.getCarreaux();

        // Les deux doivent se retrouver au milieu
        assertEquals(1, carreaux[1].getGuerriersBleus().length);
        assertEquals(1, carreaux[1].getGuerriersRouges().length);
        assertTrue(carreaux[1].estChampDeBataille());
    }



}