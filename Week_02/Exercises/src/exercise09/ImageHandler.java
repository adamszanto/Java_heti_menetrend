package exercise09;

public class ImageHandler extends FileHandler {
    public ImageHandler(String name) {
        super(name);
    }

    public void process() {
        System.out.println("This is an image.");
    }
}
