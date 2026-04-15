package tp_instruments;

import java.io.Serializable;
import java.util.HashSet;

/**
 *
 * @author Raphaël Bleuse <raphael.bleuse@univ-grenoble-alpes.fr>
 */
public class Seance implements Serializable {

    private static final long serialVersionUID = 1L;  // nécessaire pour la sérialisation

    // TODO: à implémenter

    private Jour jour;
    private Instrument instrument;
    private Enfant enfant;

    public Seance(Jour jour, Instrument instrument, Enfant enfant) {
        this.jour = jour;
        this.instrument = instrument;
        this.enfant = enfant;
    }

    public Jour getJour() {
        return jour;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public Enfant getEnfant() {
        return enfant;
    }

    public void setJour(Jour jour) {
        this.jour = jour;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setEnfant(Enfant enfant) {
        this.enfant = enfant;
    }
}
