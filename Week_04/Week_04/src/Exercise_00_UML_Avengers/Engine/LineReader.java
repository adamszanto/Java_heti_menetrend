package Exercise_00_UML_Avengers.Engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
