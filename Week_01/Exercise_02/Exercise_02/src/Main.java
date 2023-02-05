import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Verseny verseny = start();
        Csapat egyeni = new Csapat();
        Csapat ketFo = new Csapat();
        Csapat haromFo = new Csapat();
        Varolista varolista = new Varolista();

        while(verseny.getLetszam() > verseny.getVersenyzokSzama()) {
            Versenyzo versenyzo = menu(verseny);
                ellenorzes(versenyzo, egyeni, varolista);
                verseny.sikeresJelentkezo();
        }
        System.out.println("Beteltek a helyek.");
        System.out.println("Egyéni versenyzők listája:");
        egyeni.printCsapatok();
        System.out.println("Varolistasok szama: " + varolista.varoListaszam());
        System.out.println(varolista.varoListaszam());
    }

    public static Verseny start() {
        System.out.print("Verseny letrehozas.");
        Verseny verseny = new Verseny();
        int letszam;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Add meg a verseny letszamot: ");
        letszam = scanner.nextInt();
        verseny.setLetszam(letszam);
        System.out.println("A " + letszam + " letszamu verseny elkeszult!");

        return verseny;
    }

    public static Versenyzo menu(Verseny verseny) {
            String nev;
            int tav;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Versenyzo jelentkezes, neve: ");
            nev = scanner.nextLine();
            System.out.println("7km, 10.5km, 21km - Melyik tavra jelentkezel?");
            tav = scanner.nextInt();
            Versenyzo versenyzo = new Versenyzo(nev, tav);

            return versenyzo;
    }

    public static Csapat ellenorzes(Versenyzo versenyzo, Csapat egyeni, Varolista varolista) {

        Csapat csapat = new Csapat();
        switch(versenyzo.getTav()) {
            case 21:
                egyeni.add(versenyzo);
                System.out.println("Sikeres egyeni jelentkezes.");
                break;
            case 10:
                varolista.addVarolistahoz(versenyzo);
                System.out.println("Ket fos csapat jelentkezes, varolista ellenorzes.");
                break;
            case 7:
                varolista.addVarolistahoz(versenyzo);
                System.out.println("Harom fos csapat jelentkezes, varolista ellenorzes.");
        }
        return csapat;
    }
}