package org.example.model;

import org.example.DatabaseConfiguration;
import org.example.presenter.Presenter;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class HeroDao implements Model{
    private static final String SQLCREATE = "INSERT INTO heroes(name, power) VALUES(?, ?)";
    private static final String SQLGET = "SELECT * FROM heroes.heroes";
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
    // TODO: executeUpdate() kell minden olyan esetben, amikor módosításunk van. Mint INSERT, UPDATE, DELETE.
    // TODO: Ha preparedStatement-en keresztül módosítani akarunk,akkor executeUpdate keresztül kell.
    // Ha selected van ami visszaad eredmény az simán execute Query. Ami resultSet-et ad vissza.
    // Az executeUpdate pedig csak egy számot ad vissza hogy hány rekord lett módosítva.

    @Override
    public void createHero(String name, Integer power) {
        // PreparedStatement dinamikus értékekkel:

        try (
                Connection connection = DriverManager.getConnection(DatabaseConfiguration.URL, DatabaseConfiguration.USERNAME, DatabaseConfiguration.PASSWORD);
                PreparedStatement preparedStatement = createPrepareStatementForHeroCreating(connection, name, power.toString(), SQLCREATE);
        ) {

            int result = preparedStatement.executeUpdate();
            System.out.println(result + " row(s) affected. Success!");
            presenter.handleModelChanged();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exportHero() throws IOException {
        List<Hero> heroList = getHeroes();

        FileWriter fileWriter = new FileWriter("HeroDaoExport.csv");
        fileWriter.write("name, power\n");

        for(Hero hero : heroList) {
            fileWriter.write(hero.getName() + ", " + hero.getPower() + "\n");
        }
        fileWriter.close();
    }

    private PreparedStatement createPrepareStatementForHeroCreating(Connection connection, String name, String power, String sql) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,  name );
        preparedStatement.setString(2,  power );

        return preparedStatement;
    }

    @Override
    public List<Hero> getHeroes() {
        List<Hero> list = new ArrayList<>();
        try(
                Connection connection = DriverManager.getConnection(DatabaseConfiguration.URL, DatabaseConfiguration.USERNAME, DatabaseConfiguration.PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(SQLGET);
                ){
            while(rs.next()) {
                list.add(new Hero(rs.getString("name"), rs.getInt("power")));
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
