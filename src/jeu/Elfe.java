package jeu;

/**
 * La classe Elfe, de définition et de gestion des elfes de la bataille de Faërun (elle hérite de la classe Guerrier).
 * @author Sarah Sellam
 */
public class Elfe extends Guerrier {

    /**
     * Nombre de ressources de base nécessaires pour entraîner un Elfe.
     */
    private static final int RESSOURCES = 2;


    /**
     * Renvoie le nom du guerrier : "Elfe".
     * @return le nom du guerrier : "Elfe".
     */
    public String getNom() {
        return "Elfe";
    };

    /**
     * Redéfinition du getter getForce() de la classe mère Guerrier, qui renvoie la force associée à l'Elfe courant, soit deux fois celle du guerrier.
     * @return  la force de l'elfe.
     */
    @Override
    public int getForce() {
        return 2 * super.getForce();
    }


    /**
     * Renvoie le nombre de ressources nécessaires pour entraîner un elfe.
     * @return le nombre de ressources nécessaires pour entraîner un elfe
     */
    public int getRessourcesPourEntrainement() {
        return RESSOURCES;
    }
}
