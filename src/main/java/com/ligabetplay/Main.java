package com.ligabetplay;

import com.ligabetplay.views.Menu;

public class Main {

    public static void main(String[] args) {

        //creacion de equipos
        Liga liga = new Liga();

        // crear menu y mostrar opciones
        Menu menu = new Menu();
        boolean bandera = true;


        while (bandera){
            System.out.println("----------- LIGA BETPLAY -------------- ");
            int opcionEscogida = menu.mostrarMenuPrincipal();

            // llamar a los procesos segun las respuestas
            switch(opcionEscogida){
            
                // registro de equipos
                case  1:
                    liga.agregarEquipos();
                break;

                // Registro de partidos
                case  2:
                    if (liga.getEquipos().size() > 0){
                        liga.registrarPartidos();
                    } else {
                        System.out.println(">>Lo siento. Aun no se han registrado equipos");
                    }
                    
                break;

                // Equipo que más puntos tiene
                case  3:
                    if (liga.getEquipos().size() > 0){
                        liga.equipoConMasPuntos();
                    } else {
                        System.out.println(">>Lo siento. Aun no se han registrado equipos");
                    }
                break;

                // Equipo que más goles anotó
                case  4:
                    if (liga.getEquipos().size() > 0){
                        liga.equipoConMasGoles();
                    } else {
                        System.out.println(">>Lo siento. Aun no se han registrado equipos");
                    }
                break;

                // Total de goles de todos los equipos
                case  5:
                    if (liga.getEquipos().size() > 0){
                        System.out.println("SUMA DE GOLES:" + liga.sumaDeGoles());
                    } else {
                        System.out.println(">>Lo siento. Aun no se han registrado equipos");
                    }
                break;

                // Promedio de goles
                case  6:
                if (liga.getEquipos().size() > 0){
                    liga.promedioGoles();
                } else {
                    System.out.println(">>Lo siento. Aun no se han registrado equipos");
                }
                break;

                //Salir del ,menu
                case 7:
                    bandera = false;
                break;

            }
        
    
        }
        
    }

}
