public class Main {
    public static void main(String[] args) {
        B newB = new B();
        C newC = new C(newB);
        // Ebben az esetben B szolgáltatást nyújt C számára. C-nek függősége a B. B-nek van valami olyanja, ami fontos a C számára.

        // Bean = Olyan objektum, aminek az életciklusát nem a programozó határozza meg. Nem a programozó írja le a new kulcsszót, és nem mi kötögetjük a megfelelő helyre.
            // sem a B sem a C nem Bean emiatt...
            // 3 dolog ami egy objektum életciklusát meghatározza:
                // létrehozás: Konstruktor
                // használat
                // elpusztítás: Destruktor. Java-ban van lehetőség erre, az Objekt osztály metódusa: finalize()
        
        // Spring egy olyan keretrendszer, amely alkalmas lesz Bean-ek létrehozására. Bean-eket kezel, nem mi hozzuk létre stb. hanem a Spring.

        // Container = Ő az a "karmester", aki a Bean-eket létrehozza, és a függőségeket injektálja a megfelelő helyre.
        //
        // ApplicationContext lesz a Containerünk a Spring esetében
        // IOCContainernek nevezzük a Springben. (Inversion of Control) 4 felelősség = Létrehozza a Bean-eket, konfigurálja a Bean-eket, összeköti őket, menedzselni őket.

        // Spring = Technikai oldalról megtámogat, egyszerűsít bizonyos dolgokat, főleg nagyvállalati környezetben alkalmazzuk: DB kapcsolat, request fogadás, fájlrendszer kapcsolódás, stb...
        //
        // Spring Boot = Egy halom Bean-t magától példányosít, nekünk csak konfigurálni kell. Ha követjük a konvenciókat akkor a konfiguráció is automatikusan megtörténik.
    }
}