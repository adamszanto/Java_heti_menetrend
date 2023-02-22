package exercise01;

import java.util.Objects;

public class Tree extends Plant {
    private final String species;
    private final boolean hasFruit;
    private final int age;
    private final double height;

    public Tree(String species, boolean hasFruit, int age, double height) {
        this.species = species;
        this.hasFruit = hasFruit;
        this.age = age;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tree tree = (Tree) o;

        if (age != tree.age) return false;
        return Objects.equals(species, tree.species);
    }

    @Override
    public int hashCode() {
        int result = species != null ? species.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void whatSpecies(){
        System.out.println("I am a tree. " + species + " tree.");
    }
}
