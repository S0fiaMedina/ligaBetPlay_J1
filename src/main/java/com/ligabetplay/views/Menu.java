package com.ligabetplay.views;

import java.util.ArrayList;

import com.ligabetplay.Utileria;





public class Menu {
    public ArrayList<String> opcionesMenuPrincipal = new ArrayList<>();


    private int opcionSeleccionada;

    public Menu(){
        opcionesMenuPrincipal.add("1. Registro de equipos");
        opcionesMenuPrincipal.add("2. Registro de partidos");
        opcionesMenuPrincipal.add("3. Equipo que más puntos tiene");
        opcionesMenuPrincipal.add("4. Equipo que más goles anotó");
        opcionesMenuPrincipal.add("5. Total de goles de todos los equipos");
        opcionesMenuPrincipal.add("6. Promedio de goles anotados");
        opcionesMenuPrincipal.add("7. Salir");
    }

    //constructor sin argumentos (Menu principal)
    public int mostrarMenuPrincipal(){
        return  mostrarOpciones(opcionesMenuPrincipal);
    }

   

    // Mostrar las opciones y retornar la opción elegida
    public int mostrarOpciones(ArrayList<String> opciones) {
     
      
        // mostrar menu
        for (String opcion : opciones) {
            System.out.println(opcion);
        }

        // recibir opcion escogida
        System.out.println(">> Digite la opción de su preferencia: ");
        int choice = Utileria.validarRango(1, opciones.size());

        return choice;
         
    }

    public int getOpcionSeleccionada() {
        return opcionSeleccionada;
    }

}