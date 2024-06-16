package com.ligabetplay.team.application.useCase;
import com.ligabetplay.team.domain.repository.TeamRepository;
import com.ligabetplay.team.application.DTO.TeamDTO;
import com.ligabetplay.team.domain.model.Team;


public class CreateTeamUseCase {
    TeamRepository teamRepository;
    
    public CreateTeamUseCase(){
        
    }

    public void addNewTeam(TeamDTO teamDTO){
        Team team = TeamDTO.toDomainModel(teamDTO);
        teamRepository.save(team);
    }
}
