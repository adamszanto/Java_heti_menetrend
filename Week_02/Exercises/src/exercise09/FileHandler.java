package exercise09;

public class FileHandler {
    private final String name;

    public FileHandler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        int dotIndex = name.lastIndexOf('.');
        if(dotIndex == -1) {
            throw new RuntimeException("No extension found in the filename " + name);
        }
        return name.substring(dotIndex+1);
    }


}
