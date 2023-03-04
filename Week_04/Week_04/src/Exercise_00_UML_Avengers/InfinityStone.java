package Exercise_00_UML_Avengers;

public class InfinityStone {
    private String color;
    private Integer power;

    private static final InfinityStone timeStone = null;
    private static final InfinityStone soulStone = null;
    private static final InfinityStone powerStone = null;
    private static final InfinityStone realityStone = null;
    private static final InfinityStone mindStone = null;
    private static final InfinityStone spaceStone = null;

    private InfinityStone(String color, int power) {
        this.color = color;
        this.power = power;
    }

    public static InfinityStone getTimeStone() {
        if(timeStone.equals(null)) {
            InfinityStone timeStone = new InfinityStone("Orange", 7);
        }
        return timeStone;
    }

    public static InfinityStone getSoulStone() {
        if(soulStone.equals(null)) {
            InfinityStone soulStone = new InfinityStone("Green", 6);
        }
        return soulStone;
    }

    public static InfinityStone getPowerStone() {
        if(powerStone.equals(null)) {
            InfinityStone powerStone = new InfinityStone("Red", 8);
        }
        return powerStone;
    }

    public static InfinityStone getRealityStone() {
        if(realityStone.equals(null)) {
            InfinityStone realityStone = new InfinityStone("Yellow", 8);
        }
        return realityStone;
    }

    public static InfinityStone getMindStone() {
        if(mindStone.equals(null)) {
            InfinityStone mindStone = new InfinityStone("Blue", 7);
        }
        return mindStone;
    }

    public static InfinityStone getSpaceStone() {
        if(spaceStone.equals(null)) {
            InfinityStone spaceStone = new InfinityStone("Purple", 8);
        }
        return spaceStone;
    }

    @Override
    public String toString() {
        return "InfinityStone{" +
                "color='" + color + '\'' +
                ", power=" + power +
                '}';
    }
}
