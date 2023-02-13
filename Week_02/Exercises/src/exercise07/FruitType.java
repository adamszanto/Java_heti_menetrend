package exercise07;

public enum FruitType {
    APPLE("A"), PEAR("K"), PLUM("S");

    private String input;

    FruitType(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}
