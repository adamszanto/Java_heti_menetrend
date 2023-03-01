package exercise06;

import java.util.ArrayList;
import java.util.List;

// TODO: Optional elnevezésben megjelenhet. Flux, Mono még ezek megjelenhetnek (csomagoló). Ezeken kívül a típusnak nem kell megjelennie az elnevezésben, erre kell törekedni.
public final class CustomList {
    private final List<String> stringValues;

    public CustomList() {
        this.stringValues = new ArrayList<>();
    }

    public void addString(String str) {
        stringValues.add(str);
    }

    public void removeString(String str) {
        stringValues.remove(str);
    }

    public void removeString(int index) {
        stringValues.remove(stringValues.get(index));
    }

    public boolean searchString(String str) {
        return stringValues.contains(str);
    }

    public void printList() {
        System.out.println(stringValues);
    }
}
