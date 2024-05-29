package com.ligabetplay;

public class Equipo {
    
   
    // Atributos
    private static int contadorEquipos;


    private  int idEquipo;


    private String nombre;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesAFavor;
    private int golesEnContra;
    private int totalPuntos;


    //Constructor
    public Equipo(String nombre){
        
        Equipo.contadorEquipos++; // actualiza id
        this.idEquipo = contadorEquipos;
        
        this.nombre = nombre; // pone el nombre

        // inicializa las variables en 0
        this.partidosJugados = 0;
        this.partidosGanados = 0;
        this.partidosPerdidos = 0;
        this.partidosEmpatados = 0;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
        this.totalPuntos = 0;
        
    }
    
    // recibe los goles obtenidos, los goles en contra y los puntos ganados y aumenta partidos >:(
    public  void jugarPartido(int golesAnotados, int golesRecibidos, int puntosObtenidos){
        this.partidosJugados++;
        this.totalPuntos += puntosObtenidos;
        this.golesAFavor += golesAnotados;
        this.golesEnContra += golesRecibidos;
    }

    // GETTERS

    public int getIdEquipo() {
        return idEquipo;
    }


    public String getNombre() {
        return nombre;
    }


    public int getPartidosJugados() {
        return partidosJugados;
    }


    public int getPartidosGanados() {
        return partidosGanados;
    }


    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }


    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }


    public int getGolesAFavor() {
        return golesAFavor;
    }


    public int getGolesEnContra() {
        return golesEnContra;
    }


    public int getTotalPuntos() {
        return totalPuntos;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }
    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }
    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }
    //toString
    @Override
    public String toString() {
        return "Equipo [idEquipo=" + idEquipo + ", nombre=" + nombre + ", partidosJugados=" + partidosJugados
                + ", partidosGanados=" + partidosGanados + ", partidosPerdidos=" + partidosPerdidos
                + ", partidosEmpatados=" + partidosEmpatados + ", golesAFavor=" + golesAFavor + ", golesEnContra="
                + golesEnContra + ", totalPuntos=" + totalPuntos + "]";
    }

    
    
}