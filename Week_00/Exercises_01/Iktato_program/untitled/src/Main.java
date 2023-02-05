import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Tároló tároló = new Tároló();

        try {
            File file = new File("src/input.txt");
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String pattern = "(\\d{4})/(\\w+)/(\\d{3}-\\d{3}-\\d{3})-(\\w+@\\w+.\\w+)";

                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(line);

                if(m.find()) {
                    Iktatás iktatás = new Iktatás();
                    iktatás.setÉv(m.group(1));
                    iktatás.setÜgyirat_típusa(m.group(2));
                    iktatás.setTb_szám(m.group(3));
                    iktatás.setEmail(m.group(4));
                    tároló.add(iktatás);
                } else {
                    System.out.println("A bemeneti formátum nem megfelelő");
                }

            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        for(int i = 0; i < tároló.size(); i++) {
            System.out.println("Év: " + tároló.get(i).getÉv() + ", ügyirat típusa: " + tároló.get(i).getÜgyirat_típusa()
                    + ", TB szám: " + tároló.get(i).getTb_szám()
                    + ", email: "
                    + tároló.get(i).getEmail());
        }

        tároló.nemGmail();

    }
}