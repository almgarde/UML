package com.mycompany.uml1;

import java.util.*;

public class ReservacionDetalle {

    private Date fechaInicio;
    private Date fechaFinal;
    private Byte gasolina;
    private ArrayList<Reservacion> reservas;
    private ArrayList<Coche> vehiculos;

    public ReservacionDetalle() {
        reservas = new ArrayList<Reservacion>();
        vehiculos = new ArrayList<Coche>();

    }

    public ReservacionDetalle(Date fechaInicio, Date fechaFinal, Byte gasolina) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.gasolina = gasolina;
        reservas = new ArrayList<Reservacion>();
        vehiculos = new ArrayList<Coche>();

    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Byte getGasolina() {
        return gasolina;
    }

    public void setGasolina(Byte gasolina) {
        this.gasolina = gasolina;
    }

}
