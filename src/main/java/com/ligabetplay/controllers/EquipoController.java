package com.ligabetplay.controllers;

import java.util.ArrayList;
import java.lang.Math;
import com.ligabetplay.models.Equipo;
import java.util.Collections;
import java.util.Comparator;

public class EquipoController {
    // atributos
    private ArrayList<Equipo> equipos;

    //get de equipos
    public ArrayList<Equipo> getEquipos(){
        return this.equipos;
    }   

    /*---- FUNCION DE CUANDO EL QUIPO JUEGA**/
    public void equipoJuega(Equipo equipo, int puntosObtenidos, int golesAnotados, int golesRecibidos){
        equipo.setPartidosJugados(equipo.getPartidosJugados() + 1);//partidosJugados++; 
        equipo.setTotalPuntos(equipo.getTotalPuntos() + puntosObtenidos);//totalPuntos += puntosObtenidos;
        equipo.setGolesAFavor(equipo.getGolesAFavor() + golesAnotados);//golesAFavor += golesAnotados;
        equipo.setGolesEnContra(equipo.getGolesEnContra() + golesRecibidos); 
    }

    /*EquipoGana */
    public void equipoGana(Equipo equipo, int golesAnotados, int golesRecibidos){
        equipo.setPartidosGanados(equipo.getPartidosGanados() + 1);
        this.equipoJuega(equipo, 3, golesAnotados, golesRecibidos);
    }


    /*Equipo pierde*/
    public void equipoPierde(Equipo equipo, int golesAnotados, int golesRecibidos){
        equipo.setPartidosPerdidos(equipo.getPartidosPerdidos() + 1);
        this.equipoJuega(equipo, 0, golesAnotados, golesRecibidos);
    }

    /*E*Equipo cuando empata*/
    public void equipoEmpata(Equipo equipo, int golesAnotados, int golesRecibidos){
        equipo.setPartidosEmpatados(equipo.getPartidosEmpatados() + 1);
        this.equipoJuega(equipo, 1, golesAnotados, golesRecibidos);
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

    /*--- GENERAR TABLA DE POSICIONES ---*/
    public void generarTablaDePosiciones(ArrayList<Equipo> equipos){
        Collections.sort(equipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo equipo1, Equipo equipo2) {
                // Primero comparamos los puntos
                if (equipo1.getTotalPuntos() != equipo2.getTotalPuntos()) {
                    return Integer.compare(equipo2.getTotalPuntos(), equipo1.getTotalPuntos());
                }
                
                // Si los puntos son iguales, comparamos la diferencia de goles
                int diferenciaGoles1 = equipo1.getDiferenciaDeGoles();
                int diferenciaGoles2 = equipo2.getDiferenciaDeGoles();
                if (diferenciaGoles1 != diferenciaGoles2) {
                    return Integer.compare(diferenciaGoles2, diferenciaGoles1);
                }
                
                // Si la diferencia de goles es igual, comparamos los goles a favor
                return Integer.compare(equipo2.getGolesAFavor(), equipo1.getGolesAFavor());
            }
        });
    }
}
