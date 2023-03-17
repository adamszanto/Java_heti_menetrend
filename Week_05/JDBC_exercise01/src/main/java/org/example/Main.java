package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String sql = "SELECT first_name FROM employees";

        EmployeesDAO employeeDAO = new EmployeesDAO();
        EmployeesDaoPreparedStatement employeesDaoPreparedStatement = new EmployeesDaoPreparedStatement();

        employeeDAO.getAverageSalary();
        System.out.println(employeeDAO.getNancy());
        System.out.println(employeeDAO.getEmployeesWOManager());
        System.out.println(employeeDAO.getEmployeesByCountry());
        System.out.println(employeesDaoPreparedStatement.searchEmployeesByName("Alex"));

        try(
                Connection connection = DriverManager.getConnection(DatabaseConfiguration.URL, DatabaseConfiguration.USERNAME, DatabaseConfiguration.PASSWORD);
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