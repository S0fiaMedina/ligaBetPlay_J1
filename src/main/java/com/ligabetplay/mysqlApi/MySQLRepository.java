package com.ligabetplay.mysqlApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que proporciona métodos genéricos para interactuar con una base de datos MySQL.
 *
 * @param <T> Tipo de entidad con la que opera el repositorio.
 * @param <ID> Tipo del identificador único de la entidad.
 */
public abstract class MySQLRepository<T, ID> {
    protected final String url;
    protected final String username;
    protected final String password;

    /**
     * Constructor de MySQLRepository.
     *
     * @param url      URL de conexión a la base de datos.
     * @param username Nombre de usuario para la conexión.
     * @param password Contraseña para la conexión.
     */
    public MySQLRepository(String url, String username, String password) {
        this.url = "jdbc:mysql://localhost:3306/liga_betplay";
        this.username = "root";
        this.password = "R00T_12345";
    }

    /**
     * Método abstracto que devuelve el nombre de la tabla en la base de datos para la entidad.
     *
     * @return Nombre de la tabla en la base de datos.
     */
    protected abstract String getTableName();

    /**
     * Método abstracto para mapear un ResultSet a una entidad específica.
     *
     * @param resultSet ResultSet que contiene los datos recuperados de la base de datos.
     * @return La entidad mapeada desde el ResultSet.
     * @throws SQLException Si hay un error al acceder a los datos del ResultSet.
     */
    protected abstract T mapResultSetToEntity(ResultSet resultSet) throws SQLException;

    /**
     * Método abstracto para crear una PreparedStatement para buscar una entidad por su ID.
     *
     * @param connection Conexión establecida a la base de datos.
     * @param id         ID de la entidad que se desea buscar.
     * @return PreparedStatement configurada para buscar la entidad por su ID.
     * @throws SQLException Si hay un error al preparar la consulta SQL.
     */
    protected abstract PreparedStatement createFindByIdStatement(Connection connection, ID id) throws SQLException;

    /**
     * Método abstracto para crear una PreparedStatement para guardar una entidad en la base de datos.
     *
     * @param connection Conexión establecida a la base de datos.
     * @param entity     Entidad que se desea guardar en la base de datos.
     * @return PreparedStatement configurada para guardar la entidad.
     * @throws SQLException Si hay un error al preparar la consulta SQL.
     */
    protected abstract PreparedStatement createSaveStatement(Connection connection, T entity) throws SQLException;

    /**
     * Busca una entidad por su identificador en la base de datos.
     *
     * @param id Identificador único de la entidad que se desea buscar.
     * @return La entidad encontrada en la base de datos, o null si no se encontró ninguna entidad con el ID especificado.
     */
    public T findById(ID id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            PreparedStatement statement = createFindByIdStatement(connection, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return mapResultSetToEntity(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Recupera todas las entidades de la tabla correspondiente en la base de datos.
     *
     * @return Lista de todas las entidades recuperadas de la base de datos.
     */
    public List<T> findAll() {
        List<T> entities = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT * FROM " + getTableName();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                entities.add(mapResultSetToEntity(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entities;
    }

    /**
     * Guarda una entidad en la base de datos.
     *
     * @param entity Entidad que se desea guardar en la base de datos.
     */
    public void save(T entity) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            PreparedStatement statement = createSaveStatement(connection, entity);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
