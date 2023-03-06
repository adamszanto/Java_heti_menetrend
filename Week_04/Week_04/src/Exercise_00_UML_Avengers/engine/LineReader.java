package Exercise_00_UML_Avengers.engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: STOP megállás

public class LineReader {

    public void read() {
        System.out.println("Hero creating has been started: ");
        boolean flag = true;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while(flag) {
                LineParser.parse(br.readLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
