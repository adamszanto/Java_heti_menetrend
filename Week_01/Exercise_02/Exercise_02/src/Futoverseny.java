import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Futoverseny extends Futo{
    private int letszam = 0;
    private int jelentkezok = 0;
    private ArrayList<Csapat> csapat = new ArrayList<>();

    public Futoverseny() {
    }

    public Futoverseny(int letszam) {
        this.letszam = letszam;
    }

    public int getLetszam() {
        return letszam;
    }

    public void setLetszam(int letszam) {
        this.letszam = letszam;
    }

    public int getJelentkezok() {
        return jelentkezok;
    }

    public void setJelentkezok(int jelentkezok) {
        this.jelentkezok = jelentkezok;
    }

    public void start() {
        int letszam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Futoverseny letszama: ");
        letszam = scanner.nextInt();
        this.setLetszam(letszam);

        System.out.println("Futoverseny nevezes elindult! Maximalis letszam: " + getLetszam());
    }

    public void jelentkezes() {
        System.out.println("Jelentkezes: Versenyzo neve? ");
        String nev = "";
        int tav;
        Scanner scanner = new Scanner(System.in);
        nev = scanner.nextLine();
        System.out.println("Melyik tavot akarod lefutni: 7, 14, 21 km ?");
        tav = scanner.nextInt();
        Futo futo = new Futo(nev, tav);

        if(tav == 21) {
            Csapat csapat1 = new Csapat();
            csapat1.add(futo);
            System.out.println("Egyfos csapat jelentkezes.");
        } else if(tav == 14) {
            Varolista varolista2 = new Varolista(2);
            varolista2.add(futo);

            System.out.println("Varolista meret: " + varolista2.varolistaMeret());

            if(varolista2.varolistaMeret() % varolista2.getKapacitas() != 0) {
                System.out.println("Ketfos csapat jelentkezes jelenlegi varolista :" + varolista2.varolistaMeret());
            }
            varolista2.varoListaEllenorzes();
        }
        System.out.println("Sikeres jelentkezes!\n");
        this.jelentkezok++;
    }

    public void csapatKiiras() {
        for(int i = 0; i < this.csapat.size(); i++) {
            System.out.println(this.csapat.get(i));
        }
    }

}

