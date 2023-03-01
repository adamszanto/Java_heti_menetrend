package exercise01;

public class Main {
    public static void main(String[] args) {
        PlantFactory plantFactory1 = new PlantFactory();
        Plant plant1 = plantFactory1.createPlant("Oak", false, 3, 2);
        Plant plant2 = plantFactory1.createPlant("Rosehip", true, 5, 0.7);

        plant1.whatSpecies();
        plant2.whatSpecies();
    }
}
