package exercise04;

public class Main {
    public static void main(String[] args) {

        Product milk = new Product("Milk", 500, 100);
        Product bread = new Product("Bread", 450, 100);
        Product butter = new Product("Butter", 800, 100);
        Product popcorn = new Product("Pop-Corn", 200, 100);

        Store deli = new Store("Petofi 1", "Petofi Deli");
        deli.addProduct(milk);
        deli.addProduct(bread);
        deli.addProduct(butter);
        deli.addProduct(popcorn);

        Employee cashier1 = new Employee("Gizi", "Cashier", 01);
        deli.addEmployee(cashier1);

        Customer customer1 = new Customer("Peter", 8000);

        customer1.buyInStore(deli, milk, 20);
        customer1.buyInStore(deli, milk, 10);
        customer1.buyInStore(deli, milk, 5);
        customer1.buyInStore(deli, milk, 5);

    }
}
