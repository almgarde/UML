package com.mycompany.uml1;

import java.util.*;

public class Coche {

    private int precio;
    private boolean cocheDisponible;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private ArrayList<Reservacion> reservas;
    private Garaje garaje;

    public Coche() {
        reservas = new ArrayList<Reservacion>();
        garaje = new Garaje();
    }

    public Coche(int precio, boolean cocheDisponible, String matricula, String marca, String modelo, String color) {
        this.precio = precio;
        this.cocheDisponible = cocheDisponible;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        reservas = new ArrayList<Reservacion>();
        garaje = new Garaje();
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isCocheDisponible() {
        return cocheDisponible;
    }

    public void setCocheDisponible(boolean cocheDisponible) {
        this.cocheDisponible = cocheDisponible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
