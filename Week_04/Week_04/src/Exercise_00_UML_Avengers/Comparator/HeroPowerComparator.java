package Exercise_00_UML_Avengers.Comparator;

import Exercise_00_UML_Avengers.Hero;

import java.util.Comparator;

public class HeroPowerComparator implements Comparator<Hero> {
    @Override
    public int compare(Hero o1, Hero o2) {
        return o1.getPower().compareTo(o2.getPower());
    }
}
