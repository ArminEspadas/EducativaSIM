package com.example.armin.educativasim.Rededucativa.db;

/**
 * Created by armin on 30/08/2018.
 */

public final class Solucion {

    int id;
    int pregunta_id;
    String descripcion;
    String imagen;

    public Solucion(int id, int pregunta_id, String descripcion, String imagen) {
        this.id = id;
        this.pregunta_id = pregunta_id;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPregunta_id() {
        return pregunta_id;
    }

    public void setPregunta_id(int pregunta_id) {
        this.pregunta_id = pregunta_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
