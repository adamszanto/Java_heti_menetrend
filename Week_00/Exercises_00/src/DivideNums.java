public class DivideNums {
    public void divideTwoNums(int num1, int num2) {
        double result = 0;
        try {
            result = num1/num2;
            System.out.println(num1 +  "/" + num2 +  "Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zero" + e);
        }
    }
}
