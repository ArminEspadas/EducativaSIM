package com.example.armin.educativasim.Rededucativa.db;

/**
 * Created by armin on 30/08/2018.
 */

public final class Preguntas {

    int id;
    int curso_id;
    int category_id;
    String descripcion;
    int imagen;

    public Preguntas(int id, int curso_id, int category_id, String descripcion, int imagen) {
        this.id = id;
        this.curso_id = curso_id;
        this.category_id = category_id;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


}
