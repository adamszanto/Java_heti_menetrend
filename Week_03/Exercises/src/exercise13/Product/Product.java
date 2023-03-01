package exercise13.Product;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

// TODO: Olyan Comparator/Comparable, amellyel barcode alapján össze lehet hasonlítani elemeket.
// TODO: PIPA Barcode az ne String legyen, hanem Objektum legyen.
// TODO: Date osztály helyett Instant (GTM+00), LocalDate (Lokális idő), LocalDateTime, LocalTime, OffsetDateTime... stb inkább...
// TODO: Beauty stb-nek: Hashcode, Equals, Getter/Setter, toString legyen
// TODO: A beauty-kitchen osztálynál ezeket az állapotokat inkább Interface-be kiszervezni. LiftUp, Switcher, stb...
// TODO: Packagek hiánya... pl. Product package amiben van a Product, az Interfacek és a leszármazottak...
// TODO: Lehetne egy Engine jellegű package. CommandProcessor, CommandReader, Warehouse kerülhetne
// TODO: Report package külön... Report generálás, fájlba írás stb...

public abstract class Product {
    private final ProductType productType;
    private final Barcode barcode;
    private final int price;
    private final LocalDate regDate;
    private final String manufacturer;

    public Product(String barcode, ProductType productType, String manufacturer, int price) {
        this.productType = productType;
        this.barcode = new Barcode(barcode);
        this.price = price;
        this.regDate = LocalDate.now();
        this.manufacturer = manufacturer;
    }


    public String getBarcode() {
        return barcode.getCode();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return this.barcode.equals(product.barcode);
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
