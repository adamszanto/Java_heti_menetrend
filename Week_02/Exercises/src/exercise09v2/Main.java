package exercise09v2;

import exercise09v3.FileHandlerAggregator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO: Több osztály, PDFHandler stb...
// TODO: v3 házi feladat: FileHandler Aggregátor osztály készitése... ami tartalmazza a listát a Handlerekről,
// TODO: + képes lefuttatni egy for ciklust + lekezeli az Unknown esetet...

public class Main {
    public static void main(String[] args) {
        System.out.println("Give me filenames with extensions (e.g. picture.jpg):");
        FileHandlerAggregator handler = new FileHandlerAggregator();
        handler.startFileHandling();
    }
}
