package exercise09;

import java.util.Scanner;

// TODO: Több osztály, PDFHandler stb...

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me filenames with extensions (e.g. picture.jpg):");
        try {
            for(int i = 0; i < 10; i++) {
                String input = scanner.nextLine();
                String extension = new FileHandler(input).getExtension();
                if(extension.equals("pdf")) {
                    new PDFHandler(input).process();
                } else if(extension.equals("jpg") || extension.equals("jpeg")) {
                    new ImageHandler(input).process();
                } else {
                    new UnknownFormat(input).process();
                }
            }
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
