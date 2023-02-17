package exercise09v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO: Több osztály, PDFHandler stb...
// TODO: v3 házi feladat: FileHandler Aggregátor osztály készitése... ami tartalmazza a listát a Handlerekről,
// TODO: + képes lefuttatni egy for ciklust + lekezeli az Unknown esetet...

public class Main {
    public static void main(String[] args) {
        System.out.println("Give me filenames with extensions (e.g. picture.jpg):");
        List<FileHandler> fileList = new ArrayList<>();
        fileList.add(new ImageHandler());
        fileList.add(new PDFHandler());
        try(Scanner scanner = new Scanner(System.in)) {
            for(int i = 0; i < 10; i++) {
                boolean flag = false;
                String input = scanner.nextLine();
                String extension = new ExtensionExtractor(input).getExtension();
                for(FileHandler file : fileList) {
                    if(file.process(extension)){
                       flag = true;
                    }
                }
                if(!flag) {
                    UnknownFormat unknown = new UnknownFormat();
                    unknown.process(extension);
                }
            }
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
