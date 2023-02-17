package exercise10;

// TODO: Ha valamit kotelezoen akarunk, akkor konstruktorba rakjuk... nem pedig withXY metodus...

public class StudentBuilder {
    private String name;
    private int age;

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
