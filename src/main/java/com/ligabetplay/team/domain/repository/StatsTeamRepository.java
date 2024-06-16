package com.ligabetplay.team.domain.repository;
import com.ligabetplay.team.domain.model.Team;

public interface StatsTeamRepository {
    Team getTeamWithMostGoalsScored();
    
    Team getTeamWithMostPoints();

    Team getTeamWithMostWonGames();

    double getAverageOfGoals();

    int getTotalOfGoals();
}
