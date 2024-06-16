package com.ligabetplay.teamMember.application.DTO;

public class MedicDTO {
    private int teamMemberId;
    private String specialization;
    private int specializationId;

    public MedicDTO(int teamMemberId,  int specializationId){
        this.teamMemberId = teamMemberId;
        this.specializationId = specializationId;
    }

    public int getTeamMemberId() {
        return teamMemberId;
    }

    public void setTeamMemberId(int teamMemberId) {
        this.teamMemberId = teamMemberId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(int specializationId) {
        this.specializationId = specializationId;
    }
    
}
