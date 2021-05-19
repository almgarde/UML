package com.mycompany.uml1;

import java.util.*;

public class Agencia {

    private String nombre;
    private String direccion;
    private ArrayList<Reservacion> peticiones;

    public Agencia() {
        peticiones = new ArrayList<Reservacion>();
    }

    public Agencia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        peticiones = new ArrayList<Reservacion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
