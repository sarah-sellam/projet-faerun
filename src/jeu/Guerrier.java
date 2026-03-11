package jeu;

public class Guerrier {

    private int force;
    private int pointsDeVie;

    public Guerrier() {
        this.force = 10;
        this.setPointsDeVie(100);
    }

    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public boolean estVivant() {
        return pointsDeVie > 0;
    }

    public void attaquer(Guerrier autreGuerrier) {
        autreGuerrier.subirDegats( GuerrierUtilitaire.de3(this.force) );
    }

    protected void subirDegats(int degats) {
        this.setPointsDeVie(this.getPointsDeVie()-degats);

    }
}
