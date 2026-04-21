package jeu;

/**
 * La classe ChefElfe, de définition et de gestion des chefs elfes de la bataille de Faërun (elle hérite de la classe Elfe).
 * @author Sarah Sellam
 */
public class ChefElfe extends Elfe {

    /**
     * Nombre de ressources de base nécessaires pour entraîner un Chef Elfe.
     */
    private static final int RESSOURCES = 4;


    /**
     * Redéfinition du getter getForce() de la classe mère Elfe, qui renvoie la force associée au chef elfe courant, soit deux fois celle d'un elfe.
     * @return  la force de l'elfe.
     */
    @Override
    public int getForce() {
        return 2 * super.getForce();
    }

    /**
     * Renvoie le nombre de ressources nécessaires pour entraîner un chef elfe.
     * @return le nombre de ressources nécessaires pour entraîner un chef elfe
     */
    public int getRessourcesPourEntrainement() {
        return RESSOURCES;
    }
}
