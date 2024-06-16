package com.ligabetplay.models;

import com.ligabetplay.team.Equipo;

public class Tecnico extends Persona{
    private String rol;

    public Tecnico(String nombre, String nacionalidad, String rol, Equipo equipo){
        super(nombre, nacionalidad, "Tecnico", equipo);
        this.rol = rol; // rol tecnico
    }
}
