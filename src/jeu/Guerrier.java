package jeu;

/**
 * La classe Guerrier, de définition et de gestion des guerriers de la bataille de Faërun. Il s'agit d'une classe abstraite, classe mère des classes Nain, ChefNain, Elfe et ChefElfe.
 *
 * @author Sarah Sellam
 */
public abstract class Guerrier {
    /**
     * FORCE_BASE est attribut privé, une constante de type entier, désignant la force de base d'un guerrier.
     */
    private static final int FORCE_BASE = 10;

    /**
     * PV_MAX_BASE est attribut privé, une constante de type entier, désignant les points de vie maximum d'un guerrier.
     */
    private static final int PV_MAX_BASE = 100;
    /**
     * Nombre de ressources de base nécessaires pour entraîner un guerrier.
     */
    private static final int RESSOURCES_BASE = 1;


    /**
     * pointsDeVie est attribut privé, de type entier, désignant les points de vie d'un guerrier.
     */
    private int pointsDeVie;

    /**
     * chateau est attribut privé, de type Chateau, désignant le chateau auquel appartient un guerrier.
     */
    private Chateau chateau;

    /**
     * Initialise un nouvel objet Guerrier, dont les pointsDeVie sont initialisés à 100, grâce à la constante PV_MAX_BASE.
     */
    public Guerrier() {
        this.setPointsDeVie(PV_MAX_BASE);
    }

    /**
     * Renvoie le nom du guerrier : la méthode est abstraire pour que chaque classe fille puisse définir son propre nom : "Nain", "Chef Nain", "Elfe", "Chef Elfe".
     * @return le nom du guerrier.
     */
    public abstract String getNom();

    /**
     * Renvoie la force de base associée au Guerrier courant.
     * @return  la force de base du Guerrier courant.
     */
    public int getForce() {
        return FORCE_BASE;
    }

    /**
     * Renvoie les points de vie associés au Guerrier courant.
     * @return les points de vie du Guerrier courant.
     */
    public int getPointsDeVie() {
        return pointsDeVie;
    }

    /**
     * Renvoie le nombre de ressources nécessaires pour entraîner le guerrier courant.
     * @return le nombre de ressources nécessaires pour entraîner le guerrier courant
     */
    public int getRessourcesPourEntrainement() {
        return RESSOURCES_BASE;
    }

    /**
     * Renvoie la couleur du château auquel appartient le guerrier, ou renvoie null s'il n'appartient à aucun château.
     * @return la couleur du château auquel appartient le guerrier, ou null s'il n'appartient à aucun château.
     */
    public Couleur getCouleur() {
        if (chateau != null) {
            return chateau.getCouleur();
        } else {
            return null;
        }
    }

    /**
     * Modifie le nombre de points de vie du Guerrier courant : les points de vie ne peuvent pas dépasser PV_MAX_BASE, ni être inférieurs à 0.
     * @param pointsDeVie   le nouveau nombre de points de vie du Guerrier.
     */
    private void setPointsDeVie(int pointsDeVie) {
        if (pointsDeVie > PV_MAX_BASE) {
            this.pointsDeVie = PV_MAX_BASE;
        } else if (pointsDeVie < 0) {
            this.pointsDeVie = 0;
        } else {
            this.pointsDeVie = pointsDeVie;
        }
    }

    /**
     * Associe le guerrier à un château passé en paramètre.
     * @param chateau le château auquel appartient le guerrier.
     */
    public void setChateau(Chateau chateau) {
        this.chateau = chateau;
    }

    /**
     * Renvoie vrai si le Guerrier est vivant (c'est-à-dire que son nombre de points de vie est strictement supérieur à 0), faux sinon.
     * @return  vrai si le Guerrier a encore des points de vie, faux sinon.
     */
    public boolean estVivant() {
        return pointsDeVie > 0;
    }

    /**
     * Renvoie vrai si le guerrier appartient au chateau de couleur bleue, faux sinon.
     * @return  vrai si le guerrier appartient au chateau de couleur bleue, faux sinon.
     */
    public boolean estBleu() {
        return this.getCouleur() == Couleur.BLEU;
    }

    /**
     * Renvoie vrai si le guerrier appartient au chateau de couleur rouge, faux sinon.
     * @return  vrai si le guerrier appartient au chateau de couleur rouge, faux sinon.
     */
    public boolean estRouge() {
        return this.getCouleur() == Couleur.ROUGE;
    }

    /**
     * Permet au guerrier courant d’attaquer le guerrier passé en paramètre et de lui faire subir des dégâts.
     * Le calcul des dégâts d’une attaque est basé sur la force du guerrier et d’un lancer de dés :
     * les dégâts infligés sont la somme de n valeurs obtenus au lancés de dés de 3 faces (avec n correspondant à la force du guerrier).
     * Cette méthode fait appel à la méthode subirDegats(int degats) de la classe Guerrier et la méthode de3(int force) de la classe GuerrierUtilitaire.
     * @param autreGuerrier     le Guerrier qui subit l'attaque.
     */
    public void attaquer(Guerrier autreGuerrier) {
        autreGuerrier.subirDegats( GuerrierUtilitaire.de3(this.getForce()) );
    }

    /**
     * Fait subir les dégâts passés en paramètre au guerrier courant : on soustrait les dégâts aux points de vie du guerrier concerné.
     * @param degats    les degats subits par le Guerrier.
     */
    protected void subirDegats(int degats) {
        this.setPointsDeVie(this.getPointsDeVie() - degats);
    }
}
