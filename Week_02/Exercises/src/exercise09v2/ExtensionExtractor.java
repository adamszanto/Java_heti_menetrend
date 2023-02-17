package exercise09v2;

public class ExtensionExtractor {
    private final String input;
    public ExtensionExtractor(String input) {
        this.input = input;
    }

    public String getExtension() {
        int dotIndex = input.lastIndexOf('.');
        if(dotIndex == -1) {
            throw new RuntimeException("No extension found in the filename " + input);
        }
        return input.substring(dotIndex+1);
    }
}
