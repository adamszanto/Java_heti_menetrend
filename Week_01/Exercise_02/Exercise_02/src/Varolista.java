import java.util.ArrayList;
import java.util.HashMap;

public class Varolista {
    private ArrayList<Futo> futoLista = new ArrayList<>();
    private int kapacitas;

    public Varolista(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public int varolistaMeret() {
        return futoLista.size();
    }

    public void add(Futo futo) {
        futoLista.add(futo);
    }

    public Futo get(int i) {
        return futoLista.get(i);
    }

    public void varoListaEllenorzes() {

        if(this.futoLista.size() == kapacitas) {
            Csapat csapat2 = new Csapat();
            csapat2.add(futoLista.get(0));
            csapat2.add(futoLista.get(1));
            futoLista.clear();
            System.out.println("2 fos csapat hozzarendeles elkeszult");
        }
    }
}
