package tp5.tabledemultiplication;

import java.util.ArrayList;
import java.util.Collections;

public class TableDeMultiplication {
    private static final int MIN_TABLE = 1;
    private static final int MAX_TABLE = 10;

    private int nombreTable;

    private ArrayList<Multiplication> multiplications;

    private Boolean modeSansErreur;

    //========================================================
    // === Constructeurs ===
    public TableDeMultiplication(int nombreTable, boolean estMelange) {
        this.nombreTable = nombreTable;

        this.multiplications = new ArrayList<>();
        initialisation();
        if (estMelange) {
            melange();
        }

        this.modeSansErreur = modeSansErreur;
    }


    //========================================================
    // === Méthodes Getters ===

    public int getNombreReponsesJustes() {
        int cpt = 0;
        for ( int i = 0 ; i < multiplications.size() ; i++ ) {
            if ( multiplications.get(i).isReponseJuste() ) {
                cpt++;
            }
        }
        return cpt;
    }

    public int getNombreDeMultiplications() {
        return multiplications.size();
    }

    public Multiplication getMultiplication(int index) {
        return multiplications.get(index);
    }

    //========================================================
    // === Autres Méthodes ===

    private void initialisation() {
        for ( int i = MIN_TABLE ; i <= MAX_TABLE ; i++ ) {
            multiplications.add(new Multiplication(nombreTable, i));
        }
    }

    private void melange() {
        Collections.shuffle(multiplications);

    }

}
