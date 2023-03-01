package exercise13.Product;

public class Beauty extends Product {
    private int weightKg;

    public Beauty(String barcode, ProductType productType, String manufacturer, int price, int weightKg) {
        super(barcode, productType, manufacturer, price);
        this.weightKg = weightKg;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public String toString() {
        return "Beauty{" +
                "weightKg=" + weightKg +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Beauty beauty = (Beauty) o;

        return weightKg == beauty.weightKg;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + weightKg;
        return result;
    }
}
