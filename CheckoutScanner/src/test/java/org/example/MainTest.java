package org.example;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    RuleEngine rules = new RuleEngine();
    private double getPrice(String goods) {
        CheckOut co = new CheckOut(rules);
        for(String item : Arrays.asList(goods.split(""))) {
            co.scan(item);
        }
        return co.getTotal();
    }

    @Test
    public void testTotals() {
        assertEquals(0, getPrice(""));
        assertEquals(50, getPrice("A"));
        assertEquals(80, getPrice("AB"));
        assertEquals(115, getPrice("CDBA"));

        assertEquals(100, getPrice("AA"));
        assertEquals(130, getPrice("AAA"));
        assertEquals(180, getPrice("AAAA"));
        assertEquals(230, getPrice("AAAAA"));

        assertEquals(140, getPrice("AAABB"));
    }
}