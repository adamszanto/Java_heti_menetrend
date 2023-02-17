package exercise05;

public class Main {
    public static void main(String[] args) {
        Computer pc1 = new DesktopPC("Asus",32, 2048, true, true, 4, "Samsung", 24, true);
        Computer pc2 = new DesktopPC("Lenovo",16, 2048, true, false, 4, "LG", 24, false);
        Computer laptop1 = new Laptop("Asus", 32, 1024, true, false, 3, 7200 );

        pc1.describeSpecs();
        pc2.describeSpecs();
        laptop1.describeSpecs();


        // ha van egy váltóznk, akkor baloldala a statikus rész.
        // jobboldala a dinamikus rész. a new kulcsszó adja a dinamikus részt.
        // a változón csak olyan elemet hivhatunk meg ami a statikus részen definiálva van.
        if(laptop1 instanceof Laptop) {
            Laptop laptop = (Laptop)laptop1;
            laptop.castingMethod();
        }

        // laptop1 computer-t átcastoljuk laptoppá. ezáltal meg tudjuk hivni azokat a metodusokat is,
        // amik tenyleg csak a laptop-ban vannak megirva.
        // ha nem sikerül akkor castClassExceptiont dob...
    }
}
