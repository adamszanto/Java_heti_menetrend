package Exercise_00_UML_Avengers.Engine;

public class LineParser {
    public static String[] parseLine(String line) {
        String[] parts = line.split(",");
        String name = parts[0].trim();
        int power = Integer.parseInt(parts[1].trim());
        String hasInfinityStone = parts[2].trim();
        boolean isFromEarth = Boolean.parseBoolean(parts[3].trim());

        return parts;
    }
}
