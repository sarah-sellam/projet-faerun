package tp5.tabledemultiplication;

import java.util.ArrayList;
import java.util.Collections;

public class TableDeMultiplication {
    private static final int MIN_TABLE = 1;
    private static final int MAX_TABLE = 10;

    private int nombreTable;

    private ArrayList<Multiplication> multiplications;

    private boolean modeSansErreur = false;

    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet de type TableDeMultiplication à partir d'un nombre qui définit quelle table,
     * d'un booléen estMelange (false si on veut que la table soit dans l'ordre, true sinon)
     * et d'un booléen modeSansErreur (true pour utiliser le mode sans erreur, false sinon).
     * @param nombreTable   le numéro de la table
     * @param estMelange    false si la table est dans l'ordre, true sinon
     * @param modeSansErreur    true si le mode est sans erreur, false sinon
     * @throws ErreurMultiplicationException    exception sur l'objet multiplication
     */
    public TableDeMultiplication(int nombreTable, boolean estMelange, boolean modeSansErreur) throws ErreurMultiplicationException {
        this.nombreTable = nombreTable;

        this.multiplications = new ArrayList<>();
        this.modeSansErreur = modeSansErreur;

        initialisation();
        if (estMelange) {
            melange();
        }

    }


    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourne le nombre de réponses justes données par l'utilisateur
     * @return  nombre de réponses justes données par l'utilisateur
     */
    public int getNombreReponsesJustes() {
        int cpt = 0;
        for ( int i = 0 ; i < multiplications.size() ; i++ ) {
            if ( multiplications.get(i).isReponseJuste() ) {
                cpt++;
            }
        }
        return cpt;
    }

    /**
     * Retourne le nombre de multiplications d'une table.
     * @return le nombre de multiplications d'une table
     */
    public int getNombreDeMultiplications() {
        return multiplications.size();
    }

    /**
     * Retourne la multiplication d'indice index de la table de multplication.
     * @param index indice de la table de multiplication
     * @return  la multiplication d'indice index de la table de multplication
     */
    public Multiplication getMultiplication(int index) {
        return multiplications.get(index);
    }

    //========================================================
    // === Autres Méthodes ===

    /**
     *  initialise la liste de multiplications de la table de multiplication.
     * @throws ErreurMultiplicationException    exception sur une multiplication
     */
    private void initialisation() throws ErreurMultiplicationException {
        for ( int i = MIN_TABLE ; i <= MAX_TABLE ; i++ ) {
            multiplications.add(new Multiplication(nombreTable, i, modeSansErreur));
        }
    }

    /**
     * mélange la liste de multiplications de la table de multiplication.
     */
    private void melange() {
        Collections.shuffle(multiplications);

    }

}
