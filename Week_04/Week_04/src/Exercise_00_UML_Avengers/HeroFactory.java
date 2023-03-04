package Exercise_00_UML_Avengers;

public class HeroFactory {

    public static Hero makeHero(String name, int power, InfinityStone infinityStone, boolean isFromEarth) {
        if(isFromEarth) {
            System.out.println("New Earth Hero has been made!");
            return new BornOnTheEarth(name, power, infinityStone, new Passport());
        } else {
            System.out.println("New non-Earth Hero has been made!");
            return new NotBornOnTheEarth(name, power, infinityStone);
        }
    }

}
