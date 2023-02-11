package exercise06;
import java.util.ArrayList;
import java.util.List;

class MilkStore {
    private List<String> allowedCustomers;
    private List<String> availableMilks;

    public MilkStore(List<String> allowedCustomers, List<String> availableMilks) {
        this.allowedCustomers = allowedCustomers;
        this.availableMilks = availableMilks;
    }

    public void buyMilk(String customerName, String milkType) throws UnauthorizedException {
        if (!allowedCustomers.contains(customerName)) {
            throw new UnauthorizedException("Sorry, you are not allowed to enter the store.");
        }

        if (!availableMilks.contains(milkType)) {
            System.out.println("Sorry, the milk you are looking for is not available.");
        } else {
            System.out.println("Milk purchased successfully.");
        }
    }
}

class UnauthorizedException extends Exception {
    public UnauthorizedException(String message) {
        super(message);
    }
}

