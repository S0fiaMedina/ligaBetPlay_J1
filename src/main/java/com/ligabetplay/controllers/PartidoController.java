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
            this.registrarGoleadores(equipoLocal, marcadorLocal);
        }
        if (marcadorVisitante != 0){
            this.registrarGoleadores(equipoVisitante, marcadorVisitante); // obtiene un jugador
        }

        Partido partido = new Partido(equipoLocal, marcadorLocal, equipoVisitante, marcadorVisitante, fecha);
        partidos.add(partido);
    }

    public void registrarGoleadores(Equipo equipo, int marcadorLocal){
        for (int i = 0; i < marcadorLocal; i++){
            Jugador goleador = partidoView.getGoleadorPartido(equipo, i);
            goleador.setGolesAnotados(goleador.getGolesAnotados() + 1);
            System.out.println(goleador); // print de testeo
        }
    }

    public void añadirTarjetaRoja(Jugador jugador){
        jugador.setTarjetasRojas(jugador.getTarjetasRojas() + 1);
    }
    public void añadirTarjetaAmarilla(Jugador jugador){
        jugador.setTarjetasAmarillas(jugador.getTarjetasAmarillas() + 1);
    }

     // registra la tarjeta al jugador
    public void registroDeTarjetaRoja(Equipo equipo, int numTarjetas){
        for (int i = 0; i < numTarjetas; i++){
            Jugador jugador = partidoView.getJugadorConSancion("roja", equipo, i);
            this.añadirTarjetaRoja(jugador);
        }
    }
    // registra tarjeta amarilla
    public void registroDeTarjetaAmarilla(Equipo equipo, int numTarjetas){
        for (int i = 0; i < numTarjetas; i++){
            Jugador jugador = partidoView.getJugadorConSancion("amarilla", equipo, i);
            this.añadirTarjetaAmarilla(jugador);
        }
    }

   



    
}
