package Exercise_04;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    private final List<String> listOfStrings;
    private final Object object = new Object();

    // Kritikus szakasz: olyan kódrész, amelyet egyszerre több szál is elérhet, és inkonzisztens állapotba kerülhetnek az ott található objektumok.
    // Kölcsönös kizárás: A kritikus szakaszt védjük le oly módon,hogy a párhuzamos végrehajtás ne történhessen meg.
    // Kódolás közben fel kell ismernünk a kritikus szakaszokat...! Pl. többszálú környezetben használt tároló...
    // a 16-es sorban létrehozott ArrayList a kritikus szakaszunk... ez az az erőforrás, amelyet több szál is elérhet egyszerre. Inkonzisztens állapotba kerülhet tőle az objektum belső állapota...
    // Megoldások: 1. CopyOnWriteArrayList implementálni ArrayList helyett... nem kellene synchronized, Lock objektum stb... ez megoldaná a szálbiztosságot... 2. synchronized kulcsszó 3. Különböző Lock interfész implementációk:
    public StringList(List<String> listOfStrings) {
        this.listOfStrings = new ArrayList<>();
    }

    // synchronized kulcsszót rakhatunk metódusra. akkor kb. ez valósul meg synchronized(this) az egészre... ezt kapjuk automatikusan vele.
    // synchronized kulcsszó mit csinál? Egy szálnak odaadunk erőforrást. Az az erőforrás mindaddig csak annak a szálnak a birtokában lesz, amíg be nem fejezi rajta a műveletet.
    // this az az erőforrás, amit egyszerre csak 1 szál birtokolhat, ezáltal kialakul ez a kölcsönös kizárás.
    // Sleep esetén TimedWaiting van. Wait esetében waiting van (csak notify vagy nofityAll-al tudunk visszajönni Waitből). Synchronized esetében pedig blocked állapotban várakoznak a szálak.
    // synchronized blokk hátránya: UGYAN ABBAN a metódusban le kell zárni, amelyikben megnyitottuk... ha másik metódusban akarom lezárni a blokkot/elengedni az erőforrást... akkor más
    // implementáció szükséges a Lock interface részéről: reEntrantLock, reEntrantReadWriteLock
    // Semaphor = tudjuk kontrollálni hogy adott szakaszra hány szál juthat be... vonatsínak is semaphorral vannak ellátva... a vonat csak akkor léphet be adott szakaszra, ha az üres.
    // 0,1 jellegű bemehetsz, vagy nem!
    // Javaban megcsinálták hogy arra a szakaszra egyszerre bemehet 5 szál, stb. tehát maximális értéket megadhatunk neki.
    // TODO: Thread pools
    public void addString(String s) {
        synchronized (object){
            listOfStrings.add(s);
        }
    }

    public void removeString(String s) {
        listOfStrings.remove(s);
    }

    public synchronized String getString(int index) {
        return listOfStrings.get(index);
    }

    public synchronized int getSize() {
        return listOfStrings.size();
    }

 }
