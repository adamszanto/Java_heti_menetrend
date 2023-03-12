package exercise_00_generics;

import java.lang.reflect.Type;
import java.util.Objects;

// Saját generikus osztály létrehozása:
// Diamond operátorba rakjuk a típusparamétereket
public class Storage<Type extends Number> {

    private final Type t;

    public Storage(Type t) {
        this.t = t;
    }

    public Type getT() {
        return t;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "t=" + t +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Storage<?> storage = (Storage<?>) o;

        return Objects.equals(t, storage.t);
    }

    @Override
    public int hashCode() {
        return t != null ? t.hashCode() : 0;
    }
}
