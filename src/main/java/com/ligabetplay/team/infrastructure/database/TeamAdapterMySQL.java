package com.ligabetplay.team.infrastructure.database;
import com.ligabetplay.team.domain.model.Team;
import com.ligabetplay.mysqlApi.MySQLRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamAdapterMySQL extends MySQLRepository<Team, Long> {

    public TeamAdapterMySQL(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    protected Team mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int playedGames = resultSet.getInt("played_games");
        int wonGames = resultSet.getInt("won_games");
        int lostGames = resultSet.getInt("lost_games");
        int tiedGames = resultSet.getInt("tied_games");
        int scoredGoals = resultSet.getInt("scored_goals");
        int goalsConceded = resultSet.getInt("goals_conceded");
        int totalPoints = resultSet.getInt("total_points");

        return new Team(id, name, playedGames, wonGames, lostGames, tiedGames, scoredGoals, goalsConceded, totalPoints);
    }

    @Override
    protected PreparedStatement createFindByIdStatement(Connection connection, Long id) throws SQLException {
        String query = "SELECT id, name, played_games, won_games, lost_games, tied_games, scored_goals, goals_conceded, total_points " +
                       "FROM team WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setLong(1, id);
        return statement;
    }

    @Override
    protected PreparedStatement createSaveStatement(Connection connection, Team team) throws SQLException {
        String query = "INSERT INTO team (name, played_games, won_games, lost_games, tied_games, scored_goals, goals_conceded, total_points) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, team.getName());
        statement.setInt(2, team.getPlayedGames());
        statement.setInt(3, team.getWonGames());
        statement.setInt(4, team.getLostGames());
        statement.setInt(5, team.getTiedGames());
        statement.setInt(6, team.getScoredGoals());
        statement.setInt(7, team.getGoalsConceded());
        statement.setInt(8, team.getTotalPoints());
        return statement;
    }

    @Override
    protected String getTableName() {
        return "team";
    }
}
