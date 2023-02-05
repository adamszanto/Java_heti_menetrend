import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Varolista {
    HashMap<Versenyzo, Integer> varolista = new HashMap<>();

    int counter10 = 0;
    int counter7 = 0;
    public void addVarolistahoz(Versenyzo versenyzo) {
        varolista.put(versenyzo, versenyzo.getTav());
        varolistaCheck(new Csapat(), new Csapat());
    }

    public int varoListaszam() {
        return varolista.size();
    }


    private void varolistaCheck(Csapat ketFo, Csapat haromFo) {
        System.out.println("Varolista check lefut");
        int counter7 = 0;
        int counter10 = 0;
        List<Versenyzo> versenyzo7 = new ArrayList<>();
        List<Versenyzo> versenyzo10 = new ArrayList<>();

        for(Map.Entry<Versenyzo, Integer> entry: varolista.entrySet()) {
            Versenyzo versenyzo = entry.getKey();
            int value = entry.getValue();

            if(value == 7) {
                counter7++;
                versenyzo7.add(versenyzo);
            } else if(value == 10) {
                counter10++;
                versenyzo10.add(versenyzo);
            }

            if(counter7 == 3) {
                haromFo.add(versenyzo7.get(0));
                haromFo.add(versenyzo7.get(1));
                haromFo.add(versenyzo7.get(2));
                System.out.println("Uj harom fos csapat elkeszult!");
                versenyzo7.clear();
            } else if(counter10 == 2) {
                ketFo.add(versenyzo10.get(0));
                ketFo.add(versenyzo10.get(1));
                System.out.println("Uj ketfos csapat elkeszult");
                versenyzo10.clear();
            }
        }
    }
}
