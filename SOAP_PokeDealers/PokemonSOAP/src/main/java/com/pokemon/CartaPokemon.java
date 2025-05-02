package com.pokemon;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CartaPokemon {

    private String codigo;
    private String nombre;
    private double precio;
    private String rareza;

    // Constructor vacío requerido por JAXB
    public CartaPokemon() {}

    public CartaPokemon(String codigo, String nombre, double precio, String rareza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.rareza = rareza;
    }

    // Getters y Setters...
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }
}