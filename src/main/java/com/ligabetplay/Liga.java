package com.ligabetplay;

import java.util.Scanner;
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
        System.out.println(">>\tIngrese el dia del partido: ");
        int dia = Utileria.validarRango(1, 30); // Obtiene el dia 
        partida.setDia(dia);

        System.out.println(">>\tIngrese el mes del partido");
        int mes = Utileria.validarRango(1, 12); // Obtiene el mes 
        partida.setDia(mes);

        System.out.println(">>\tIngrese el año del partido: ");
        int anio = Utileria.validarRango(2024, 2025); // Obtiene el año 
        partida.setAnio(anio);

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
    


        /*---- EQUIPO CON MAS GOLES ----*/
        public void equipoConMasGoles(){
            int contadorGoles =  0;
            String nombreEquipo = "";

            // busca el equipo con más goles
            for (Equipo equipo: this.equipos){
                if (equipo.getGolesAFavor() > contadorGoles ){
                    contadorGoles = equipo.getGolesAFavor();
                    nombreEquipo = equipo.getNombre();
                }
            }
            System.out.println("-------- EQUIPO CON MAS GOLES ----------");
            System.out.println("El equipo con más goles es" + nombreEquipo + " Con " + contadorGoles + " goles a favor"); 
        }

        /*---- EQUIPO CON MAS PUNTOS -----*/
        public void equipoConMasPuntos(){
            int contador =  0;
            String nombreEquipo = "";

            // busca el equipo con más goles
            for (Equipo equipo: this.equipos){
                if (equipo.getTotalPuntos() > contador ){
                    contador = equipo.getTotalPuntos();
                    nombreEquipo = equipo.getNombre();
                }
            }
            System.out.println("-------- EQUIPO CON MAS PUNTOS ----------");
            System.out.println("El equipo con más goles es" + nombreEquipo + " Con " + contador + " puntos a favor"); 
        }

        /*---- EQUIPO CON MAS PARTIDOS GANADOS -----*/
        public void equiposConMasPartidosGanados(){
            int contador =  0;
            String nombreEquipo = "";

            // busca el equipo con más goles
            for (Equipo equipo: this.equipos){
                if (equipo.getPartidosGanados() > contador ){
                    contador = equipo.getPartidosGanados();
                    nombreEquipo = equipo.getNombre();
                }
            }
            System.out.println("-------- EQUIPO CON MAS PARTIDOS GANADOS ----------");
            System.out.println("El equipo con más patidos ganados es" + nombreEquipo + " con " + contador + " partidos ganados"); 
        }



    /*-------- MOSTRAR EQUIPOS ---------*/ 
    public void mostrarEquipos(){
        System.out.println("-------------- Equipos disponibles -------------");
        for(Equipo equipo : this.equipos){
            System.out.println(equipo.getIdEquipo() + " " + equipo.getNombre());
        }
    }

    /*----- SUMA  DE GOLES ----*/
    public int sumaDeGoles(){
        int acumulador = 0;
        for (Equipo equipo : equipos){
            acumulador += equipo.getGolesAFavor();
        }
        return acumulador;
    }

    /*--- PROMEDIO DE GOLES------*/
    public void promedioGoles(){
        int sumaGoles = this.sumaDeGoles();
        double promedioGoles = (double) sumaGoles / equipos.size(); 
        System.out.println("El promedio de goles es " + promedioGoles);
    }

    /*--- getter de equipos ------*/
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    



}
