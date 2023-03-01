package exercise01;

public class PlantFactory {
    private static final int HEIGHT_LIMIT = 1;

    public Plant createPlant(String species, boolean hasFruit, int age, double height) {
        if(height < HEIGHT_LIMIT) {
            return new Bush(species, hasFruit, age, height);
        } else {
            return new Tree(species, hasFruit, age, height);
        }
    }
}
