package com.ligabetplay.views;

import com.ligabetplay.Utileria;
import com.ligabetplay.controllers.EquipoController;
import com.ligabetplay.models.Equipo;
import java.util.Scanner;
import java.util.ArrayList;

public class EquipoView {

    Scanner scanner = new Scanner(System.in);
    private EquipoController equipoController = new EquipoController();
    private ArrayList<Equipo> equipos = equipoController.getEquipos();


    // Muestra la seleccion de equipos, y tras de que el usuario escoja, retorna el nombre del equipo escogido
    public String getEquipoDeLista(){
        this.mostrarListaDeEquipos();
        int op = Utileria.validarRango(1, equipos.size()); 
        return equipos.get(op -1).getNombre(); // retorna el noombre del equipo escogido
    }
    
    public void mostrarListaDeEquipos(){
        System.out.println("Numero\tNombre del equipo");
        for (int i = 0; i < equipos.size(); i++){
            System.out.println((i+1) + " " + equipos.get(i));
        }
    }

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

    public void registroDeEquipos(){
        String nombre = "";

        while (true){
            System.out.println("--- NUEVO EQUIPO ---\n>> Ingrese el nombre del equipo: ");
            nombre =  scanner.nextLine();
            if (nombre.equals("0")){
                break;
            }
            equipoController.nuevoEquipo(nombre);
        }
        
        
    }

    // Metodo general de impresion
    private void mostrarEquipoConMas(String categoria, Equipo equipo) {
        System.out.println("************* RESULTADO *************");
        System.out.println("Equipo con más " + categoria + " es: " + equipo.getNombre());
        System.out.println("*************************************\nPresiona Enter para continuar...");
        scanner.nextLine();
        
    }
}