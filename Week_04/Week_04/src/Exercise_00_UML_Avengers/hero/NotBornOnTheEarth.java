package Exercise_00_UML_Avengers.hero;

import Exercise_00_UML_Avengers.abilities.CanSwim;
import Exercise_00_UML_Avengers.abilities.CanThrowFireballs;

// TODO: toString implementálni ami meghívja a super.toString()-et...

public class NotBornOnTheEarth extends Hero implements CanSwim, CanThrowFireballs {

    public NotBornOnTheEarth(String name, Integer power, String stone) {
        super(name, power, stone);
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " is swimming!");
    }

    @Override
    public void canThrowFireballs() {
        System.out.println(super.getName() + " can throw fireballs!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
