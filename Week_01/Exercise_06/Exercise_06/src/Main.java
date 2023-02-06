import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int min = 50000;
        int max = 110000;

        int sumSzavazo = 0;
        int sumJava = 0;
        int sumCSharp = 0;
        int sumC = 0;
        int sumCpp = 0;

        ArrayList<Megye> megyeLista = new ArrayList<>();

        Megye bacsKiskun = new Megye("Bács Kiskun",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye baranya = new Megye("Baranya",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye bekes = new Megye("Békés",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye borsodAbaujZemplen = new Megye("Borsod-Abaúj-Zemplén",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye csongranCsanad = new Megye("Csongrád-Csanád",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye fejer = new Megye("Fejér",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye gyorMosonSopron = new Megye("Győr-Moson-Sopron",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye hajduBihar = new Megye("Hajdú-Bihar",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye heves = new Megye("Heves",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye jaszNagykunSzolnok = new Megye("Jász-Nagykun-Szolnok",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye komaromEsztergom = new Megye("Komárom-Esztergom",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye nograd = new Megye("Nógrád",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye pest = new Megye("Pest",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye somogy = new Megye("Somogy",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye szabolcsSzatmarBereg = new Megye("Szabolcs-Szatmár-Bereg",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye tolna = new Megye("Tolna",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye vas = new Megye("Vas",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye veszprem = new Megye("Veszprém",random.nextInt((max - min) + 1) + min, megyeLista);
        Megye zala = new Megye("Zala",random.nextInt((max - min) + 1) + min, megyeLista);

        for(int i = 0; i < megyeLista.size(); i++) {
            megyeLista.get(i).szavazas();
            sumSzavazo+=megyeLista.get(i).getSzavazo();
            sumJava+=megyeLista.get(i).getJava();
            sumCSharp+=megyeLista.get(i).getcSharp();
            sumC+=megyeLista.get(i).getC();
            sumCpp+=megyeLista.get(i).getCpp();
        }

        for(int i = 0; i < megyeLista.size(); i++) {
            megyeLista.get(i).getEredmeny();
        }

        System.out.println("Végeredmény: ");
        System.out.println("Összesen " + sumSzavazo + " szavaztak: ");
        System.out.println("\t Java: " + sumJava);
        System.out.println("\t C#  : " + sumCSharp);
        System.out.println("\t C   : " + sumC);
        System.out.println("\t C++ : " + sumCpp);
        System.out.println("A legtöbben a " + legtobb(sumJava, sumCSharp, sumC, sumCpp) + " nyelvre szavaztak.");
        System.out.println("=================================================");
    }

    public static String legtobb(int sumJava, int sumCsharp, int sumC, int sumCpp) {
        int max = sumJava;
        String maxNyelv = "Java";
        if(sumCsharp > max) {
            max = sumCsharp;
            maxNyelv = "C#";
        }
        if(sumC > max){
            max = sumC;
            maxNyelv = "C";
        }
        if(sumCpp > max) {
            max = sumCpp;
            maxNyelv = "C++";
        }
        return maxNyelv;
    }
}