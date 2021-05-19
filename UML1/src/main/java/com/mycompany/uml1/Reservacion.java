package com.mycompany.uml1;

import java.util.*;

public class Reservacion {

    private int precioTotal;

    private Agencia agencia;

    private Cliente cliente;

    private ArrayList<Coche> vehiculos;

    public Reservacion() {

        vehiculos = new ArrayList<Coche>();
        agencia = new Agencia();
        cliente = new Cliente();

    }

    public Reservacion(int precioTotal) {
        this.precioTotal = precioTotal;
        vehiculos = new ArrayList<Coche>();
        agencia = new Agencia();
        cliente = new Cliente();

    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

}
