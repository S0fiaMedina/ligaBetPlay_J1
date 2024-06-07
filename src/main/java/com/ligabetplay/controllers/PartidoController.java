package com.ligabetplay.controllers;

import java.util.ArrayList;
import java.util.Scanner;


import com.ligabetplay.Utileria;
import com.ligabetplay.models.Equipo;
import com.ligabetplay.models.Partido;
import com.ligabetplay.models.Jugador;
import com.ligabetplay.views.PartidoView;
import com.ligabetplay.views.JugadorView;
import com.ligabetplay.views.EquipoView;

public class PartidoController {
    Scanner scanner = new Scanner(System.in);
    EquipoView equipoView = new EquipoView();
    PartidoView partidoView = new PartidoView();
    EquipoController equipoController = new EquipoController();
    JugadorView jugadorView = new JugadorView();

    ArrayList<Partido> partidos = new ArrayList<>();

    public void registroDePartidos(){
        
        String fecha = Utileria.validarFecha(scanner.nextLine());
        Equipo equipoLocal = partidoView.getLocal();
        int marcadorLocal = partidoView.getMarcador();
        Equipo equipoVisitante = partidoView.getVisitante(); 
        int marcadorVisitante = partidoView.getMarcador();

        if (marcadorLocal > marcadorVisitante){
            equipoController.equipoGana(equipoLocal, marcadorLocal, marcadorVisitante);
            equipoController.equipoPierde(equipoVisitante, marcadorVisitante, marcadorLocal);
        } else if (marcadorVisitante > marcadorLocal){
            equipoController.equipoGana(equipoVisitante, marcadorVisitante, marcadorLocal);
            equipoController.equipoPierde(equipoLocal, marcadorLocal, marcadorVisitante);
        } else{
            equipoController.equipoEmpata(equipoVisitante, marcadorVisitante, marcadorLocal);
            equipoController.equipoEmpata(equipoLocal, marcadorLocal, marcadorVisitante); 
        }

        if (marcadorLocal != 0){
            jugadorView.getJugadorDeLista(equipoLocal); // obtiene un jugador 
        }
        if (marcadorVisitante != 0){
            jugadorView.getJugadorDeLista(equipoVisitante); // obtiene un jugador
        }

        Partido partido = new Partido(equipoLocal, marcadorLocal, equipoVisitante, marcadorVisitante, fecha);
        partidos.add(partido);
    }

    public ArrayList<Jugador> getGoleadores(){
        // poner lista de jugadores de jugadores
    }



    
}
