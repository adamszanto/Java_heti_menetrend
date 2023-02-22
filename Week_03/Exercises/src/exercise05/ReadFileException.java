package exercise05;

public class ReadFileException extends Exception{
    public ReadFileException(String errorMessage, Exception err) {
        super(errorMessage, err);
    }

}
