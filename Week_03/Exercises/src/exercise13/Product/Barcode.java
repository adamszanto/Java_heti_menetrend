package exercise13.Product;

import java.util.Objects;

public class Barcode {
    private final String code;

    public Barcode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Barcode barcode = (Barcode) o;

        return Objects.equals(code, barcode.code);
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Barcode{" +
                "code='" + code + '\'' +
                '}';
    }
}
