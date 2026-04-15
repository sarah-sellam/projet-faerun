package tp_instruments;

import java.io.Serializable;

/**
 *
 * @author Raphaël Bleuse <raphael.bleuse@univ-grenoble-alpes.fr>
 */
public class Enfant implements Serializable {

    private static final long serialVersionUID = 1L;  // nécessaire pour la sérialisation
    private final String nom;

    public Enfant(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    @Override
    public String toString() {
        return this.nom;
    }
}
