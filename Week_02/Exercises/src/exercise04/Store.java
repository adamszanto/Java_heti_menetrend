package exercise04;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String address;
    private String name;
    private double revenue;
    private List<Product> productList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();

    public Store(String address, String name) {
        this.address = address;
        this.name = name;
        this.revenue = 0;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }


    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void addRevenue(double money) {
        this.revenue += money;
    }
}
