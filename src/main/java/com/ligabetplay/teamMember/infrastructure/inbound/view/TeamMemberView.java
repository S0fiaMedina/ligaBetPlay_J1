package com.ligabetplay.teamMember.infrastructure.inbound.view;

import com.ligabetplay.Utileria;
import com.ligabetplay.teamMember.application.DTO.TeamMemberDTO;
import com.mysql.cj.util.Util;

public class TeamMemberView {
    String[] roles = {"Tecnico", "Jugador", "Medico"};
    
    public TeamMemberView(){
    }

    public void printHeader(){
        System.out.println("------------------------------");
        System.out.println(" PERSONAS DEL EQUIPO");
        System.out.println("------------------------------");
    }

    public int  teamMemberMenu(){
        this.printHeader();
            System.out.println("1. Agregar una nueva persona al equipo");
            System.out.println("2. salir");
            return Utileria.validarRango(1, 2);
    }
        
    

    public TeamMemberDTO getDataOfTeamMember(){
        
        String name = Utileria.getStringInput(">> Digite el nombre de la persona: ");
        String nationality = Utileria.getStringInput(">> Digite la nacionalidad: ");
        int teamId = Utileria.getIntInput(">> Digite el id del equipo: ");
        System.out.println("Seleccione el rol de la persona en el equipo");
        Utileria.imprimirOpciones(roles);
        int  rol = Utileria.validarRango(1, roles.length);
        return this.makeDTO(name, nationality, teamId, rol);
        
    }

    public TeamMemberDTO makeDTO(String name, String nationality, int teamId, int rol){
        String TeamRol = roles[rol - 1]; // obtiene el nombre del rol
        return new TeamMemberDTO(name, nationality, TeamRol);

    }

    

}
