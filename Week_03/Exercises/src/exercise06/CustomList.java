package exercise06;

import java.util.ArrayList;
import java.util.List;

public final class CustomList {
    private List<String> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void addString(String str) {
        list.add(str);
    }

    public void removeString(String str) {
        list.remove(str);
    }

    public void removeString(int index) {
        list.remove(list.get(index));
    }

    public boolean searchString(String str) {
        return list.contains(str);
    }

    public void printList() {
        System.out.println(list);
    }
}
