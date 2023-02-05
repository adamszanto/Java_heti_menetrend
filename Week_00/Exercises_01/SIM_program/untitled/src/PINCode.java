import java.util.*;

public interface PINCode {
    static final List<Integer> digits = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

    public static String nextPIN() {
        Collections.shuffle(digits);
        final StringBuilder pinDigits = new StringBuilder(4);
        for(Integer digit: digits.subList(0,4)) {
            pinDigits.append(digit);
        }
        return pinDigits.toString();
    }
}

