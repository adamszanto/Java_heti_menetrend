package Exercise09;

public class File {
    private final String name;

    public File(String name) {
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
