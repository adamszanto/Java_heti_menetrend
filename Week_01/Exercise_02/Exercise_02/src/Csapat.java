import java.util.ArrayList;

public class Csapat {
    private ArrayList<Versenyzo> csapat = new ArrayList<>();

    public void add(Versenyzo versenyzo) {
        csapat.add(versenyzo);
    }

    public Versenyzo get(int num) {
        return csapat.get(num);
    }

    public void printCsapatok() {
        for(int i = 0; i < csapat.size(); i++) {
            System.out.println("Versenyzo: " + csapat.get(i).getName());
        }
    }
}
