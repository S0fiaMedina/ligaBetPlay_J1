package com.ligabetplay.dao;

import java.util.List;

import com.ligabetplay.models.Equipo;
import com.ligabetplay.models.Jugador;

public interface jugadorDAO {


    public void agregarJugador( Jugador jugador);

    // traer jugadores por equipo
    public List<Jugador> getJugadores();

    public List<Jugador> cargarJugadores(); // traer a los equipos del json

    public void guadarJugadores(); // guardar lo creado en un archivo
}
