package com.ligabetplay.teamMember.domain.repository;

import java.util.List;

import com.ligabetplay.teamMember.domain.model.TeamMember;

public interface TeamMemberRepository {
    TeamMember findPerson(int id);
    List<TeamMember> findMembersByTeam(int id);
    void save(TeamMember teamMember);


}
