package com.ligabetplay.teamMember.application.DTO;

import com.ligabetplay.teamMember.domain.model.TeamMember;

public class TeamMemberDTO {

    
    protected String name;
    protected String nationality;
    protected String rol;

    public TeamMemberDTO(String name, String nationality, String rol) {
        this.name = name;
        this.nationality = nationality;
        this.rol = rol;
    }

    public static TeamMember toDomainModel(int id, String name, String nationality, String rol){
        return new TeamMember(id, name, nationality, rol);
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getRol() {
        return rol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    

    
}
