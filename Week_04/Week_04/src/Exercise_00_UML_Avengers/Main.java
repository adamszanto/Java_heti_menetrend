package Exercise_00_UML_Avengers;

import Exercise_00_UML_Avengers.engine.LineParser;
import Exercise_00_UML_Avengers.engine.LineReader;
import Exercise_00_UML_Avengers.hero.HeroFactory;


// TODO: KISBETŰS AZ ÖSSZES PACKAGE majd
// TODO: Static helyett példányok és a Mainből indítani őket... mint az IKEÁSban
public class Main {
    public static void main(String[] args) {
        HeroFactory factory = new HeroFactory();
        LineParser parser = new LineParser(factory);
        LineReader reader = new LineReader(parser);
        reader.read();
    }
}