package Exercise_04;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    private final List<String> listOfStrings;

    public StringList(List<String> listOfStrings) {
        this.listOfStrings = new ArrayList<>();
    }

    public synchronized void addString(String s) {
        listOfStrings.add(s);
    }

    public synchronized void removeString(String s) {
        listOfStrings.remove(s);
    }

    public synchronized String getString(int index) {
        return listOfStrings.get(index);
    }

    public synchronized int getSize() {
        return listOfStrings.size();
    }
 }
