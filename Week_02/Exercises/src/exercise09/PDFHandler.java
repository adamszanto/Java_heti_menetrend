package exercise09;

public class PDFHandler extends FileHandler {
    public PDFHandler(String name) {
        super(name);
    }

    public void process() {
        System.out.println("This is a PDF file.");
    }
}
