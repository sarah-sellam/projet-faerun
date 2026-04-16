package tp_instruments;

import java.io.Serializable;
import java.util.HashSet;

/**
 *
 * @author Raphaël Bleuse <raphael.bleuse@univ-grenoble-alpes.fr>
 */
public class Instrument implements Serializable {

    private static final long serialVersionUID = 1L;  // nécessaire pour la sérialisation
    private final String nom;

    private HashSet<Seance> seances;

    public Instrument(String nom) {
        this.nom = nom;
        this.seances = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public void addSeance(Seance seance) {
        seances.add(seance);
    }

    public HashSet<Enfant> getEnfantsConnus() {
        HashSet<Enfant> enfantsConnus = new HashSet<>();
        for (Seance s : seances) {
            enfantsConnus.add(s.getEnfant());
        }
        return enfantsConnus;
    }

    public HashSet<Jour> getJoursOccupes() {
        HashSet<Jour> joursOccupes = new HashSet<>();
        for (Seance s : seances) {
            joursOccupes.add(s.getJour());
        }
        return joursOccupes;
    }

    @Override
    public String toString() {
        return this.nom;
    }
}
