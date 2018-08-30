package com.example.armin.educativasim.Rededucativa.db;

/**
 * Created by armin on 30/08/2018.
 */

public final class Categorias {

    int id;
    String categories;

    public Categorias(int id, String categories) {
        this.id = id;
        this.categories = categories;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
}
