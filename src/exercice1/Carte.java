package exercice1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Carte {

    ArrayList<MenuDeBase> menus = new ArrayList<>();
    ArrayList<Plat> entrees = new ArrayList<>();
    ArrayList<Plat> platsPrincipaux = new ArrayList<>();
    ArrayList<Plat> desserts = new ArrayList<>();

    public Carte() {

    }

    public void addEntree(Plat entree) {
        if (entree != null) {
            entrees.add(entree);
        }
    }

    public void addPlatPrincipal(Plat platPrincipal) {
        if (platPrincipal != null) {
            platsPrincipaux.add(platPrincipal);
        }
    }

    public void addDessert(Plat dessert) {
        if (dessert != null) {
            desserts.add(dessert);
        }
    }

    /**
     * On ajoute un menu à la liste des menus de la carte.
     * On vérifie d'abord que le paramètre n'est pas null avant insertion.
     * @param menuDeBase    menu à ajouter à la carte
     */

    public void addMenu(MenuDeBase menuDeBase) {
        if (menuDeBase != null) {
            menus.add(menuDeBase);
        }
    }

    public Collection<Plat> getEntrees() {
        return entrees;
    }

    public Collection<Plat> getPlatsPrincipaux() {
        return platsPrincipaux;
    }

    public Collection<Plat> getDesserts() {
        return desserts;
    }

    public Collection<MenuDeBase> getMenus() {
        return menus;
    }




}
