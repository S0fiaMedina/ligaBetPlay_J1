package com.ligabetplay.team.domain.repository;
import java.util.List;

import com.ligabetplay.team.domain.model.Team;

public interface TeamRepository {
    
    Team findById(Long id);

    List<Team> findAll();

    void save(Team team);

}
