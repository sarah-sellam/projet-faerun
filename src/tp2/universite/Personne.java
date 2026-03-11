package tp2.universite;

import tp1.universite.EtudiantUtilitaire;

/**
 * Classe des personnes de l'établissement
 * @author Sarah Sellam
 */
public abstract class Personne {
    // attributs privés
    private String login;
    private String prenom;
    private String nom;
    private String adresse;


    //========================================================
    // === Constructeurs ===

    /**
     * Construire un objet Etudiant avec les informations de la personne (son login, son prénom et son nom).
     *
     * @param login     le login de la personne
     * @param prenom    le prénom de la personne
     * @param nom   le nom de la personne
     */
    public Personne(String login, String prenom, String nom) {
        this.setLogin(login);    // Utilisation de setLogin(...) plutôt que : this.login = login;
        this.setPrenom(prenom);  // Utilisation de setPrenom(...) plutôt que : this.prenom = prenom;
        this.setNom(nom);        // Utilisation de setNom(...) plutôt que : this.nom = nom;
    }

    /**
     * Construire un objet Etudiant avec les informations de la personne (son login, son prénom, son nom et son adresse).
     *
     * @param login     le login de la personne
     * @param prenom    le prénom de la personne
     * @param nom   le nom de la personne
     * @param adresse   l'adresse de la personne
     */
    public Personne(String login, String prenom, String nom, String adresse) {
        this.setLogin(login);    // Utilisation de setLogin(...) plutôt que : this.login = login;
        this.setPrenom(prenom);  // Utilisation de setPrenom(...) plutôt que : this.prenom = prenom;
        this.setNom(nom);        // Utilisation de setNom(...) plutôt que : this.nom = nom;
        this.setAdresse(adresse);        // Utilisation de setAdresse(...) plutôt que : this.adresse = adresse;
    }


    //========================================================
    // === Méthodes Getters ===

    /**
     * Retourner le login de la personne.
     *
     * @return login    le login de la personne
     */
    public String getLogin() {
        return login;
    }

    /**
     * Retourner le prénom de la personne.
     *
     * @return prenom    le prenom de la personne
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Retourner le nom de la personne.
     *
     * @return nom    le nom de la personne
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourner le nom complet (prenom et nom) de la personne.
     *
     * @return prenom + " " + nom    le nom complet de la personne
     */
    public String getNomComplet() {
        return prenom + " " + nom;
    }
    /**
     * Retourner l'adresse de la personne.
     *
     * @return adresse    l'adresse de la personne
     */
    public String getAdresse() {
        return adresse;
    }


    /**
     * Retourner l'adresse email de la personne, selon si c'est un étudiant ou un membre du personnel.
     * à partir de son prenom en minuscule et de son nom en minuscule séparés par un point
     * ainsi que du format de mail
     * ("@etu.univ-grenoble-alpes.fr" si c'est un étudiant
     * ou "@univ-grenoble-alpes.fr" si c'est un membre du personnel).
     *
     * @return l'adresse email de la personne.
     */
    public abstract String getMail();


//    /**
//     * Retourner l'adresse email de la personne.
//     * à partir de son prenom en minuscule et de son nom en minuscule séparés par un point
//     * ainsi que du format de mail "@euniv-grenoble-alpes.fr".
//     *
//     * @return l'adresse email de la personne.
//     */
//
//    public String getMail() {
//        return prenom.toLowerCase() + "." + nom.toLowerCase() + "@univ-grenoble-alpes.fr";
//    }



    //========================================================
    // === Méthodes Setters ===

    /**
     * Modifier le login de la personne : le login devient en minuscule.
     *
     * @param login     le login de la personne
     */
    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }

    /**
     * Modifier le prénom de la personne : la première lettre du prénom devient en majuscule et les autres en minuscule.
     *
     * @param prenom   le prénom de la personne
     */
    public void setPrenom(String prenom) {
        this.prenom =  EtudiantUtilitaire.capitalize(prenom);
    }

    /**
     * Modifier le nom de la personne : la première lettre du nom devient en majuscule et les autres en minuscule.
     *
     * @param nom   le nom de la personne
     */
    public void setNom(String nom) {
        this.nom = EtudiantUtilitaire.capitalize(nom);
    }


    /**
     * Modifier l'adresse de la personne.
     *
     * @param adresse   adresse de la personne
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    //========================================================
    // === Autre méthode ===

    /**
     * Vérifier l'existence d'une adresse pour la personne.
     *
     * @return Vrai si la personne à une adresse, Faux sinon
     */
    public boolean existAdresse() {
        return (adresse!= null && !adresse.isEmpty());
    }

}
