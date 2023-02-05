import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface PUKCode {
    static final List<Integer> digits = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

    public static String nextPUK() {
        Collections.shuffle(digits);
        final StringBuilder pukDigits = new StringBuilder(4);
        for(Integer digit: digits.subList(0,4)) {
            pukDigits.append(digit);
        }
        return pukDigits.toString();
    }

}