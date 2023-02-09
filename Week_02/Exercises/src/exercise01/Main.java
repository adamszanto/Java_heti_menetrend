package exercise01;
public class Main {

    public static void main(String args[]) {
        int foo = 13;
        System.out.println(foo);

        setFoo(foo);
        System.out.println(foo);
    }
    public static void setFoo(int bar) {
        bar = 2;
    }
}