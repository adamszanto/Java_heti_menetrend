package exercise06;

import java.util.ArrayList;
import java.util.List;

// TODO: Customer osztállyal csinálni, lenne BadCustomer gyereke... és ugyan ugy instanceof-al csekkolni a vasarlas elott...
// TODO: Milk class ősként, és lenne tejtipus örökléssel... azokat listába szedni.
public class Main {
    public static void main(String[] args) {

        List<String> allowedCustomers = new ArrayList<>();
        allowedCustomers.add("Peter");
        allowedCustomers.add("David");
        allowedCustomers.add("Julie");
        allowedCustomers.add("Xena");

        List<String> availableMilks = new ArrayList<>();
        availableMilks.add("Cow Milk");
        availableMilks.add("Rice Milk");

        MilkStore milkStore = new MilkStore(allowedCustomers, availableMilks);

        try {
            milkStore.buyMilk("Peter", "Cow Milk");
        } catch (UnauthorizedException e) {
            System.out.println(e.getMessage());
        }

        try {
            milkStore.buyMilk("Zita", "Cow Milk");
        } catch (UnauthorizedException e) {
            System.out.println(e.getMessage());
        }


    }
}
