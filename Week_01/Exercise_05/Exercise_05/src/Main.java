import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> szamLista = new ArrayList<>();
        ArrayList<Integer> paros = new ArrayList<>();

        while(true) {
            System.out.println("Adj meg egy szamot (vagy ird be STOP hogy lealljunk): ");
            String input = scanner.nextLine();
            if(input.equals("STOP")){
                break;
            }
            try {
                int szam = Integer.parseInt(input);
                szamLista.add(szam);
                if(szam % 2 == 0) {
                    paros.add(szam);
                }
            } catch (NumberFormatException e) {
                System.out.println("Nem jo input. Kerlek adj meg egy szamot.");
            }
        }

        try {
            FileWriter fileIro = new FileWriter("paros.txt");
            PrintWriter iras = new PrintWriter(fileIro);
            for(int szam : paros) {
                iras.println(szam);
            }
            iras.close();
        } catch (IOException e) {
            System.out.println("Hiba tortent a fajl irasa kozben.");
        }

        ArrayList<Integer> primLista = new ArrayList<>();

        for(int szam : szamLista) {
            boolean prim = true;
            for(int i = 2; i <= szam/2; i++) {
                if(szam % i == 0) {
                    prim = false;
                    break;
                }
            }
            if(prim) {
                primLista.add(szam);
            }

        }
        System.out.println("A primek listaja: " + primLista);
    }
}