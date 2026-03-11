package tp3.etudiant;

import tp2.contrainte.Note;
import tp2.universite.Personne;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Classe des étudiants
 */
public class Etudiant extends Personne implements Comparable<Etudiant> {

    // Attribut spécifique à la classe fille Etudiant
    private String adresseParent;
    private ArrayList<Note> notes = new ArrayList<>();

    private Groupe groupe;
    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet Etudiant avec les informations de l'étudiant (son login, son prénom et son nom).
     *
     * @param login     le login de l'étudiant
     * @param prenom    le prénom de l'étudiant
     * @param nom   le nom de l'étudiant
     */
    public Etudiant(String login, String prenom, String nom) {
        // Appel le constructeur de la classe parent (Personne)
        super(login, prenom, nom);
        // (Avec ce constructeur, l'attribut `adresseParent` reste non-initialisé)
    }


    /**
     * Construire un objet Etudiant avec les informations de l'étudiant (son login, son prénom, son nom et son adresse).
     *
     * @param login          le login de l'étudiant
     * @param prenom    le prénom de l'étudiant
     * @param nom   le nom de l'étudiant
     * @param adresse   l'adresse de l'étudiant
     * @param adresseParent   l'adresse des parents de l'étudiant
     */
    public Etudiant(String login, String prenom, String nom, String adresse, String adresseParent) {
        super(login, prenom, nom, adresse);
        this.adresseParent = adresseParent;
    }



    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner l'adresse email de l'étudiant
     * à partir de son prenom en minuscule et de son nom en minuscule séparés par un point
     * ainsi que du format de mail "@etu.univ-grenoble-alpes.fr".
     *
     * @return l'adresse email de l'étudiant.
     */
    @Override
    public String getMail() {
        return super.getPrenom().toLowerCase() + "." + super.getNom().toLowerCase() + "@etu.univ-grenoble-alpes.fr";
    }

    /**
     * Retourner une chaîne de caractères correspondant à l’adresse principale suivi de l’adresse des parents.
     * Si une seule des deux existe, la méthode ne retourne qu’une adresse : soit principale, soit celle des parents
     *
     * @return adresse    l'adresse de l'étudiant
     */
    public String getAdresse() {
        // Si aucune adresse => null ou chaine vide
        // Si 1 seule adresse => L'adresse
        // Si t'as les 2 adresses => Sous la forme "13 rue à côté (Adresse des parents : 23 rue beaucoup plus loin)"


        // si on a pas l'adresse des parents
        if (adresseParent==null) {
            // si on a que l'adresse perso
            if (super.getAdresse()!=null) {
                return super.getAdresse();
                // si on n'a aucune des deux
            } else {
                return null;
            }
        }
        // si il n'existe pas d'adresse perso et si il y a l'adresse des parents
        else if (super.getAdresse() == null && adresseParent != null) {
            return adresseParent;
        }
        // si on a les deux adresses
        else {
            return super.getAdresse() + " (Adresse des parents : " + adresseParent + ")";
        }
    }


    /**
     * Retourner l'adresse du parent de l'étudiant.
     *
     * @return adresse    l'adresse du parent de l'étudiant
     */
    public String getAdresseParent() {
        return adresseParent;
    }


    /**
     * Retourner les notes de l'étudiant.
     *
     * @return  notes
     */
    public ArrayList<Note> getNotes() {
        return notes;
    }

    /**
     * Retourner la moyenne des notes de l'étudiant ou retourner -1 si l'étudiant n'a pas de notes.
     *
     * @return -1 si l'étudiant n'a aucune note, sinon retourne la moyenne des notes de l'étudiant
     */
    public double getMoyenne() {
        if (notes.size()==0){
            return -1;
        } else {
            double somme=0;
            for(int i=0 ; i<notes.size() ; i++){
                somme += notes.get(i).getValeur();
            }
            return somme/notes.size();
        }
    }

    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier les adresses associées à l'étudiant : son adresse personnelle et l'adresse de son parent.
     *
     * @param adresse           l'adresse de l'étudiant
     * @param adresseParent        l'adresse des parents de l'étudiant
     */
    public void setAdresse(String adresse, String adresseParent) {
        super.setAdresse(adresse);
        this.adresseParent = adresseParent;
    }



    //========================================================
    // === Autres méthodes ===

    /**
     * Vérifier l'existence d'une adresse pour l'étudiant.
     *
     * @return Vrai si l'étudiant a au moins une adresse (la sienne ou celle de ses parents), Faux sinon
     */
    public boolean existAdresse() {
        return ( (super.getAdresse() != null && !super.getAdresse().isEmpty() ) || (adresseParent != null && !adresseParent.isEmpty()));
    }


    /**
     * Ajouter la note aux notes de l'étudiant.
     *
     * @param note  la note
     */
    public void addNote(Note note) {
        notes.add(note);
    }


    /**
     * Comparer deux étudiants entre eux.
     *
     * @param etudiant  l'étudiant avec lequel on veut comparer.
     *
     * @return
     */
    @Override
    public int compareTo(Etudiant etudiant) {
        if(this.getNom().compareTo( etudiant.getNom() ) < 0) {
            return -1;
        } else if (this.getNom().compareTo( etudiant.getNom() ) > 0){
            return 1;
        } else {        // mêmes noms
            if(this.getPrenom().compareTo( etudiant.getPrenom() ) < 0) {
                return -1;
            } else if (this.getPrenom().compareTo( etudiant.getPrenom() ) > 0){
                return 1;
            } else {        // et mêmes prénoms
                return 0;
            }
        }
    }


    public static final Comparator<Etudiant> CompEtudiantTriParAttrNomPrenom = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant etu1, Etudiant etu2) {
            if (etu1.getMoyenne() < etu2.getMoyenne()) {
                return -1;
            } else if (etu1.getMoyenne() == etu2.getMoyenne()) {
                return 0;
            } else {
                return 1;
            }
        }
    };


    //========================================================
    // === Méthodes pour gérer le groupe ===

    /**
     * Vérifier si l'étudiant appartient à un groupe.
     * Retourne vrai si l'étudiant appartient à un groupe, faux sinon.
     *
     * @return  true ou false
     */
    public boolean existGroupe() {
        return groupe != null;
    }

    /**
     * Vérifier si l'étudiant appartient à un groupe donné.
     * Retourne vrai si l'étudiant appartient au groupe, faux sinon
     *
     * @param groupe    le groupe pour lequel on vérifie l'appartenance.
     * @return  true ou false
     */
    public boolean isContainedGroupe(Groupe groupe) {
        return (existGroupe() && this.groupe.getLibelle().compareTo(groupe.getLibelle()) ==0 );
    }

    /**
     * Retourner le groupe de l'étudiant.
     *
     * @return      groupe
     */
    public Groupe getGroupe() {
        return groupe;
    }

    /**
     * Modifier le groupe de l'étudiant.
     *
     * @param groupe    le nouveau groupe de l'étudiant
     */
    public void setGroupe(Groupe groupe) {
        // si pas déjà dans CE groupe
        if (!isContainedGroupe(groupe)) {
            // si déjà dans un autre groupe, on le supprime de l'autre groupe
            if (existGroupe()) {
                this.groupe.removeEtudiant(this);
            }
            // on change le groupe de l'étudiant
            this.groupe = groupe;
            // Si l'étudiant n'est pas déjà dans le groupe, on l'ajoute au groupe
            if (existGroupe() && !groupe.containsEtudiant(this)) {
                groupe.addEtudiant(this);
            }
        }
    }

}