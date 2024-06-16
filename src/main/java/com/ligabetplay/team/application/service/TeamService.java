package com.ligabetplay.team.application.service;
import com.ligabetplay.team.application.DTO.TeamDTO;
import com.ligabetplay.team.application.useCase.CreateTeamUseCase;
import com.ligabetplay.team.domain.repository.TeamRepository;

public class TeamService {
    TeamRepository teamRepository;
    CreateTeamUseCase createTeamUseCase;

    public TeamService() {
        
    }

    // registrar equipo
    public void newTeam(TeamDTO teamDTO) {
        createTeamUseCase.addNewTeam(teamDTO);
    }
}
