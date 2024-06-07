package com.ligabetplay.views;

import com.ligabetplay.models.Equipo;
import com.ligabetplay.models.Jugador;
import com.ligabetplay.Utileria;
import com.ligabetplay.controllers.JugadorController;

import java.util.ArrayList;
import java.util.Scanner;

public class JugadorView {
    Scanner scanner = new Scanner(System.in);
    JugadorController jugadorController = new JugadorController();
    
    // seleccionar jugador
    public Jugador  getJugadorDeLista(Equipo equipo){
        ArrayList<Jugador> jugadores = equipo.getJugadores();
        this.mostrarJugadoresDeEquipo(equipo);
        int op = Utileria.validarRango(1, jugadores.size()); 
        return jugadores.get(op -1); // retorna el noombre del equipo escogido
    }


    public void mostrarJugadorConMasGoles(){
        Jugador jugadorConMasGoles = jugadorController.getJugadorConMasGoles();
        this.mostrarJugadorConMas("goles", jugadorConMasGoles);
    }

    public void mostrarJugadorConMasTarjetasAmarillas(){
        Jugador jugadorConMasTarjetasAmarillas = jugadorController.getJugadorConMasTarjetasAmarillas();
        this.mostrarJugadorConMas("tarjetas amarillas ", jugadorConMasTarjetasAmarillas);
    }

    public void mostrarJugadorConMasTarjetasRojas(){
        Jugador jugadorConMasTarjetasRojas = jugadorController.getJugadorConMasTarjetasRojas();
        this.mostrarJugadorConMas("tarjetas rojas ", jugadorConMasTarjetasRojas);
    }

    private void mostrarJugadorConMas(String categoria, Jugador jugador) {
        System.out.println("************* RESULTADO *************");
        System.out.println("El jugador con mas con más " + categoria + " es: " + jugador.getNombre());
        System.out.println("*************************************\nPresiona Enter para continuar...");
        scanner.nextLine();
    }

    public void mostrarJugadoresDeEquipo(Equipo equipo){
        for (int i = 0; i < equipo.getJugadores().size(); i++){
            System.out.println((i + 1) + " "+ equipo.getJugadores().get(i).getNombre());
        }
    }
}
