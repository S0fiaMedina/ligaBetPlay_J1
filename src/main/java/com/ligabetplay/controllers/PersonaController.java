package com.ligabetplay.controllers;
import com.ligabetplay.models.Jugador;
import com.ligabetplay.models.Persona;
import com.ligabetplay.models.Tecnico;
import com.ligabetplay.team.Equipo;
import com.ligabetplay.models.Medico;
import com.ligabetplay.views.EquipoView;
import com.ligabetplay.views.PersonaView;

import java.util.ArrayList;


public class PersonaController {
    private PersonaView personaView = new PersonaView();
    private JugadorController jugadorController = new JugadorController();
    private EquipoView equipoView;
    // planteles
    private ArrayList<Persona> plantelTecnico;
    private ArrayList<Persona> plantelMedico;
    private ArrayList<Persona> jugadores;

   public void iniciarModuloPersona(){
        int op = personaView.mostrarMenuRegistroPersonas();
        personaHanddler(op); 
   }
    // tomar los datos aca, crear variables y luego enviar los datos a cada uno de los constructires
    public void personaHanddler(int op){
        while (true){
            switch (op) {
                case 1: // tecnico
                    System.out.println("Escogiste medico");
                    break;
                case 2:
                    System.out.println("Escogiste tecnico");
                    break;
                case 3: 
                    System.out.println("Escogiste jugador");
                    
                    Persona persona = new Persona("Juan", "C", "Jdsa", equipo);
                     
                    // toca modificar a jugador 
                    break;
                default:
                    break;
            }
            break;
        }
        
    }
    /* 
    // registro de persona
    public void registroPersona(){
        String nombre = personaView.getInputNombre();
        String nacionalidad = personaView.getInputNacionalidad();
        Equipo equipo = equipoView.getEquipoDeLista();
        String rol = personaView.eleccionRolesEquipo();

        //Asignacion de roles
        if (rol.equals("Tecnico")){
            rol = personaView.eleccionRolesTecnico();
            Tecnico tecnico = new Tecnico(nombre, nacionalidad, rol, equipo);
            plantelTecnico.add(tecnico);

        } else if (rol.equals("Medico")){
            rol = personaView.eleccionRolesMedico();
            Medico medico = new Medico(nombre, nacionalidad, rol, equipo);
            plantelMedico.add(medico);
            
        } else{
            Jugador jugador = new Jugador(nombre, nacionalidad, 0, equipo);
            jugadores.add(jugador);
        }
    }

    // funcion de escaneo

    
    */
    

    

}
