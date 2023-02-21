package AbstractClassVSInterface;

import java.util.Objects;

public class Cow {
    private final String name;
    private final int age;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Cow cow = (Cow) o;

        if (age != cow.age)
            return false;

        return Objects.equals(name, cow.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
