package jeu;

/**
 * La classe ChefElfe, de définition et de gestion des chefs elfes de la bataille de Faërun (elle hérite de la classe Elfe).
 * @author Sarah Sellam
 */
public class ChefElfe extends Elfe {

    /**
     * Redéfinition du getter getForce() de la classe mère Elfe, qui renvoie la force associée au chef elfe courant, soit deux fois celle d'un elfe.
     * @return  la force de l'elfe.
     */
    @Override
    public int getForce() {
        return 2 * super.getForce();
    }
}
