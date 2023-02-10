package exercise05;

public class Main {
    public static void main(String[] args) {
        DesktopPC pc1 = new DesktopPC("Asus",32, 2048, true, true, 4, "Samsung", 24, true);
        DesktopPC pc2 = new DesktopPC("Lenovo",16, 2048, true, false, 4, "LG", 24, false);
        Laptop laptop1 = new Laptop("Asus", 32, 1024, true, false, 3, 7200 );

        pc1.describeSpecs();
        pc2.describeSpecs();
        laptop1.describeSpecs();


    }
}
