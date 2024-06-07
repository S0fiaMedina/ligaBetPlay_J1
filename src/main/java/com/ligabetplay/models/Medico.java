package com.ligabetplay.models;

public class Medico extends Persona{
    
    private String rol;

    public Medico(String nombre, String nacionalidad, String rol, Equipo equipo){
        super(nombre, nacionalidad, "Medico", equipo);
        this.rol = rol; // rol de medico
    }
    
}
