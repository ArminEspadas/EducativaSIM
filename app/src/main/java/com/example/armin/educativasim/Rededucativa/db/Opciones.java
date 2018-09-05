package com.example.armin.educativasim.Rededucativa.db;

/**
 * Created by armin on 30/08/2018.
 */

public final class Opciones {

    int id;
    int pregunta_id;
    int img_status;

    String opcion_a;
    String imagen_a_id;

    String opcion_b;
    String imagen_b_id;

    String opcion_c;
    String imagen_c_id;

    String opcion_d;
    String imagen_d_id;

    public Opciones(int id, int pregunta_id, int img_status, String opcion_a, String imagen_a_id, String opcion_b, String imagen_b_id, String opcion_c, String imagen_c_id, String opcion_d, String imagen_d_id) {
        this.id = id;
        this.pregunta_id = pregunta_id;
        this.img_status = img_status;
        this.opcion_a = opcion_a;
        this.imagen_a_id = imagen_a_id;
        this.opcion_b = opcion_b;
        this.imagen_b_id = imagen_b_id;
        this.opcion_c = opcion_c;
        this.imagen_c_id = imagen_c_id;
        this.opcion_d = opcion_d;
        this.imagen_d_id = imagen_d_id;
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

    public int getImg_status() {
        return img_status;
    }

    public void setImg_status(int img_status) {
        this.img_status = img_status;
    }

    public String getOpcion_a() {
        return opcion_a;
    }

    public void setOpcion_a(String opcion_a) {
        this.opcion_a = opcion_a;
    }

    public String getImagen_a_id() {
        return imagen_a_id;
    }

    public void setImagen_a_id(String imagen_a_id) {
        this.imagen_a_id = imagen_a_id;
    }

    public String getOpcion_b() {
        return opcion_b;
    }

    public void setOpcion_b(String opcion_b) {
        this.opcion_b = opcion_b;
    }

    public String getImagen_b_id() {
        return imagen_b_id;
    }

    public void setImagen_b_id(String imagen_b_id) {
        this.imagen_b_id = imagen_b_id;
    }

    public String getOpcion_c() {
        return opcion_c;
    }

    public void setOpcion_c(String opcion_c) {
        this.opcion_c = opcion_c;
    }

    public String getImagen_c_id() {
        return imagen_c_id;
    }

    public void setImagen_c_id(String imagen_c_id) {
        this.imagen_c_id = imagen_c_id;
    }

    public String getOpcion_d() {
        return opcion_d;
    }

    public void setOpcion_d(String opcion_d) {
        this.opcion_d = opcion_d;
    }

    public String getImagen_d_id() {
        return imagen_d_id;
    }

    public void setImagen_d_id(String imagen_d_id) {
        this.imagen_d_id = imagen_d_id;
    }
}
