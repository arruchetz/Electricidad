package com.danielgararr.chispas;

public class Producto implements ProductoServicio {
    private Integer idproducto;
    private String nombre;
    private String marca;
    private String modelo;
    private Integer precio;
    private Integer iva;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }


    @Override
    public Integer getId() {
        return this.idproducto;
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

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
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
