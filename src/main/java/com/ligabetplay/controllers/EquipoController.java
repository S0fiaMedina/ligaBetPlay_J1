package com.ligabetplay.controllers;

import java.util.ArrayList;
import java.lang.Math;
import com.ligabetplay.models.Equipo;

public class EquipoController {


    // atributos
    private ArrayList<Equipo> equipos;

    //get de equipos
    public ArrayList<Equipo> getEquipos(){
        return this.equipos;
    }   

    /*----- AÑADIR EQUIPO ----*/
    public void nuevoEquipo(String nombre){
        Equipo equipo = new Equipo(nombre);
        equipos.add(equipo);
    }

    
    
    /*---- EQUIPO CON MAS GOLES ----*/
    public Equipo getEquipoConMasGoles(){
        int contadorGoles =  0;
        Equipo equipoConMasGoles = null;

        // busca el equipo con más goles
        for (Equipo equipo: this.equipos){
            if (equipo.getGolesAFavor() > contadorGoles ){
                contadorGoles = equipo.getGolesAFavor();
                equipoConMasGoles = equipo;
            }
        }
        return equipoConMasGoles;
    }

    
    /*---- EQUIPO CON MAS PUNTOS -----*/
    public Equipo getEquipoConMasPuntos(){
        int contador =  0;
        Equipo equipoConMasPuntos = null;


        // busca el equipo con más goles
        for (Equipo equipo: this.equipos){
            if (equipo.getTotalPuntos() > contador ){
                contador = equipo.getTotalPuntos();
                equipoConMasPuntos = equipo;
            }
        }
       return equipoConMasPuntos;
    }


    /*---- EQUIPO CON MAS PARTIDOS GANADOS -----*/
    public Equipo getEquipoConMasPartidosGanados(){
        int contador =  0;
        Equipo equipoConMasPartidosGanados = null;

        // busca el equipo con más goles
        for (Equipo equipo: this.equipos){
            if (equipo.getPartidosGanados() > contador ){
                contador = equipo.getPartidosGanados();
                equipoConMasPartidosGanados = equipo;
            }
        }
        return equipoConMasPartidosGanados;
    }

    /*----- SUMA  DE GOLES DE EQUIPOS ----*/
    public int getSumaDeGoles(){
        int acumulador = 0;
        for (Equipo equipo : equipos){
            acumulador += equipo.getGolesAFavor();
        }
        return acumulador;
    }

    /*--- PROMEDIO DE GOLES------*/
    public double getPromedioGoles(){
        int sumaGoles = this.getSumaDeGoles();
        double promedioDeGoles = (double) sumaGoles / equipos.size(); 
        return Math.floor(promedioDeGoles);
    }
}
