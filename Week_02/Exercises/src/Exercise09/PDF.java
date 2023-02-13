package Exercise09;

public class PDF extends File{
    public PDF(String name) {
        super(name);
    }

    public void process() {
        System.out.println("This is a PDF file.");
    }
}
