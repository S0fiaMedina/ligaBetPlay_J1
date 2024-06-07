package com.ligabetplay.controllers;
import com.ligabetplay.models.Jugador;
import com.ligabetplay.models.Persona;
import com.ligabetplay.models.Tecnico;
import com.ligabetplay.models.Medico;
import com.ligabetplay.views.PersonaView;
import com.ligabetplay.views.EquipoView;

import java.util.ArrayList;


public class PersonaController {

    PersonaView personaView = new PersonaView();
    EquipoView equipoView = new EquipoView();
    // planteles
    private ArrayList<Persona> plantelTecnico;
    private ArrayList<Persona> plantelMedico;
    private ArrayList<Persona> jugadores;

    // registro de persona
    public void registroPersona(){
        String nombre = personaView.getInputNombre();
        String nacionalidad = personaView.getInputNacionalidad();
        String equipo = equipoView.getEquipoDeLista();
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
        }
    }

    // funcion de escaneo

    
    
    

    

}
