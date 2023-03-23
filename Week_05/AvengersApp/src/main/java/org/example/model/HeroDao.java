package org.example.model;

import org.example.DatabaseConfiguration;
import org.example.presenter.Presenter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HeroDao implements Model{
    private Presenter presenter;
    private static final String url = null;
    private static final String username = null;
    private static final String password =  null;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    // TODO: PreparedStatementre lesz szükség a createHero SQL-el:
    // TODO: Heroes tábla (name, power) oszlop
    // TODO: Nincs primary key most, JDBC_nél nincs megkövetelve. JPA-nál igen.
    // Getconnection, prepared statement kell még. Fontos: Nem lekérő lekérdezés.
    // Hanem módosító lekérdezés.
    // Statement
    // TODO: executeUpdate() kell minden olyan esetben, amikor módosításunk van. Such as insert, update, delete.
    // TODO: Ha preparedStatement-en keresztül módosítani akarunk,akkor executeUpdate keresztül kell.
    // Ha selected van ami visszaad eredmény az simán execute Query. Ami resultSet-et ad vissza.
    // Az executeUpdate pedig csak egy számot ad vissza hogy hány rekord lett módosítva.

    @Override
    public void createHero(String name, Integer power) {
        // PreparedStatement dinamikus értékekkel:
        String sql = "INSERT INTO heroes(name, power) VALUES(?, ?)";

        try (Connection connection = DriverManager.getConnection(DatabaseConfiguration.URL, DatabaseConfiguration.USERNAME, DatabaseConfiguration.PASSWORD)) {
            PreparedStatement preparedStatement = createPrepareStatementForHeroCreating(connection, name, power.toString(), sql);
            int result = preparedStatement.executeUpdate();
            System.out.println(result + " row(s) affected. Success!");
            presenter.handleModelChanged();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private PreparedStatement createPrepareStatementForHeroCreating(Connection connection, String name, String power, String sql) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,  name );
        preparedStatement.setString(2,  power );

        return preparedStatement;
    }



    @Override
    public List<Hero> getHeroes() {
        ArrayList<Hero> list = new ArrayList<>();
        String sql = "SELECT * FROM heroes.heroes";

        try(Connection connection = DriverManager.getConnection(DatabaseConfiguration.URL, DatabaseConfiguration.USERNAME, DatabaseConfiguration.PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()) {
                String name = rs.getString(1);
                String power = rs.getString(2);
                list.add(new Hero(name, Integer.parseInt(power)));
            }
            return list;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
