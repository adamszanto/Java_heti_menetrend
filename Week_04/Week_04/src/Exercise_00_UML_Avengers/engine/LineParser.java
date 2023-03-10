package Exercise_00_UML_Avengers.engine;

import Exercise_00_UML_Avengers.hero.Hero;
import Exercise_00_UML_Avengers.hero.HeroFactory;

// TODO: Staticot kidobni, helyette szebben megoldani.

public class LineParser {
    private final HeroFactory factory;

    public LineParser(HeroFactory factory) {
        this.factory = factory;
    }

    public Hero parse(String line) {
        String[] parts = line.split(",");
        String name = parts[0].trim();
        int power = Integer.parseInt(parts[1].trim());
        String heroInfinityStone = parts[2].trim();
        boolean isFromEarth = parts[3].trim().equals("1");

        return factory.create(name, power, heroInfinityStone, isFromEarth);
    }
}
