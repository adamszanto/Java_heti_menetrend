package Exercise_00_UML_Avengers.Comparator;

import Exercise_00_UML_Avengers.Hero.Hero;

import java.util.Comparator;

public class HeroNameComparator implements Comparator<Hero> {

    @Override
    public int compare(Hero o1, Hero o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
