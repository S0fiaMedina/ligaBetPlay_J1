package com.ligabetplay.controllers;
import java.util.ArrayList;

import com.ligabetplay.models.Jugador;

public class JugadorController {
    //Atributo

    private ArrayList<Jugador> jugadores;
    /*-- */

    /*---- Jugador con mas goles ---*/
    public Jugador getJugadorConMasGoles(){
        int contadorGoles = 0;
        Jugador jugadorConMasGoles = null;
        for (Jugador jugador : jugadores){
            if (jugador.getGolesAnotados() > contadorGoles){
                jugador = jugadorConMasGoles;
            }
        }
        return jugadorConMasGoles;
    }

    /*---- Jugador con mas goles ---*/
    public Jugador getJugadorConMasTarjetasRojas(){
        int contadorTarjetasRojas = 0;
        Jugador JugadorConMasTarjetasRojas = null;
        for (Jugador jugador : jugadores){
            if (jugador.getTarjetasRojas() > contadorTarjetasRojas){
                jugador = JugadorConMasTarjetasRojas;
            }
        }
        return JugadorConMasTarjetasRojas;
    }

    /*-- jugador con masa tarjetas amarillas ---*/
    public Jugador getJugadorConMasTarjetasAmarillas(){
        int contadorTarjetasAmarillas = 0;
        Jugador JugadorConMasTarjetasAmarillas = null;
        for (Jugador jugador : jugadores){
            if (jugador.getTarjetasAmarillas() > contadorTarjetasAmarillas){
                jugador = JugadorConMasTarjetasAmarillas;
            }
        }
        return JugadorConMasTarjetasAmarillas;
    }
}
