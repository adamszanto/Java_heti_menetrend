package exercise01;

public class PlantFactory {

    public static Plant createPlant(String species, boolean hasFruit, int age, double height) {
        if(height < 1) {
            return new Bush(species, hasFruit, age, height);
        } else {
            return new Tree(species, hasFruit, age, height);
        }
    }
}
