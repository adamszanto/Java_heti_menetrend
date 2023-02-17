package exercise10;

// TODO v2 HF: megoldani static inner classkent a Buildert

public class Main {
    public static void main(String[] args) {
        Student student1 = new StudentBuilder()
                .withName("Peter")
                .withAge(16).build();

        System.out.println(student1.getName() + " " + student1.getAge());
    }
}
