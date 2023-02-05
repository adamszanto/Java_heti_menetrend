import java.util.ArrayList;

public class Verseny {
    private int letszam;
    private int versenyzokSzama;
    private ArrayList<Csapat> csapatLista = new ArrayList<>();

    public Verseny() {
        this.versenyzokSzama = 0;
    }

    public int getLetszam() {
        return letszam;
    }

    public int getVersenyzokSzama() {
        return versenyzokSzama;
    }

    public ArrayList<Csapat> getCsapatLista() {
        return csapatLista;
    }

    public void add(Csapat csapat) {
        csapatLista.add(csapat);
    }

    public void setLetszam(int letszam) {
        this.letszam = letszam;
    }

    public void sikeresJelentkezo() {
        this.versenyzokSzama++;
    }

}
