package com.ligabetplay.teamMember.domain.model;


public class Technician extends TeamMember{
    private long TeamMemberId;
    private String specialization;

    public Technician(int id, int teamId, String name, String nationality, String rol, String specialization) {
        super(id, teamId, name, nationality, rol);
        this.specialization = specialization;
        this.TeamMemberId = super.getId();
    }

    public long getTeamMemberId() {
        return TeamMemberId;
    }

    public void setTeamMemberId(long teamMemberId) {
        TeamMemberId = teamMemberId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

   
}
