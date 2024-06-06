package com.ligabetplay.models;

public class Persona {
    private String nombre;
    private String nacionalidad;


    public Persona(String nombre, String nacionalidad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
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


    @Override
    public String toString() {
        return "Person [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
    }

}
