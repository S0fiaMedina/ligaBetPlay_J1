package com.ligabetplay.models;

public class Tecnico extends Persona{
    private String rol;

    public Tecnico(String nombre, String nacionalidad, String rol, String equipo){
        super(nombre, nacionalidad, "Tecnico", equipo);
        this.rol = rol; // rol tecnico
    }
}
