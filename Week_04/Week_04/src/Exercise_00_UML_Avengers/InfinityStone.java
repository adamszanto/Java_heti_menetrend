package Exercise_00_UML_Avengers;


public final class InfinityStone {
    private final String color;
    private final Integer power;

    private static final InfinityStone timeStone = new InfinityStone("Orange", 7);
    private static final InfinityStone soulStone = new InfinityStone("Green", 6);
    private static final InfinityStone powerStone = new InfinityStone("Red", 8);
    private static final InfinityStone realityStone = new InfinityStone("Yellow", 8);
    private static final InfinityStone mindStone = new InfinityStone("Blue", 7);
    private static final InfinityStone spaceStone = new InfinityStone("Purple", 8);

    private InfinityStone(String color, int power) {
        this.color = color;
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public Integer getPower() {
        return power;
    }

    public static InfinityStone getTimeStone() {
        return timeStone;
    }

    public static InfinityStone getSoulStone() {
        return soulStone;
    }

    public static InfinityStone getPowerStone() {
        return powerStone;
    }

    public static InfinityStone getRealityStone() {
        return realityStone;
    }

    public static InfinityStone getMindStone() {
        return mindStone;
    }

    public static InfinityStone getSpaceStone() {
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
