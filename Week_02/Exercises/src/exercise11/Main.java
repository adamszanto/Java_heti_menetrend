package exercise11;

public class Main {
    public static void main(String[] args) {
        Television tv1 = new Television("Videoton", "TV-01");

        for(int i = 0; i < 20; i++) {
            tv1.pushButton();
        }
    }
}
