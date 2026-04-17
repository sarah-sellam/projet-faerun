package jeu;

/**
 * La classe ChefElfe, de définition et de gestion des chefs elfes de la bataille de Faërun.
 * Elle hérite de la classe Elfe.
 *
 * @author Sarah Sellam
 */
public class ChefElfe extends Elfe {

    /**
     * Redéfinition du getter getFroce() de la classe mère Elfe.
     * Renvoie la force associée au chef efle courant, qui vaut deux fois celle d'un elfe.
     *
     * @return  la force de l'elfe.
     */
    @Override
    public int getForce() {
        return 2 * super.getForce();
    }
}
