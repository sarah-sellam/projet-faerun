package tp2.telephone;

import java.util.ArrayList;

public class Telephone {
    private String libelle;
    private Processeur processeur;
    private Memoire stockage;
    private ArrayList<Memoire> ram = new ArrayList<>();
    private Ecran ecran;


    //========================================================
    // === Constructeurs ===
    public Telephone(String libelle, Processeur processeur, Memoire Stockage, Ecran ecran) {
        this.libelle = libelle;
        this.processeur = processeur;
        this.stockage = Stockage;
        this.ecran = ecran;
    }

    //========================================================
    // === Méthodes Getters ===

    public int getNombreGigaRam() {
        if (ram.size()==0) {
            return 0;
        } else {
            int somme = 0;
            for (int i = 0 ; i < ram.size() ; i++) {
                somme += ram.get(i).getNombreGiga();
            }
            return somme;
        }

    }



    //========================================================
    // === Autres Méthodes ===

    public void addRam(Memoire Ram) {
        ram.add(Ram);
    }


    @Override
    public String toString() {
        String resultat = libelle + ", " + processeur.toString() + ", ram = " + getNombreGigaRam() + "Giga [";
        if (ram.size()!=0) {
            for (int i=0 ; i<ram.size() ; i++) {
                resultat += ram.get(i).getType();
                if (i < ram.size()-1) {
                    resultat += " + ";
                }
            }
        }
        return resultat + "], " + stockage.toString() + ", " + ecran.toString();
    }

}
