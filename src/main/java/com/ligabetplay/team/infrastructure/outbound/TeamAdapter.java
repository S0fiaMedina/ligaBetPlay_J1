package com.ligabetplay.team.infrastructure.outbound;

import com.ligabetplay.team.domain.model.Team;
import com.ligabetplay.team.domain.repository.TeamRepository;
import com.ligabetplay.mysqlApi.MySQLRepository;

import java.util.List;

public class TeamAdapter implements TeamRepository {

    private final MySQLRepository<Team, Long> mySQLRepository;

    public TeamAdapter(MySQLRepository<Team, Long> mySQLRepository) {
        this.mySQLRepository = mySQLRepository;
    }

    @Override
    public List<Team> findAll() {
        return mySQLRepository.findAll();
    }

    @Override
    public Team findById(Long id) {
        return mySQLRepository.findById(id);
    }

    @Override
    public void save(Team team) {
        mySQLRepository.save(team);
    }
}
