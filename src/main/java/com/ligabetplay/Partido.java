package com.ligabetplay;


public class Partido {
    
    private static int contadorPartidos;
    private int idPartido;
    //Atributos

    private Equipo equipo1;
    private Equipo equipo2;
    
    private int dia;
    private int mes;
    private int anio;

    private int golesEquipo1;
    private int golesEquipo2;

    // Constructor vacio
    public Partido(){
        Partido.contadorPartidos++;
        this.idPartido = contadorPartidos;
    }

    // Constructor 
    public Partido(Equipo equipo1, Equipo equipo2, int dia, int mes, int anio) {
        this();
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }


    // TOSTRING

    @Override
    public String toString() {
        return "Partido [idPartido=" + idPartido + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", dia=" + dia
                + ", mes=" + mes + ", anio=" + anio + ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2="
                + golesEquipo2 + "]";
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    

    

}
