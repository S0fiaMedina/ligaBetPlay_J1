package com.ligabetplay.team.application.DTO;
import com.ligabetplay.team.domain.model.Team;

public class TeamDTO {
    
    private  int id;
    private String name;
    private int playedGames;
    private int wonGames;
    private int lostGames;
    private int tiedGames;
    private int scoredGoals;
    private int goalsConceded;
    private int totalPoints;

    public TeamDTO() {
    }

    
    
    

    public TeamDTO(String name, int playedGames, int wonGames, int lostGames, int tiedGames, int scoredGoals,
            int goalsConceded, int totalPoints) {
        this.name = name;
        this.playedGames = playedGames;
        this.wonGames = wonGames;
        this.lostGames = lostGames;
        this.tiedGames = tiedGames;
        this.scoredGoals = scoredGoals;
        this.goalsConceded = goalsConceded;
        this.totalPoints = totalPoints;
    }




    public TeamDTO(int id, String name, int playedGames, int wonGames, int lostGames, int tiedGames, int scoredGoals,
        int goalsConceded, int totalPoints) {
        this.id = id;
        this.name = name;
        this.playedGames = playedGames;
        this.wonGames = wonGames;
        this.lostGames = lostGames;
        this.tiedGames = tiedGames;
        this.scoredGoals = scoredGoals;
        this.goalsConceded = goalsConceded;
        this.totalPoints = totalPoints;
    }

    public static Team toDomainModel(TeamDTO teamDTO){
        return new Team(teamDTO.getId(), teamDTO.getName(), teamDTO.getPlayedGames(), 
        teamDTO.getWonGames(), teamDTO.getLostGames(), teamDTO.getTiedGames(), 
        teamDTO.getScoredGoals(), teamDTO.getGoalsConceded(), teamDTO.getScoredGoals());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(int playedGames) {
        this.playedGames = playedGames;
    }

    public int getWonGames() {
        return wonGames;
    }

    public void setWonGames(int wonGames) {
        this.wonGames = wonGames;
    }

    public int getLostGames() {
        return lostGames;
    }

    public void setLostGames(int lostGames) {
        this.lostGames = lostGames;
    }

    public int getTiedGames() {
        return tiedGames;
    }

    public void setTiedGames(int tiedGames) {
        this.tiedGames = tiedGames;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}
