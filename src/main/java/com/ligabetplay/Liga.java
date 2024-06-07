package com.ligabetplay;

import java.util.Scanner;

import com.ligabetplay.models.Equipo;
import com.ligabetplay.models.Partido;
import com.ligabetplay.views.Menu;

import java.util.ArrayList;


public class Liga {

    private ArrayList<Equipo> equipos;
    private ArrayList<String> nombreEquipos;

    // Constructor para crear lista de equipos
    public Liga(){
        this.equipos = new ArrayList<>();
        this.nombreEquipos = new ArrayList<>();
    }

    // Método para crear lista con solo nombres de equipos -_-
    public void crearListaConNombresDeEquipos(){
        nombreEquipos.clear(); // Limpiar la lista antes de crearla de nuevo
        
        for (Equipo equipo : equipos) {
            nombreEquipos.add(equipo.getIdEquipo() +" - " + equipo.getNombre());
        }
    }
    // funcion para seleccionar equipos
    



   /*-------- REGISTRAR EQUIPOS -----------*/
    @SuppressWarnings("resource")
    public void agregarEquipos() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el nombre del equipo (o escriba '0' para terminar): ");
            
            if (sc.hasNextLine()){
                String nombreEquipo = sc.nextLine();
                if (nombreEquipo.equals("0")) { // Termina el ciclo
                    break;
                    
                } else{
                    Equipo equipo = new Equipo(nombreEquipo); // Agrega el equipo
                    this.equipos.add(equipo);
                    this.crearListaConNombresDeEquipos();
                }

            };
        
        }
    }


    /*---------- REGISTRAR PARTIDOS ----------- */
    public void registrarPartidos(){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Partido partida = new Partido();

        

        //Agregar fechas
       

        // pedir equipo de local
        System.out.println(">> Seleccione el equipo que jugo de local: ");
        int idEquipoLocal = menu.mostrarOpciones(nombreEquipos);
        partida.setEquipo1(equipos.get(idEquipoLocal - 1)); //  como los indices comienzan desde 0, se le resta 1
        System.out.println("Ingrese el marcador del local: ");
        int marcadorLocal = sc.nextInt();

        // pedir equipo de visitante
        System.out.println(">> Seleccione el equipo que jugo de visitante: ");
        int idEquipoVisitante = Utileria.verificarEquipo(nombreEquipos, idEquipoLocal);
        partida.setEquipo2(equipos.get(idEquipoVisitante - 1));
        System.out.println("Ingrese el marcador del visitante: ");
        int marcadorVisitante = sc.nextInt();

        //llamada a la funcion de asignacion de puntos
        asignarPuntos(partida.getEquipo1(), partida.getEquipo2(), marcadorLocal, marcadorVisitante);



        
        System.out.println(partida);
    }


    // funcion para asignar puntos de acuerdo al marcador obtenido durante ek partido
    public void asignarPuntos(Equipo equipoLocal, Equipo equipoVisitante, int marcadorLocal, int marcadorVisitante){
        if (marcadorLocal > marcadorVisitante){ // GANA EQUIPO LOCAL

            equipoLocal.jugarPartido(marcadorLocal, marcadorVisitante, 3);
            equipoVisitante.jugarPartido(marcadorVisitante, marcadorLocal, 0);

            equipoLocal.setPartidosGanados(equipoLocal.getPartidosGanados() + 1); // Aumenta la cantidad de partidos ganados
            equipoVisitante.setPartidosPerdidos(equipoVisitante.getPartidosPerdidos() +1 );

        } else if (marcadorLocal < marcadorVisitante){ // GANA EQUIPO VISITANTE
            equipoLocal.jugarPartido(marcadorLocal, marcadorVisitante, 0);
            equipoVisitante.jugarPartido(marcadorVisitante, marcadorLocal, 3);

            equipoVisitante.setPartidosGanados(equipoVisitante.getPartidosGanados() +1 );
            equipoLocal.setPartidosPerdidos(equipoLocal.getPartidosPerdidos() +1 );

        } else{ // EMPATE
            equipoLocal.jugarPartido(marcadorLocal, marcadorVisitante, 1);
            equipoVisitante.jugarPartido(marcadorVisitante, marcadorLocal, 1);
            equipoLocal.setPartidosEmpatados(equipoLocal.getPartidosEmpatados() +1 );
            equipoVisitante.setPartidosEmpatados(equipoVisitante.getPartidosEmpatados() +1 );
        }
    }
    








    /*-------- MOSTRAR EQUIPOS ---------*/ 
    public void mostrarEquipos(){
        System.out.println("-------------- Equipos disponibles -------------");
        for(Equipo equipo : this.equipos){
            System.out.println(equipo.getIdEquipo() + " " + equipo.getNombre());
        }
    }





    /*--- getter de equipos ------*/
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    



}
