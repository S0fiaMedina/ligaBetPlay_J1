package com.ligabetplay.teamMember.domain.repository;

import com.ligabetplay.teamMember.domain.model.Player;

public interface PlayerRepository {
    Player findPlayerWithMostYellowCards();
    Player findPlayerWithMostRedCards();
    Player findPlayerWithMostGoalsScored();

}
