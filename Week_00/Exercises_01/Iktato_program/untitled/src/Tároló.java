import java.util.ArrayList;

public class Tároló extends Iktatás{
    private ArrayList<Iktatás> lista = new ArrayList<>();

    public void add(Iktatás iktatás) {
        lista.add(iktatás);
    }

    public Iktatás get(int num) {
        return lista.get(num);
    }

    public int size() {
        return lista.size();
    }

    public ArrayList<Iktatás> getLista() {
        return lista;
    }

    public void nemGmail() {
        for(Iktatás iktatott : lista) {
            if(!iktatott.getEmail().contains("gmail")) {
                System.out.println(iktatott.getEmail());
            }
        }
    }
}
