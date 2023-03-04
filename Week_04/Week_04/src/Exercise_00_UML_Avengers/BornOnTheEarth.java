package Exercise_00_UML_Avengers;

public class BornOnTheEarth extends Hero {

    private final Passport passport;

    public BornOnTheEarth(String name, Integer power, InfinityStone stone, Passport passport) {
        super(name, power, stone);
        this.passport = passport;
    }
}
