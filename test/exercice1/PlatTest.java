package exercice1;

import static org.junit.jupiter.api.Assertions.*;

class PlatTest {

    @org.junit.jupiter.api.Test
    void getNom() {
        // On vérifie que le nom est correct : la première lettre est en majuscule et le reste en minuscule
            //avec un nom sans majuscule
        assertDoesNotThrow(() -> {
            Plat p = new Plat("salade", 5.0);
            assertEquals("Salade", p.getNom());
        });

            // avec un nom tout en majuscule
        assertDoesNotThrow(() -> {
            Plat p = new Plat("SALADE", 5.0);
            assertEquals("Salade", p.getNom());
        });

            // si le nom est null
        assertThrows(PlatException.class, () -> new Plat(null, 5.0));

            // si le nom est une chaine vide
        assertThrows(PlatException.class, () -> new Plat("", 5.0));
    }

    @org.junit.jupiter.api.Test
    void getCoutDeFabrication() {
        // On vérifie que le coût de fabrication soit correct, c'est-à-dire compris entre 1 et 20
            // avec une valeur normale entre les 2 bornes
        assertDoesNotThrow(() -> {
            Plat p = new Plat("Soupe", 8.0);
            assertEquals(8.0, p.getCoutDeFabrication());
        });

            // avec la valeur minimale
        assertDoesNotThrow(() -> {
            Plat p = new Plat("Pain", 1.0);
            assertEquals(1.0, p.getCoutDeFabrication());
        });

            // avec la valeur maximale
        assertDoesNotThrow(() -> {
            Plat p = new Plat("Homard", 20.0);
            assertEquals(20.0, p.getCoutDeFabrication());
        });

            // en dessous du minimum
        assertThrows(PlatException.class, () -> new Plat("Soupe", 0.5));

            // au dessus du maximum
        assertThrows(PlatException.class, () -> new Plat("Homard", 25.0));
    }

    @org.junit.jupiter.api.Test
    void getPrixDeVente() {
        // On vérifie que le prix de vente est correct

            // On vérifie que le prix de vente vaut bien coût * 1.5
        assertDoesNotThrow(() -> {
            Plat p = new Plat("Steak", 10.0);
            assertEquals(15.0, p.getPrixDeVente());
        });

            // On vérifie l'application de la méthode pour l'arrondi
        assertDoesNotThrow(() -> {
            Plat p = new Plat("Poulet", 7.0);
            assertEquals(10.5, p.getPrixDeVente());
        });

    }
}