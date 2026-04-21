package jeu;

/**
 * La classe Nain, de définition et de gestion des nains de la bataille de Faërun (elle hérite de la classe Guerrier).
 * @author Sarah Sellam
 */
public class Nain extends Guerrier {

    /**
     * Redéfinition de la méthode subirDegats(int degats) de la classe mère Guerrier, fait subir les dégâts passés en paramètre au nain courant : on divise les dégats par deux car un nain subit deux fois moins de dégats qu'un guerrier de base.
     * @param degats    les degats subits.
     */
    @Override
    protected void subirDegats(int degats) {
        super.subirDegats(degats / 2);
    }
}
