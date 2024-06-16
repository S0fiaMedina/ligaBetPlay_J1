package com.ligabetplay.teamMember.domain.model;



public class TeamMember{
    protected long id;
    protected int TeamId;
    protected String name;
    protected String nationality;
    protected String rol;
    
    public TeamMember(){

    }

    public TeamMember(int teamId, String name, String nationality, String rol) {
        TeamId = teamId;
        this.name = name;
        this.nationality = nationality;
        this.rol = rol;
    }

    public TeamMember(int id, int teamId, String name, String nationality, String rol) {
        this.id = id;
        TeamId = teamId;
        this.name = name;
        this.nationality = nationality;
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTeamId() {
        return TeamId;
    }

    public void setTeamId(int teamId) {
        TeamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    


    


}
