package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/hr";
        String password = "testuser";
        String username = "test1990%%";
        String sql = "SELECT first_name FROM employees";

        try(
                Connection connection = DriverManager.getConnection(url, password, username);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while(resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}