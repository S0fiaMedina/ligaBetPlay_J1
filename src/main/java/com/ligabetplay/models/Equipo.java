package com.ligabetplay.models;
import java.util.ArrayList;
import java.util.List;

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
    private Equipo(){
        
        Equipo.contadorEquipos++; // actualiza id
        this.idEquipo = contadorEquipos;

        // inicializa las variables en 0
        this.partidosJugados = 0;
        this.partidosGanados = 0;
        this.partidosPerdidos = 0;
        this.partidosEmpatados = 0;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
        this.totalPuntos = 0;
        
    }

    // Constructor con agumentos
    public Equipo(String nombre){
        this();
        this.nombre = nombre;
    }
    
    // recibe los goles obtenidos, los goles en contra y los puntos ganados y aumenta partidos >:(
    

    // GETTERS

    
    //toString
   

    public static int getContadorEquipos() {
        return contadorEquipos;
    }


   
    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public int getDiferenciaGoles() {
        return this.golesAFavor - this.golesEnContra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Equipo { id = '").append(this.idEquipo).append('\'');
        sb.append(", nombre = '").append(this.nombre).append('\'');
        sb.append(", partidos jugados = '").append(this.partidosJugados).append('\'');
        sb.append(", partidos ganados = '").append(this.partidosGanados).append('\'');
        sb.append(", partidos perdidos = '").append(this.partidosPerdidos).append('\'');
        sb.append(", partidos empatados = '").append(this.partidosGanados).append('\'');
        sb.append(", goles a favor = '").append(this.golesAFavor).append('\'');
        sb.append(", goles en contra = '").append(this.golesEnContra).append('\'');
        sb.append(", suma de puntos = '").append(this.totalPuntos).append('\'');
        return sb.toString();
    }
    
}