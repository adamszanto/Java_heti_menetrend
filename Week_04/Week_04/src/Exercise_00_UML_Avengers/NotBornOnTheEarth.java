package Exercise_00_UML_Avengers;

import Exercise_00_UML_Avengers.Abilities.CanSwim;
import Exercise_00_UML_Avengers.Abilities.CanThrowFireballs;

public class NotBornOnTheEarth extends Hero implements CanSwim, CanThrowFireballs {

    public NotBornOnTheEarth(String name, Integer power, InfinityStone stone) {
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
}
