package exercise12;

public class User {
    private String name;
    private Computer computer;

    public User(String name, Computer computer) {
        this.name = name;
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
