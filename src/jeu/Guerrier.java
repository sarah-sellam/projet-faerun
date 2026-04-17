package jeu;

/**
 * La classe Guerrier, de définition et de gestion des guerriers de la bataille de Faërun.
 * Il s'agit d'une classe abstraite, classe mère des classes Nain, ChefNain, Elfe et ChefElfe.
 *
 * @author Sarah Sellam
 */
public abstract class Guerrier {

    /**
     * force est attribut privé, de type entier, désignant la force d'un guerrier.
     */
    private int force;
    /**
     * pointsDeVie est attribut privé, de type entier, les points de vie d'un guerrier.
     */
    private int pointsDeVie;

    /**
     * Initialise un nouvel objet Guerrier, dont la force et les pointsDeVie sont respectivement initialisés à 10 et 100.
     */
    public Guerrier() {
        this.force = 10;
        this.setPointsDeVie(100);
    }

    /**
     * Renvoie la force associée au Guerrier courant.
     *
     * @return  la force du Guerrier courant.
     */
    public int getForce() {
        return force;
    }

    /**
     * Renvoie les points de vie associés au Guerrier courant.
     *
     * @return les points de vie du Guerrier courant.
     */
    public int getPointsDeVie() {
        return pointsDeVie;
    }

    /**
     * Modifie le nombre de points de vie du Guerrier courant.
     *
     * @param pointsDeVie   le nouveau nombre de points de vie du Guerrier.
     */
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    /**
     * Renvoie vrai si le Guerrier est vivant (c'est-à-dire que son nombre de points de vie est strictement supérieur à 0), faux sinon.
     *
     * @return  vrai si le Guerrier a encore des points de vie, faux sinon.
     */
    public boolean estVivant() {
        return pointsDeVie > 0;
    }

    /**
     * Permet au guerrier courant d’attaquer le guerrier passé en paramètre et de lui faire subir des dégâts.
     * Le calcul des dégâts d’une attaque est basé sur la force du guerrier et d’un lancer de dés :
     * les dégâts infligés sont la somme de n valeurs obtenus au lancés de dés de 3 faces (avec n correspondant à la force du guerrier).
     * Cette méthode fait appel à la méthode subirDegats(int degats) de la classe Guerrier et la méthode de3(int force) de la classe GuerrierUtilitaire.
     *
     * @param autreGuerrier     le Guerrier qui subit l'attaque.
     */
    public void attaquer(Guerrier autreGuerrier) {
        autreGuerrier.subirDegats( GuerrierUtilitaire.de3(this.force) );
    }

    /**
     * Fait subir les dégâts passés en paramètre au guerrier courant : on soustrait les dégâts aux points de vie du guerrier concerné.
     *
     * @param degats    le degats subits par le Guerrier.
     */
    protected void subirDegats(int degats) {
        this.setPointsDeVie(this.getPointsDeVie()-degats);

    }
}
