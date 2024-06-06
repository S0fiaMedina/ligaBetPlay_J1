package com.ligabetplay.views;

import com.ligabetplay.models.Jugador;
import com.ligabetplay.controllers.JugadorController;
import java.util.Scanner;

public class JugadorView {
    Scanner scanner = new Scanner(System.in);
    JugadorController jugadorController = new JugadorController();
    

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
}
