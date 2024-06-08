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

    public void equipoHandler(int opcionEscogida){
        switch (opcionEscogida) {
            case 1: // registro de Equipos
                this.registroDeEquipos();
                break;
            case 2: // Equipo con + puntos
                this.mostrarEquipoConMasPuntos();
                break;
            case 3: // equipo con + goles
                this.mostrarEquipoConMasGoles();
                break;
            case 4: // suma de goles
                this.mostrarSumaGoles();
                break;
            case 5: // promedio de goles
                this.mostrarPromedioGoles();
                break;
        }
    }
    // Muestra la seleccion de equipos, y tras de que el usuario escoja, retorna el nombre del equipo escogido
    public Equipo  getEquipoDeLista(){
        this.mostrarListaDeEquipos();
        int op = Utileria.validarRango(1, equipos.size()); 
        return equipos.get(op -1); // retorna el noombre del equipo escogido
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

    // mostrar suma de goles
    public void mostrarSumaGoles(){
        Utileria.mostrarInforme("La suma de goles es: " + equipoController.getSumaDeGoles());
    }

    public void mostrarPromedioGoles(){
        Utileria.mostrarInforme("El promedio de goles es " + equipoController.getPromedioGoles());
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
        Utileria.mostrarInforme("Equipo con más " + categoria + " es: " + equipo.getNombre());
    }

    public void mostrarTablaDePosiciones(){
        for (Equipo equipo : equipos) {
            System.out.println(equipo.getNombre() + " - Puntos: " + equipo.getTotalPuntos() + ", Diferencia de Goles: " + equipo.getDiferenciaDeGoles() + ", Goles a Favor: " + equipo.getGolesAFavor());
        }
    }
}