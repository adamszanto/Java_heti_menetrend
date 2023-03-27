package exercise01;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        char[] word = {'b','e','r','k','e','n','y','e',' ',' '};
        SzantoString szantoString = new SzantoString(word);
        System.out.println(szantoString);
        System.out.println(szantoString.trim());
        System.out.println(szantoString.charAt(3));
        System.out.println(szantoString.replace('e','a'));
        System.out.println(szantoString.trim().concat('x'));
        szantoString.trim().print();


    }
}
