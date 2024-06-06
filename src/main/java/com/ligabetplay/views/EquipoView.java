package com.ligabetplay.views;

import com.ligabetplay.controllers.EquipoController;
import com.ligabetplay.models.Equipo;
import java.util.Scanner;

public class EquipoView {

    Scanner scanner = new Scanner(System.in);
    private EquipoController equipoController = new EquipoController();

    
    public void mostrarEquipoConMasPuntos() {
        Equipo equipoConMasPuntos = equipoController.getEquipoConMasPuntos();
        mostrarEquipoConMas("puntos", equipoConMasPuntos);
    }

    public void mostrarEquipoConMasGoles() {
        Equipo equipoConMasGoles = equipoController.getEquipoConMasGoles();
        mostrarEquipoConMas("goles", equipoConMasGoles);
    }

    public void mostrarEquipoConMasPartidosGanados(){
        Equipo equipoConMasPartidosGanados = equipoController.getEquipoConMasPartidosGanados();
        mostrarEquipoConMas("partidos ganados", equipoConMasPartidosGanados);
    }


    // Metodo general de impresion
    private void mostrarEquipoConMas(String categoria, Equipo equipo) {
        System.out.println("************* RESULTADO *************");
        System.out.println("Equipo con más " + categoria + " es: " + equipo.getNombre());
        System.out.println("*************************************\nPresiona Enter para continuar...");
        scanner.nextLine();
        
    }
}