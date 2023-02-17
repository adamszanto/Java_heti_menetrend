package exercise09v3;

import exercise09v2.FileHandler;

public class PDFHandler implements FileHandler {
    @Override
    public boolean process(String extension) {
        // TODO: extension.equals("jpg") nem nullpointerException safe... mert mi van ha null?
        //  ezert kell igy, a konkret ertekkel kezdeni:
        if("pdf".equals(extension)) {
            System.out.println("This is a pdf.");
            return true;
        }
        return false;
    }
}
