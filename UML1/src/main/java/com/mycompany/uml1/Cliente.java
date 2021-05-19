package com.mycompany.uml1;

import java.util.ArrayList;

public class Cliente {

    private String codigo;
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    private Cliente avalista;
    private ArrayList<Reservacion> solicitudes;

    public Cliente() {
        solicitudes = new ArrayList<Reservacion>();
    }

    public Cliente(String codigo, String nombre, String dni, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        solicitudes = new ArrayList<Reservacion>();
    }

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
