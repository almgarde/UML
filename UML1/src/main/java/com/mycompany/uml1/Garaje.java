package com.mycompany.uml1;

import java.util.*;

public class Garaje {

    private String codigo;
    private int cantidad_max_coches;
    private ArrayList<Coche> garajeCoches;

    public Garaje() {
        garajeCoches = new ArrayList<Coche>();
    }

    public Garaje(String codigo, int cantidad_max_coches) {
        this.codigo = codigo;
        this.cantidad_max_coches = cantidad_max_coches;
        garajeCoches = new ArrayList<Coche>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad_max_coches() {
        return cantidad_max_coches;
    }

    public void setCantidad_max_coches(int cantidad_max_coches) {
        this.cantidad_max_coches = cantidad_max_coches;
    }

}
