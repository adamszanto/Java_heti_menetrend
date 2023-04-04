package exercise01;

import java.util.Arrays;

public class SzantoString {
    private final char[] word;

    public SzantoString(char[] word) {
        this.word = word;
    }

    public char[] getWord() {
        return word;
    }

    public SzantoString trim() {
    //    char[] unFiltered = this.getWord();

        int start = 0;
        int end = word.length - 1;

        while(start <= end && Character.isWhitespace(word[start])) {
            start++;
        }

        while(end >= start && Character.isWhitespace(word[end])) {
            end--;
        }

        if(start == 0 && end == word.length -1) {
            return this;
        }

        char[] result = new char[end - start +1];
        System.arraycopy(word, start, result, 0, end -start+1);
        return new SzantoString(result);
    }

    public char charAt(int index) {
        if(index < 0 || index >= word.length) {
            throw new IndexOutOfBoundsException();
        }
        return word[index];
    }

    public SzantoString replace(char oldChar, char newChar) {
        char[] result = word.clone();

        for(int i = 0; i < word.length; i++) {
            if(result[i] == oldChar) {
                result[i] = newChar;
            }
        }
        return new SzantoString(result);
    }

    public SzantoString concat(char c) {
        char[] result = new char[word.length + 1];
        System.arraycopy(word, 0, result, 0, word.length);
        result[word.length] = c;
        return new SzantoString(result);
    }

    public SzantoString substring(int startIndex, int endIndex) {
        if(startIndex < 0 || endIndex > word.length || startIndex > endIndex) {
            throw new IndexOutOfBoundsException();
        }

        char[] result = new char[endIndex - startIndex];
        System.arraycopy(word, startIndex, result, 0, endIndex - startIndex);
        return new SzantoString(result);
    }

    public void print() {
        for(char c: word) {
            System.out.print(c);
        }
    }

    @Override
    public String toString() {
        return "SzantoStringr{" +
            "word=" + Arrays.toString(word) +
                '}';
    }
}
