package com.ligabetplay.views;



import com.ligabetplay.Utileria;
import com.ligabetplay.models.Jugador;
import com.ligabetplay.team.Equipo;
import com.ligabetplay.controllers.PartidoController;

public class PartidoView {
    // creacion de objetos
    PartidoController partidoController = new PartidoController();
    EquipoView equipoView = new EquipoView();
    JugadorView jugadorView = new JugadorView();

    // addPartido
    public void addPartido(){
        System.out.println("---- REGISTRO DE PARTIDOS ---");
        partidoController.registroDePartidos();
    }

    // menu
    public Jugador getGoleadorPartido(Equipo equipo, int i ){
        System.out.println("Seleccione el jugador del equipo" + equipo.getNombre() + " que hizo el gol "+ i);
        return jugadorView.getJugadorDeLista(equipo);
    }
   

    //menu de seleccion de tarjeta
    public void seleccionarTarjeta(Equipo equipo){
        // ¿Hay tarjetas?
        int op = Utileria.confirmacion("¿Hubieron tarjetas amarillas / rojas durante el partido?");
        if (op == 1){ // si hubieron tarjetas...
            for (int i = 0; i < 2; i++){
                int confirmacionEquipo = Utileria.confirmacion("¿El equipo " + equipo.getNombre() + " recibio tarjetas?");
                if (confirmacionEquipo == 1){ // si [equipo] recibio tarjetas...
                    int op2 = Utileria.confirmacion("¿Hubieron tarjetas rojas?");
                    if (op2 == 1){ // si hubieron tarjetas rojas...
                        int numTarjetasRojas = Utileria.getIntInput("¿Cuantas tarjetas rojas hubieron?");
                        partidoController.registroDeTarjetaRoja(equipo, numTarjetasRojas);
                    }
                    int op3 = Utileria.confirmacion("¿Hubieron tarjetas amarillas?");
                    if (op3 == 1){ // Si hubieron tarjetas amarillas...
                        int numTarjetasAmarillas = Utileria.getIntInput("¿Cuantas tarjetas amarillas hubieron?");
                        partidoController.registroDeTarjetaAmarilla(equipo, numTarjetasAmarillas);
                    }
                }
            }
            
        }
    }
    public  Jugador getJugadorConSancion(String tipoTarjeta, Equipo equipo, int i){
        System.out.println("Seleccione el jugador que recibió la tarjeta " + tipoTarjeta + " #"+ i);
        return jugadorView.getJugadorDeLista(equipo);
    }
    
    // inputs 
    public String getFechaPartido(){
        return Utileria.getStringInput(">> Digite la fecha del partido en formato dd/mm/yy: ");
    }
    public int getMarcador(){
        return Utileria.getIntInput(">> Digite el marcador del equipo durante el partido: ");
    }

    public Equipo getLocal(){
        return this.getEquipo("local");
    }
    public Equipo getVisitante(){
        return this.getEquipo("visitante");
    }

    public Equipo getEquipo(String tipoEquipo){
        System.out.println("\nSeleccione el equipo"+ tipoEquipo + " : ");
        Equipo equipoLocal = equipoView.getEquipoDeLista();
        return equipoLocal;

    }

    

    
    //inputs

}
