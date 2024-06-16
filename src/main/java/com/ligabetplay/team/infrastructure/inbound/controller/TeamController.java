package com.ligabetplay.team.infrastructure.inbound.controller;

import com.ligabetplay.team.infrastructure.inbound.views.TeamView;
import com.ligabetplay.team.application.DTO.TeamDTO;
import com.ligabetplay.team.application.service.TeamService;



public class TeamController {
    TeamService teamService = new TeamService();
    TeamView teamView = new TeamView();

    public TeamController(){

    }
    
    public void run(){
        while (true){
            int option = teamView.menuTeam();
            if (option == 1){
                TeamDTO teamDTO = teamView.getNewTeam();
                teamService.newTeam(teamDTO);
            } else{
                break;
            }

        }
    }
}
