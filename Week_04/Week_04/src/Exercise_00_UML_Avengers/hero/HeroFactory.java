package Exercise_00_UML_Avengers.hero;

public class HeroFactory {

    public Hero create(String name, int power, String infinityStone, boolean isFromEarth) {
        if(isFromEarth) {
            System.out.println("New Earth Hero has been made!");
            return new BornOnTheEarth(name, power, infinityStone, new Passport());
        } else {
            System.out.println("New non-Earth Hero has been made!");
            return new NotBornOnTheEarth(name, power, infinityStone);
        }
    }

}
