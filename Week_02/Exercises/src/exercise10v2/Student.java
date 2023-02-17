package exercise10v2;

import exercise10.StudentBuilder;

public class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static class StudentBuilder {
        private String name;
        private int age;

        public StudentBuilder(){

        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(name, age);
        }
    }
}
