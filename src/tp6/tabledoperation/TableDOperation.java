package tp6.tabledoperation;

import java.util.ArrayList;

public class TableDOperation {
    private static final int NB_OP = 5;

    private OperationEnum typeOperation;

    private ArrayList<Operation> operations;

    //========================================================
    // === Constructeur ===

    TableDOperation(OperationEnum typeOperation) {
        this.typeOperation = typeOperation;

        initialisation();
    }


    //========================================================
    // === Méthodes Getters ===

    public int getNbReponsesJustes() {
        int cpt = 0;
        for ( int i = 0 ; i < operations.size() ; i++ ) {
            if ( operations.get(i).isReponseJuste() ) {
                cpt++;
            }
        }
        return cpt;
    }

    public int getNombreDOperations() {
        return operations.size();
    }

    public Operation getOperation(int index) {
        return operations.get(index);
    }


    //========================================================
    // === Autres Méthodes ===

    private void initialisation() {
        if ( typeOperation == OperationEnum.ADDITION ) {
            for ( int i = 1 ; i <= NB_OP ; i++ ) {
                operations.add( new Addition( OperationUtilitaire.arrondir(OperationUtilitaire.randomDouble()) ,
                        OperationUtilitaire.arrondir(OperationUtilitaire.randomDouble()) ) );
            }
        } else if ( typeOperation == OperationEnum.SOUSTRACTION ) {
            for ( int i = 1 ; i <= NB_OP ; i++ ) {
                operations.add( new Soustraction( OperationUtilitaire.arrondir(OperationUtilitaire.randomDouble()) ,
                        OperationUtilitaire.arrondir(OperationUtilitaire.randomDouble()) ) );
            }
        } else {
            for ( int i = 1 ; i <= NB_OP ; i++ ) {
                operations.add( new Multiplication( (int)(OperationUtilitaire.randomDouble()) ,
                        (int)(OperationUtilitaire.randomDouble()) ) );
            }
        }

    }

}
