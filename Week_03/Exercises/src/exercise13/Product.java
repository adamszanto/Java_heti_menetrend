package exercise13;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class Product {
    private final PRODUCT_TYPE productType;
    private final String barcode;
    private final int price;
    private final Date regDate;
    private final String manufacturer;

    public Product(PRODUCT_TYPE productType, String barcode, int price, String manufacturer) {
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        this.productType = productType;
        this.barcode = barcode;
        this.price = price;
        this.regDate = ts;
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return Objects.equals(barcode, product.barcode);
    }

    @Override
    public int hashCode() {
        return barcode != null ? barcode.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productType=" + productType +
                ", barcode='" + barcode + '\'' +
                ", price=" + price +
                ", regDate=" + regDate +
                '}';
    }
}
