package com.example.armin.educativasim.Rededucativa.db;

/**
 * Created by armin on 30/08/2018.
 */

public final class Respuestas {

    int id;
    int pregunta_id;
    int respuesta;
    int imagen;

    public Respuestas(int id, int pregunta_id, int respuesta, int imagen) {
        this.id = id;
        this.pregunta_id = pregunta_id;
        this.respuesta = respuesta;
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

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
