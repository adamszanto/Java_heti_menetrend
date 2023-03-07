package Exercise_00_UML_Avengers.hero;

import java.util.Objects;
import java.util.UUID;

// TODO: Equals, hashcode, toString() legyen implementálva
// TODO: Immutableként megoldani az osztály objektumait...
// ha

public final class Passport {
    private final String id;

    public Passport() {
    //    Random random = new Random();
    //    int passportNum = random.nextInt(900000) + 100000;
   //     id = Integer.toString(passportNum);

        this.id = UUID.randomUUID().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passport passport = (Passport) o;

        return Objects.equals(id, passport.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                '}';
    }
}
