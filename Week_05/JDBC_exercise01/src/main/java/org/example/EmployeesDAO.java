package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO: Enum columns  columnLabel-eket megoldani, refaktor.
// TODO: System.out.println ne legyen ezekben a metódusokban. Adja vissza a megfelelő adatokat, mainben kiiratni max.

// PreparedStatement = Akkor kell, ha paraméteres maga az SQL String. Pl. Search megvalósítás, és a dolgozóknak a nevében szeretnénk valamilyen match-et megfogalmazni
// A-val kezdődik, stb. szóval lekérdezések között változhat maga az elem.
public class EmployeesDAO {

    private static final String AVERAGE_SALARY = "SELECT AVG(salary) AS avgsalary FROM employees";
    private static final String EMPLOYEES_WO_MANAGER = "SELECT * FROM employees WHERE manager_id IS NULL";
    private static final String EMPLOYEE_NUM_BY_COUNTRY = """
        SELECT c.country_name, COUNT(*) as emp_count 
        FROM employees e
        JOIN departments d ON e.department_id = d.department_id
        JOIN locations l ON d.location_id = l.location_id
        JOIN countries c ON l.country_id = c.country_id
        GROUP BY c.country_name
    """;


    public double getAverageSalary()  {

        try(
                Connection connection = DriverManager.getConnection(DatabaseConfiguration.URL, DatabaseConfiguration.USERNAME, DatabaseConfiguration.PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(AVERAGE_SALARY);
        ) {
            while(resultSet.next()) {
                return resultSet.getDouble("avgsalary");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // TODO: Ezt megoldani a return value jo legyen
        return 0;
    }

    public List<Employee>  getEmployeesWOManager(){

        List<Employee> employees = new ArrayList<>();

        try(
                Connection connection = DriverManager.getConnection(DatabaseConfiguration.URL, DatabaseConfiguration.USERNAME, DatabaseConfiguration.PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(EMPLOYEES_WO_MANAGER);

        ) {
            while(resultSet.next()) {

                Employee employee = new Employee(
                        resultSet.getInt("employee_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name")
                );
                employees.add(employee);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    public Map<String, Integer> getEmployeesByCountry()  {
        Map<String, Integer> employeeCountByCountry = new HashMap<>();
        try (Connection connection = DriverManager.getConnection(DatabaseConfiguration.URL, DatabaseConfiguration.USERNAME, DatabaseConfiguration.PASSWORD);
             Statement stmt = connection.createStatement();
             ResultSet resultSet = stmt.executeQuery(EMPLOYEE_NUM_BY_COUNTRY)) {
            while (resultSet.next()) {
                String countryName = resultSet.getString("country_name");
                int employeeCount = resultSet.getInt("emp_count");
                employeeCountByCountry.put(countryName, employeeCount);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeCountByCountry;
    }



}
