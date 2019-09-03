package com.example.prueba2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class ApiObject {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("rareza")
    @Expose
    private String rareza;
    @SerializedName("foto")
    @Expose
    private String foto;
    @SerializedName("clase")
    @Expose
    private String clase;

    public ApiObject(String title, String description) {
        this.nombre = title;
        this.clase = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
