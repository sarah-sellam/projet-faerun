package tp3.etudiant;

import tp2.contrainte.Note;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static tp3.etudiant.Etudiant.CompEtudiantTriParAttrNomPrenom;

public class TestEtudiantTriMoyenne {

    private static void affichageEtudiants(Collection<Etudiant> etudiants) {
        for(Etudiant etu : etudiants) {
            System.out.println("Moyenne = " + etu.getMoyenne() + ": " + etu.getNom() + ", " + etu.getPrenom());
        }
    }

    public static void main(String[] args) {

        // Créer les étudiants
        Etudiant etu1 = new Etudiant("sanzf","floriant","sanz");
        Etudiant etu2 = new Etudiant("portep","pierre-antoine","porte");
        Etudiant etu3 = new Etudiant("burlatn","nils","burlat");
        Etudiant etu4 = new Etudiant("brunetmr","raphaël","brunet-manquat");
        Etudiant etu5 = new Etudiant("brunetmm","maxime","brunet-manquat");

        // Ajouter des notes aux étudiants
        etu1.addNote(new Note(16));

        etu2.addNote(new Note(7));
        etu2.addNote(new Note(11));

        etu3.addNote(new Note(13));
        etu3.addNote(new Note(12.5));
        etu3.addNote(new Note(13.5));

        etu4.addNote(new Note(18));
        etu4.addNote(new Note(20));


        etu5.addNote(new Note(19.9));
        etu5.addNote(new Note(16));
        etu5.addNote(new Note(18.1));





        // Créer la liste d'étudiants et ajouter les étudiants
        ArrayList<Etudiant> mesEtudiantsTries = new ArrayList<>();
        mesEtudiantsTries.add(etu1);
        mesEtudiantsTries.add(etu2);
        mesEtudiantsTries.add(etu3);
        mesEtudiantsTries.add(etu4);
        mesEtudiantsTries.add(etu5);

        // Afficher la liste des étudiants avant tri
        System.out.println("----------");
        System.out.println("Les étudiants AVANT Collections.sort() :");
        affichageEtudiants(mesEtudiantsTries);

        // Trier la liste
        // (En vous basant sur les slides du cours, selon la solution que vous avez choisi)

//        Collections.sort(arrayListeDeMaclasse, CompMaClasseTriParAttrXY);
        Collections.sort(mesEtudiantsTries, CompEtudiantTriParAttrNomPrenom);


        // Afficher la liste des étudiants après tri
        System.out.println("----------");
        System.out.println("Les étudiants APRÈS Collections.sort() :");
        affichageEtudiants(mesEtudiantsTries);
    }
}
