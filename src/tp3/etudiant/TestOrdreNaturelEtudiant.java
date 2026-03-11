package tp3.etudiant;

import tp2.universite.Personne;
import tp2.universite.UniversiteUtilitaire;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class TestOrdreNaturelEtudiant {

    private static void affichageEtudiants(Collection<Etudiant> etudiants) {
        for(Etudiant etu : etudiants) {
            System.out.println(etu.getNom() + ", " + etu.getPrenom());
        }
    }

    public static void main(String[] args) {
        // Créer les étudiants
        Etudiant etu1 = new Etudiant("sanzf","floriant","sanz");
        Etudiant etu2 = new Etudiant("portep","pierre-antoine","porte");
        Etudiant etu3 = new Etudiant("burlatn","nils","burlat");
        Etudiant etu4 = new Etudiant("brunetmr","raphaël","brunet-manquat");
        Etudiant etu5 = new Etudiant("brunetmm","maxime","brunet-manquat");



        // Créer la liste d'étudiants quelconque et ajouter les étudiants
        ArrayList<Etudiant> mesEtudiantsOrdreQcq = new ArrayList<>();
        // TODO ...
        mesEtudiantsOrdreQcq.add(etu1);
        mesEtudiantsOrdreQcq.add(etu2);
        mesEtudiantsOrdreQcq.add(etu3);
        mesEtudiantsOrdreQcq.add(etu4);
        mesEtudiantsOrdreQcq.add(etu5);


        // Afficher la liste d'étudiants quelconque
        // (en utilisant la méthode `affichageEtudiants(...)` fournie)
        System.out.println("----------\nLes étudiants (mesEtudiantsOrdreQcq) :");
        affichageEtudiants(mesEtudiantsOrdreQcq);

        // Créer l'ensemble d'étudiants trié et ajouter les mêmes étudiants
        TreeSet<Etudiant> mesEtudiantsTries = new TreeSet<>();
        // TODO ...
        mesEtudiantsTries.add(etu1);
        mesEtudiantsTries.add(etu2);
        mesEtudiantsTries.add(etu3);
        mesEtudiantsTries.add(etu4);
        mesEtudiantsTries.add(etu5);


        // Afficher l'ensemble d'étudiants trié
        // (en utilisant la méthode `affichageEtudiants(...)` fournie)
        System.out.println("----------\nLes étudiants triés (mesEtudiantsTries) :");
        affichageEtudiants(mesEtudiantsTries);
    }
}
