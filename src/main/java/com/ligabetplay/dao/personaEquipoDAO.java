package com.ligabetplay.dao;

import java.util.List;

import com.ligabetplay.models.Equipo;
import com.ligabetplay.models.Jugador;

public class personaEquipoDAO {

    public static  void agregarJugador(Jugador jugador, Equipo equipo){
        List<Jugador>  jugadores= equipo.getJugadores();
        jugadores.add(jugador);
    }
}
