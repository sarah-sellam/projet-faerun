package jeu;

/**
 * La classe ChefNain, de définition et de gestion des chefs nains de la bataille de Faërun (elle hérite de la classe Nain).
 * @author Sarah Sellam
 */
public class ChefNain extends Nain {

    /**
     * Nombre de ressources de base nécessaires pour entraîner un Chef Nain.
     */
    private static final int RESSOURCES = 3;

    /**
     * Redéfinition de la méthode subirDegats(int degats) de la classe mère Nain, fait subir les dégâts passés en paramètre au chef nain courant : on divise les dégats par deux car un chef nain subit deux fois moins de dégats qu'un nain.
     * @param degats    les degats subits.
     */
    @Override
    protected void subirDegats(int degats) {
        super.subirDegats(degats / 2);
    }

    /**
     * Renvoie le nombre de ressources nécessaires pour entraîner un chef nain.
     * @return le nombre de ressources nécessaires pour entraîner un chef nain
     */
    public int getRessourcesPourEntrainement() {
        return RESSOURCES;
    }
}
