package exercise01;

import java.util.Objects;

public class Bush extends Plant{
    private final String species;
    private final int age;
    private final boolean hasFruit;
    private final double height;

    public Bush(String species, boolean hasFruit, int age, double height) {
        this.species = species;
        this.age = age;
        this.hasFruit = hasFruit;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bush bush = (Bush) o;

        if (age != bush.age) return false;
        if (hasFruit != bush.hasFruit) return false;
        return Objects.equals(species, bush.species);
    }

    @Override
    public int hashCode() {
        int result = species != null ? species.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (hasFruit ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "species='" + species + '\'' +
                ", age=" + age +
                ", hasFruit=" + hasFruit +
                '}';
    }

    @Override
    public void whatSpecies(){
        System.out.println("I am a bush. " + species + " bush.");
    }
}
