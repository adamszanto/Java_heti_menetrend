package exercise02;

public class Main {
    public static void main(String[] args) {
        Processor cpu = new Processor("Intel", "Core i9-13900K", 9);
        GraphicsCard vga = new GraphicsCard("MSI GeForce", "GT 710", 2,"GDDR3");

        Laptop laptop1 = new Laptop("Asus", "ProArt StudioBook H7600HM-L2033X", 2000, true, 64, 16, cpu, vga);

        System.out.println(laptop1.getClass().getSimpleName() + " details: ");
        System.out.println(laptop1);
    }
}