package jeu;

/**
 * La classe Elfe, de définition et de gestion des elfes de la bataille de Faërun.
 * Elle hérite de la classe Guerrier.
 *
 * @author Sarah Sellam
 */
public class Elfe extends Guerrier {

    /**
     * Redéfinition du getter getFroce() de la classe mère Guerrier.
     * Renvoie la force associée à l'Elfe courant, qui vaut deux fois celle du guerrier.
     *
     * @return  la force de l'elfe.
     */
    @Override
    public int getForce() {
        return 2 * super.getForce();
    }

}
