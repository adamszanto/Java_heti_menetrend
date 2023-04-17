package org.example;

public class Main {
    public static void main(String[] args) {
        // Interfész: Szerződés, amelyik osztály implementálja az interfészt, akkor implementálni kell azokat a metódusokat is, amik definiálva vannak az interfészben is.

        Printable lambdaPrintable = (s) -> System.out.println("Meow" + s);
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing) {
        thing.print("!");
    }
}