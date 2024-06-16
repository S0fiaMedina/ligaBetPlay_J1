package com.ligabetplay.teamMember.domain.services;

import com.ligabetplay.teamMember.domain.model.Player;

public class PlayerStatsManager {
    
    public static void playerGetsYellowCard(Player player){
        player.setYellowCards(player.getYellowCards() + 1);
    }

    public static void playerGetsRedCard(Player player){
        player.setRedCards(player.getRedCards() + 1);
    }

    public static void playerScoresGoal(Player player){
        player.setScoredGoals(player.getScoredGoals() + 1);
    }
}
