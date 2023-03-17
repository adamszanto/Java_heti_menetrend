package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// TODO: Avengers normális UI-al... JFRAME. fontos hogy ne konzolról vegye az adatokat hanem UI-ról gombnyomásra. jtext field + gombnyomásra felvenni Usert hogy DB-be tárolja el...
// TODO:  Legyen egy save button ami fájlba írja ki a DB-ben található elemeket. Fölvesz + Exportál funkció. Fájl felugró ablak hogy hova mentsem, milyen névvel? Utánanézni.
public class EmployeesDaoPreparedStatement {

    private static final String searchLike = "SELECT * FROM employees WHERE first_name LIKE ?";

    public List<Employee> searchEmployeesByName(String nameContains)  {
        List<Employee> employeeResultList = new ArrayList<>();
        try(
                Connection connection = DriverManager.getConnection(DatabaseConfiguration.URL, DatabaseConfiguration.USERNAME, DatabaseConfiguration.PASSWORD);
                PreparedStatement preparedStatement = createPreparedStatementForEmployeeSearch(connection, nameContains);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while(resultSet.next()) {
                Employee employee = new Employee(
                        resultSet.getInt("employee_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name")
                );
                employeeResultList.add(employee);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeResultList;
    }

    private PreparedStatement createPreparedStatementForEmployeeSearch(Connection connection, String nameContains) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(searchLike);
        preparedStatement.setString(1, "%" + nameContains + "%");

        return preparedStatement;
    }
}
