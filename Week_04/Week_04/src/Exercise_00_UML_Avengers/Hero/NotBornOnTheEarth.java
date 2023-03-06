package Exercise_00_UML_Avengers.Hero;

import Exercise_00_UML_Avengers.Abilities.CanSwim;
import Exercise_00_UML_Avengers.Abilities.CanThrowFireballs;
import Exercise_00_UML_Avengers.Hero.Hero;

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
}
