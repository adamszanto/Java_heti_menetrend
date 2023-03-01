package exercise03;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(divideNums2(3,5));
        System.out.println(divideNums2(6,2));
        System.out.println(divideNums2(0,5));
        System.out.println(divideNums2(5,0));
        System.out.println(divideNums2(5,1));
    }

    public static double divideNums(double a, double b) throws ArithmeticException {
        double result = 0;
        try {
            result  = a/b;
        } catch (ArithmeticException ex) {
            System.out.println("Can't be divided by Zero " + ex);
        }
        return result;
    }

    public static double divideNums2(double a, double b) throws ArithmeticException {
        // TODO: double ertekeket osszehasonlitani inkabb igy elegansabb:
        if(new BigDecimal(b).compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Can't be divided by Zero");
        }
        return a/b;
    }
}
