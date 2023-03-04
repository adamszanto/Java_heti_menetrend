package Exercise_00_UML_Avengers.Engine;

import Exercise_00_UML_Avengers.BornOnTheEarth;
import Exercise_00_UML_Avengers.Engine.LineParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static Exercise_00_UML_Avengers.Engine.LineParser.parseLine;

public class LineReader {

    public static void run() {
        System.out.println("Hero creating has been started: ");
        boolean flag = true;
        LineParser lineParser = new LineParser();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            parseLine(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
