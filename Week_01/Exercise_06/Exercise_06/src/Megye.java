import java.util.ArrayList;
import java.util.Random;

public class Megye {
    private final String nev;
    private final int szavazo;
    private int java = 0;
    private int cSharp = 0;
    private int c = 0;
    private int cpp = 0;

    Random random = new Random();
    public Megye(String nev, int szavazo, ArrayList megyeLista) {
        this.nev = nev;
        this.szavazo = szavazo;
        megyeLista.add(this);
    }

    public String getNev() {
        return nev;
    }

    public int getSzavazo() {
        return szavazo;
    }

    public int getJava() {
        return java;
    }

    public int getcSharp() {
        return cSharp;
    }

    public int getC() {
        return c;
    }

    public int getCpp() {
        return cpp;
    }

    public void szavazas() {
        for(int i = 0; i < szavazo; i++) {
            int randomVote = random.nextInt(4);
                switch(randomVote) {
                    case 0:
                        java++;
                        break;
                    case 1:
                        cSharp++;
                        break;
                    case 2:
                        c++;
                        break;
                    case 3:
                        cpp++;
                        break;
                }
        }
    }

    public void getEredmeny() {
        System.out.println("A " + getNev() + " szavazás eredménye: ");
        System.out.println(getSzavazo() + " szavazott:");
        System.out.println("\t java = " + getJava());
        System.out.println("\t c#   = " + getcSharp());
        System.out.println("\t c    = " + getC());
        System.out.println("\t c++  = " + getCpp());

        if((float)getCpp()/(float)getSzavazo() >= 0.20) {
            System.out.println("Ebben a megyében a szavazók legalább 20%-a voksolt a C++ mellett.");
        }
        System.out.println("=================================================");
    }
}
