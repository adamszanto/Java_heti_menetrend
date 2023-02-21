package ComparatorComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Hero implements Comparable<Hero>{
    String name;
    int power;

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                '}';
    }

    @Override
    public int compareTo(Hero o) {
        return name.compareTo(o.name);
    }
}

class HeroNameComparator implements Comparator<Hero> {

    @Override
    public int compare(Hero o1, Hero o2) {
        return o1.name.compareTo(o2.name);
    }
}

class HeroPowerComparator implements Comparator<Hero> {
    @Override
    public int compare(Hero o1, Hero o2) {
        return o1.power - o2.power;
    }
}

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("A",1);
        Hero hero2 = new Hero("B",0);

        List<Hero> heroes = Arrays.asList(hero1, hero2);
        System.out.println(heroes);
        System.out.println(hero1.compareTo(hero2));

        Collections.sort(heroes);
        System.out.println(heroes);
        Collections.sort(heroes, new HeroNameComparator());
        System.out.println(heroes);

        Collections.sort(heroes, new HeroPowerComparator());
        System.out.println(heroes);

    }
}
