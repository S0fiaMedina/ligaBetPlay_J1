package com.ligabetplay.models;

public class Partido {
    
    private static int contadorPartidos;
    private int idPartido;
    //Atributos

    private Equipo equipo1;
    private Equipo equipo2;
    
    private String fecha;

    private int golesEquipo1;
    private int golesEquipo2;

    // Constructor vacio
    public Partido(){
        Partido.contadorPartidos++;
        this.idPartido = contadorPartidos;
    }

    // Constructor 
    public Partido(Equipo equipo1, Equipo equipo2, String fecha) {
        this();
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
    }


    // TOSTRING

    @Override
    public String toString() {
        return "Partido [idPartido=" + idPartido + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", fecha=" + fecha
                + ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
    }

    
    // GETTERS Y SETTERS

    public int getIdPartido() {
        return idPartido;
    }



    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }


    public Equipo getEquipo1() {
        return equipo1;
    }


    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }


    public Equipo getEquipo2() {
        return equipo2;
    }


    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }


    public int getGolesEquipo1() {
        return golesEquipo1;
    }


    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }


    public int getGolesEquipo2() {
        return golesEquipo2;
    }


    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    


    

    

}
