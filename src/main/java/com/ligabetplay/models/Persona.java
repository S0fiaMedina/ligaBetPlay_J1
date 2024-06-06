package com.ligabetplay.models;

public class Persona {
    private String nombre;
    private String nacionalidad;
    private String rol;
    private String equipo;


    public Persona(String nombre, String nacionalidad, String rol, String cuerpoAlQuePertenece, String equipo){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.rol = rol;
        
        this.equipo = equipo;
    }

    
    //getters y setters

    public String getNombre() {
        return nombre;
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


    public String getCuerpoAlQuePertenece() {
        return cuerpoAlQuePertenece;
    }


    public void setCuerpoAlQuePertenece(String cuerpoAlQuePertenece) {
        this.cuerpoAlQuePertenece = cuerpoAlQuePertenece;
    }


    public String getEquipo() {
        return equipo;
    }


    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }


    @Override
    public String toString() {
        return "Person [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
    }

}
