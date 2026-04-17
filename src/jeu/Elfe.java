package jeu;

/**
 * La classe Elfe, de définition et de gestion des elfes de la bataille de Faërun (elle hérite de la classe Guerrier).
 * @author Sarah Sellam
 */
public class Elfe extends Guerrier {

    /**
     * Redéfinition du getter getForce() de la classe mère Guerrier, qui renvoie la force associée à l'Elfe courant, soit deux fois celle du guerrier.
     * @return  la force de l'elfe.
     */
    @Override
    public int getForce() {
        return 2 * super.getForce();
    }

}
