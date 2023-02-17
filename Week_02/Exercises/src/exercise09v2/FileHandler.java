package exercise09v2;

public interface FileHandler {
    boolean process(String stringInput);

//    public String getExtension() {
//        int dotIndex = name.lastIndexOf('.');
//        if(dotIndex == -1) {
//            throw new RuntimeException("No extension found in the filename " + name);
//        }
//        return name.substring(dotIndex+1);
//    }


}
