package Exercise_00_UML_Avengers.Hero;

public class BornOnTheEarth extends Hero {

    private final Passport passport;

    public BornOnTheEarth(String name, Integer power, String stone, Passport passport) {
        super(name, power, stone);
        this.passport = passport;
    }
}
