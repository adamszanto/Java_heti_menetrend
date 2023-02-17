package exercise09v3;

import exercise09v2.ExtensionExtractor;
import exercise09v2.FileHandler;
import exercise09v2.UnknownFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandlerAggregator {
    private final List<FileHandler> fileList = new ArrayList<>();

    public FileHandlerAggregator() {
        fileList.add(new ImageHandler());
        fileList.add(new PDFHandler());
    }

    public void startFileHandling() {
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
                    exercise09v2.UnknownFormat unknown = new UnknownFormat();
                    unknown.process(extension);
                }
            }
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
