package com.ligabetplay.models;

public class Persona {
    private int id;
    private String nombre;
    private String nacionalidad;
    private String rol;
    private Equipo equipo;
    
    
    public Persona(){

    }

    public Persona(String nombre, String nacionalidad, String rol, Equipo equipo){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.rol = rol;
        
        this.equipo = equipo;
    }

    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public int getId(){
        return this.id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }


    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getRol() {
        return rol;
    }


    public void setRol(String rol) {
        this.rol = rol;
    }

    public Equipo getEquipo() {
        return equipo;
    }


    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Persona { id = '").append(this.id).append('\'');
        sb.append(", nombre = '").append(this.nombre).append('\'');
        sb.append(", rol = '").append(this.rol).append('\'').append('\'');
        return sb.toString();
    }
}




