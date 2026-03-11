package tp1.universite;

/**
 * Classe Etudiant, de définition et de gestion des étudiants
 * @author Sarah Sellam
 */
public class Etudiant {
    // attributs privés
    private String login;
    private String prenom;
    private String nom;
    private String adresse;

    // OPTION 1 : Vous déclarez et initialisez votre tableau en même temps avec :
    private double[] notes = new double[5];
    /*
    // OPTION 2 : Vous déclarez votre tableau parmis les attributs,
    //  et vous l'initialisez dans le constructeur de votre classe :
    private double[] notes;
    // (...)
    public Etudiant( *//* (...) *//* ) {
        // (...)
        notes = new double[5];
    }
    */
    private int nbNotes;
    private Groupe groupe;


    //========================================================
    // === Constructeurs ===

    /**
     * Construit un objet Etudiant avec les informations de l'étudiant (son login, son prénom et son nom).
     *
     * @param login     le login de l'étudiant
     * @param prenom    le prénom de l'étudiant
     * @param nom   le nom de l'étudiant
     */
    public Etudiant(String login, String prenom, String nom) {
        this.setLogin(login);    // Utilisation de setLogin(...) plutôt que : this.login = login;
        this.setPrenom(prenom);  // Utilisation de setPrenom(...) plutôt que : this.prenom = prenom;
        this.setNom(nom);        // Utilisation de setNom(...) plutôt que : this.nom = nom;
    }

    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner le login de l'étudiant.
     *
     * @return login    le login de l'étudiant
     */
    public String getLogin() {
        return login;
    }

    /**
     * Retourner le nom de l'étudiant.
     *
     * @return nom    le nom de l'étudiant
     */
    public String getNom() {
        return nom;
    }
    /**
     * Retourner le prénom de l'étudiant.
     *
     * @return prenom    le prenom de l'étudiant
     */
    public String getPrenom() {
        return prenom;
    }
    /**
     * Retourner le nom complet (prenom et nom) de l'étudiant.
     *
     * @return prenom + " " + nom    le nom complet de l'étudiant
     */
    public String getNomComplet() {
        return prenom + " " + nom;
    }
    /**
     * Retourner l'adresse de l'étudiant.
     *
     * @return adresse    l'adresse de l'étudiant
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Retourner l'adresse email de l'étudiant
     * à partir de son prenom en minuscule et de son nom en minuscule séparés par un point
     * ainsi que du format de mail "@etu.univ-grenoble-alpes.fr".
     *
     * @return l'adresse email de l'étudiant.
     */
    public String getMail() {
        return prenom.toLowerCase() + "." + nom.toLowerCase() + "@etu.univ-grenoble-alpes.fr";
    }

    /**
     * Retourner le tableau des notes de l'étudiant.
     *
     * @return notes    les notes de l'étudiant
     */
    public double[] getNotes() {
        return notes.clone();
    }

    /**
     * Retourner le nombre de notes de l'étudiant.
     *
     * @return notes.length     le nombre de notes de l'étudiant
     */
    public int getNbNotes() {
        return nbNotes;
    }

    /**
     * Retourner la moyenne des notes de l'étudiant ou retourner -1 si l'étudiant n'a pas de notes.
     *
     * @return -1 si l'étudiant n'a aucune note, sinon retourne la moyenne des notes de l'étudiant
     */
    public double getMoyenne() {
        if (nbNotes==0){
            return -1;
        } else {
            double somme=0;
            for(int i=0 ; i<nbNotes ; i++){
                somme += notes[i];
            }
            return somme/nbNotes;
        }
    }

    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier le login de l'étudiant : le login devient en minuscule.
     *
     * @param login     le login de l'étudiant
     */
    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }

    /**
     * Modifier le nom de l'étudiant : la première lettre du nom devient en majuscule et les autres en minuscule.
     *
     * @param nom   le nom de l'étudiant
     */
    public void setNom(String nom) {
        this.nom = EtudiantUtilitaire.capitalize(nom);
    }
    /**
     * Modifier le prénom de l'étudiant : la première lettre du prénom devient en majuscule et les autres en minuscule.
     *
     * @param prenom   le prénom de l'étudiant
     */
    public void setPrenom(String prenom) {
        this.prenom =  EtudiantUtilitaire.capitalize(prenom);
    }

    /**
     * Modifier l'adresse de l'étudiant.
     *
     * @param adresse   adresse de l'étudiant
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    //========================================================
    // === Autre méthode ===

    /**
     * Vérifier l'existence d'une adresse pour l'étudiant.
     *
     * @return Vrai si l'étudiant à une adresse, Faux sinon
     */
    public boolean existAdresse() {
        return adresse != null;
    }

    /**
     * Ajoute la note au tableau de notes de l'étudiant si il n'en a pas déjà cinq.
     *
     * @param note  la note à ajouter au tableau de notes
     */
    public void addNote(double note) {
        if (nbNotes < 5) {
            notes[nbNotes] = note;
            nbNotes++;
        }
    }


    //========================================================
    // === Méthodes pour gérer le groupe ===

    /**
     * Vérifier l'appartenance à un groupe pour l'étudiant.
     *
     * @return Vrai si l'étudiant appartient à un groupe, Faux sinon
     */
    public boolean existGroupe() {
        return groupe != null;
    }

    /**
     * Retourner le groupe de l'étudiant
     *
     * @return groupe   le groupe de l'étudiant
     */
    public Groupe getGroupe() {
        return groupe;
    }

    /**
     * Modifier le groupe de l'étudiant.
     *
     * @param grp   le groupe de l'étudiant
     */
    public void setGroupe(Groupe grp) {
        this.groupe = grp;
    }


}
