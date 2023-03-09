package Exercise_00_LungAndEyes;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    // Amikor egy adaton dolgozik egy szál, akkor az az adat közelebb kerül a processzorhoz... A Main memóriából egy másolat fog létrejönni ilyenkor, és azon a másolaton hajtódnak végre
    // a műveletek. Ha a szál befejezte azon az adaton a munkát, akkor visszaírja a főmemóriába az eredményt.
    // volatile kulcsszó: megoldja hogy ne jöjjenek létre lokális, Threadekhez kapcsolódó másolatok a cache-ben (L1, L2, L3).
    // Maguk a primitívek (integer, long pl) n biten kerülnek ábrázolásra. Ha módosítjuk őket, akkor ezeknek a biteknek az átírása az nem egy megbonthatatlan folyamat...
    // Megtörténhet az, hogy az egyik szál éppen írja át a biteket, még nem is fejezte be az átírást, de egy másik szál ehhez a köztes állapothoz képest módosítást hajt végre.
    // AtomicInteger = olyan típus, amelyben csak akkor történik módosítás, ha a kívánt állapot van.
    // Main memory model = Egy adaton
    // Amikor metódust ér el több szál, akkor a metódusban található lokális változók teljes mértékben biztonságban vannak.
    // A szálak lemásolják őket a saját stackjükre, ott dolgoznak velük tovább.
    // Akkor van probléma, amikor ugyan azt az adatot egyszerre több szál is elérheti...pl ha több szál ugyanazt az objektumot külső paraméterként megkapja. PL. az eredeti Eyes-Lungs példa feladat...!
    // Ha szálbiztos objektumot adunk át, akkor nincs probléma sem... szóval ha a közös objektum szálbiztos, akkor ilyen inkonzisztens állapotba nem kerül a közös objektum.
    // Ilyen pl. az összes immutable objektum. Ezekkel nincs probléma.

    // Szálbiztos kollekciók: HashTable. Szálbiztos + null érték kezelésben különbözik a HashMap-től.
    // Vector is szálbiztos
    // CopyOnWriteArraylist is szálbiztos - Nem enged új módosítást amíg a meglévő módosítása nem történik meg.
    // ConcurrentHashMap, ConcurrentHashSet is szálbiztos
    // Collections osztály statikus metódusai: Collections.synchronized List, Set, Collection, Map... több ilyen metódusa van.



    // TODO: Stringeket összefűzni: Felhasználó megad 1000 nevet, fűzd össze őket és írd ki őket.
    // StringBuilder nem szálbiztos. Ha szálbiztos megoldás kell, akkor StringBuffer a jó eszköz. Mind a kettő ugyan arra való, azonban a környezet dönt:
    // Egy szálú környezetben a StringBuilder a gyorsabb.

    // Kérdés: szálbiztos-e ez a múködés? Pl. Ha beesik 100 thread ehhez a metódushoz:
    // Lokális a StringBuilder...
    public static void tryStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(5);
    }

    public static int calories = 20;
    public static void main(String[] args) {
    Integer object = 20;

        Lungs lungs = new Lungs(object);
        Eyes eyes = new Eyes(object);

        lungs.start();
        eyes.start();


        AtomicInteger atomicInteger =  new AtomicInteger(2);
        atomicInteger.compareAndSet(4,8);
        // compareAndSet = csak akkor történik változtatás, ha az aktuális érték az expected érték.
        // Kiküszöböli a bitek NEM ATOMI átírását, úgy hogy becsomagolja & plusz metódust kapunk.

        System.out.println(atomicInteger.get());
    }
}
