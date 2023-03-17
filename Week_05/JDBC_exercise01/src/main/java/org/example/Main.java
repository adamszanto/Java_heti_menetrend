package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {


        String sql = "SELECT first_name FROM employees";
        String sql2 = "SELECT first_name, last_name, salary FROM employees WHERE first_name = 'Nancy';";

        EmployeesDAO employeeDAO = new EmployeesDAO();
        EmployeesDaoPreparedStatement employeesDaoPreparedStatement = new EmployeesDaoPreparedStatement();

        employeeDAO.getAverageSalary();
       // employeeDAO.getAverageSalary(url, username, password);
        System.out.println(employeeDAO.getEmployeesWOManager());
        System.out.println(employeeDAO.getEmployeesByCountry());
        System.out.println(employeesDaoPreparedStatement.searchEmployeesByName("n"));

        try(
                Connection connection = DriverManager.getConnection(DatabaseConfiguration.URL, DatabaseConfiguration.USERNAME, DatabaseConfiguration.PASSWORD);
           //     DriverManager.getConnection(url, username, password nem működik??!!)
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                Statement statement2 = connection.createStatement();
                ResultSet resultSet2 = statement2.executeQuery(sql2);
        ) {
            while(resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
            }
            statement.close();
            resultSet.close();
            System.out.println("============");
            while(resultSet2.next()) {
                System.out.print(resultSet2.getString("first_name"));
                System.out.print(resultSet2.getString("last_name"));
                System.out.print(resultSet2.getString("salary"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}