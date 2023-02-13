package exercise10;

public class StudentBuilder {
    private String name;
    private int age;

    StudentBuilder() {

    }

    public StudentBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public Student build() {
        return new Student(name, age);
    }
}
