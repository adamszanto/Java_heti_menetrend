package Exercise_00_UML_Avengers.comparator;

// TODO: 3. Comparator írása: Azonos power esetén a név döntsön...


import Exercise_00_UML_Avengers.hero.Hero;

import java.util.Comparator;

public class HeroNameComparator implements Comparator<Hero> {

    @Override
    public int compare(Hero o1, Hero o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
