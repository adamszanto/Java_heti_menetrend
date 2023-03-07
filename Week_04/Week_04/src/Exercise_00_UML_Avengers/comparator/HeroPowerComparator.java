package Exercise_00_UML_Avengers.comparator;

import Exercise_00_UML_Avengers.hero.Hero;

import java.util.Comparator;

public class HeroPowerComparator implements Comparator<Hero> {
    @Override
    public int compare(Hero o1, Hero o2) {

        if(o1.getPower().compareTo(o2.getPower()) == 0) {
            HeroNameComparator heroName = new HeroNameComparator();
            return heroName.compare(o1, o2);
        } else {
            return o1.getPower().compareTo(o2.getPower());
        }
    }
}
