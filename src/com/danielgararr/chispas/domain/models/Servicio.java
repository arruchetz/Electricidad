package com.danielgararr.chispas.domain.models;

public class Servicio implements ProductoServicio {
    private Integer idservicio;
    private String nombre;
    private Integer precio;
    private Integer iva;

    @Override
    public Integer getId() {
        return this.idservicio;
    }


    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public Integer getPrecio() {
        return this.precio;
    }

    @Override
    public Integer getIva() {
        return this.iva;
    }

    public void setIdservicio(Integer idservicio) {
        this.idservicio = idservicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }
}
