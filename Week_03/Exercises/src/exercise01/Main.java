package exercise01;

public class Main {
    public static void main(String[] args) {

        Plant plant1 = PlantFactory.createPlant("Oak", false, 3, 2);
        Plant plant2 = PlantFactory.createPlant("Rosehip", true, 5, 0.7);

        plant1.whatSpecies();
        plant2.whatSpecies();

    }
}
