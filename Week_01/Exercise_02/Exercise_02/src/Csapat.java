import java.util.ArrayList;

public class Csapat {
    private ArrayList<Futo> csapattagok = new ArrayList<>();

    public void add(Futo futo) {
        csapattagok.add(futo);
    }

    public Futo get(int i) {
        return csapattagok.get(i);
    }
}
