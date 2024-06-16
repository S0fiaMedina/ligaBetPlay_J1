package com.ligabetplay.views;

import com.ligabetplay.Utileria;
import com.ligabetplay.team.Equipo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EquipoView {
    Scanner scanner = new Scanner(System.in);
    private Menu menu = new Menu();

    private String[] opcionesMenuEquipo = {
        "Registro de equipos",
        "Equipo que más puntos tiene",
        "Equipo que más goles anotó",
        "Total de goles de todos los equipos",
        "Promedio de goles anotados",
        "Salir"
    };


    public int mostrarMenu(){
        menu.setOpciones(opcionesMenuEquipo);
        int opcionEscogida = menu.mostrarOpciones();
        return opcionEscogida;
    }

    public String registroDeEquipos(){
        System.out.println("--- NUEVO EQUIPO ---\n>> Ingrese el nombre del equipo: \n Ingrese 0 para salir");
        String nombre =  scanner.nextLine();
        return nombre;
    }

    public int elegirEquipo(List<Equipo> equipos){
        for (int i = 0; i < equipos.size(); i++){
            System.out.println((i+1) + " " + equipos.get(i).getNombre());
        }
        return Utileria.validarRango(1, equipos.size());
    }



   
    

   /* 
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

    


    // Metodo general de impresion
    private void mostrarEquipoConMas(String categoria, Equipo equipo) {
        Utileria.mostrarInforme("Equipo con más " + categoria + " es: " + equipo.getNombre());
    }

    public void mostrarTablaDePosiciones(){
        for (Equipo equipo : equipos) {
            System.out.println(equipo.getNombre() + " - Puntos: " + equipo.getTotalPuntos() + ", Diferencia de Goles: " + equipo.getDiferenciaDeGoles() + ", Goles a Favor: " + equipo.getGolesAFavor());
        }
    }
        */
}