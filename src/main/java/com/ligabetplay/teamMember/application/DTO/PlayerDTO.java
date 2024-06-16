package com.ligabetplay.teamMember.application.DTO;



public class PlayerDTO{
    private long teamMemberId;
    private int squadNumber; // dorsal
    private int scoredGoals;
    private int yellowCards;
    private int redCards;
    private int positionId;

    public PlayerDTO (long teamMemberId,  int squadNumber, int scoredGoals, int redCards, int yellowCards,
    int positionId){
        this.teamMemberId = teamMemberId;
        this.squadNumber = squadNumber;
        this.scoredGoals = scoredGoals;
        this.redCards = redCards;
        this.yellowCards = yellowCards;
        this.positionId = positionId;
    }

    public long getTeamMemberId() {
        return teamMemberId;
    }

    public void setTeamMemberId(long teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    public int getSquadNumber() {
        return squadNumber;
    }

    public void setSquadNumber(int squadNumber) {
        this.squadNumber = squadNumber;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    
}
