package com.ligabetplay;

import com.ligabetplay.team.infrastructure.inbound.controller.TeamController;

public class Main {
    

    public static void main(String[] args) {
    TeamController teamController = new TeamController();
    teamController.run();
    
    /* 
        // crear menu y mostrar opciones
        Menu menu = new Menu();
        
        boolean bandera = true;


        while (bandera){
            System.out.println("----------- LIGA BETPLAY -------------- ");
            menu.menuPrincipal();
            int opcionEscogida = menu.mostrarOpciones();

            // llamar a los procesos segun las respuestas
            switch(opcionEscogida){
                // Modulo equipos
                case  1:
                    System.out.println("---------- EQUIPOS ---------");
                    menu.menuEquipo();
                    int opcionEquipo = menu.mostrarOpciones();
                    equipoView.equipoHandler(opcionEquipo);
                break;
                case 2:
                System.out.println("---------- PERSONAS ---------"); // modeulo de personas y jugadores
                    menu.menuPersona();
                    int opcionPersona = menu.mostrarOpciones();
                    personaView.personaHandler(opcionPersona);
                break;
                case 3:
                    partidoView.addPartido();
                break;
                case 4:
                    equipoView.mostrarTablaDePosiciones();
                break;
                default: 
                    bandera = false;
                break;

                // tabla de posiciones
                // salir

            }
        
    
        }
        */
    }
        

}
