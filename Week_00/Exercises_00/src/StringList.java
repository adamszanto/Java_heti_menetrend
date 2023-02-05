import java.util.ArrayList;


// Ha egy szál belép egy sync metódusba, akkor másik szál addig nem léphet be amig az 1. be nem fejezte, anélkül inkonzisztens állapotunk lenne
// Ebben a formában a this objektumra rárak egy "lakatot", lockolja.

public class StringList {
    private final ArrayList<String> array = new ArrayList<>();

    public synchronized void addString(String s) {
        array.add(s);
    }

    public synchronized void removeString(String s) {
        array.remove(s);
    }

    public synchronized String getString(int index) {
        return array.get(index);
    }

    public synchronized int getSize() {
        return array.size();
    }
}



