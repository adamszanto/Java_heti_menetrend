package exercise05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ReadFileException {
        List<String> finalList = readFile("src/exercise05/list.txt");
        printList(finalList);
    }

    public static List<String> readFile(String filePath) throws ReadFileException {
        List<String> recipeList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while(true) {
                String line = br.readLine();
                if(line == null) {
                    break;
                }

                recipeList.add(line);

            }
            return recipeList;

        } catch(IOException ex) {
            throw new ReadFileException("Error message: ", ex);
        }
    }

    public static void printList(List<String> list) {
        for(String i : list) {
            System.out.print(i + " ");
        }
    }
}
