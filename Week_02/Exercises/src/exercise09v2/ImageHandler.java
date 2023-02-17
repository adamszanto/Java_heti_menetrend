package exercise09v2;

public class ImageHandler implements FileHandler {

    @Override
    public boolean process(String extension) {
        // TODO: extension.equals("jpg") nem nullpointerException safe... mert mi van ha null?
        //  ezert kell igy, a konkret ertekkel kezdeni:
        if("jpg".equals(extension) || "jpeg".equals(extension)) {
            System.out.println("This is an image.");
            return true;
        }
        return false;
    }
}
