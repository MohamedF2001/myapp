package mohamed.farid.shopping.model;

import android.widget.Button;

/**
 * Créé par M.Farid le 24/11/2020
 */
public class ItemMode {
    //attributs
    private String nom;
    private String indice;
    private int prix;
    //getters
    public String getIndice() { return indice; }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    //constructeurs
    public ItemMode(String nom, String indice, int prix) {
        this.nom = nom;
        this.prix = prix;
        this.indice = indice;
    }
}
