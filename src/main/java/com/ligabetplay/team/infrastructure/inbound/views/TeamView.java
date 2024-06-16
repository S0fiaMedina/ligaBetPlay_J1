package com.ligabetplay.team.infrastructure.inbound.views;
import com.ligabetplay.team.application.DTO.TeamDTO;
import com.ligabetplay.Utileria;

public class TeamView {

    public TeamView(){

    }

    public int menuTeam(){
        System.out.println("*******************\n MODULO DE EQUIPOS \n *******************");
        System.out.println("Seleccione la opcion de su preferencia");
        System.out.println("1. Registrar un equipo");
        System.out.println("2. Salir");
        return Utileria.validarRango(1, 2);

    }
    
    public TeamDTO getNewTeam(){
        String name = Utileria.getStringInput("Digite el nombre del equipo \n>> ");
        return this.makeDTO(name, 0, 0, 0, 0, 0, 0, 0);
    }

    public TeamDTO makeDTO(String name, int playedGames, int wonGames, int lostGames, int tiedGames, int scoredGoals,
    int goalsConceded, int totalPoints){
        return new TeamDTO(name, playedGames, wonGames, lostGames, tiedGames, scoredGoals, goalsConceded, totalPoints);
    }
}
