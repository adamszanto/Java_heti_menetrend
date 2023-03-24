package exercise01;

public class SzantoString {
    private final char[] word;

    public SzantoString(char[] word) {
        this.word = word;
    }

    private SzantoString trim() {
        String newWord = this.word + "%%";
        return newWord;

    }

    private char charAt(int index) {

    }
}
