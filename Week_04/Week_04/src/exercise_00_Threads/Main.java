package exercise_00_Threads;

import java.util.ArrayList;
import java.util.List;

import static exercise_00_Threads.Colors.ANSI_RESET;

class StringStore {
    static final int MAX_SIZE = 10;
    final List<String> strings = new ArrayList<>(MAX_SIZE);

    public synchronized void add(String s) {
        strings.add(s);
    }

    public synchronized void remove(String s) {
        strings.remove(s);
    }
}

class Consumer extends Thread {
    final StringStore stringStore;

    public Consumer(StringStore stringStore) {
        this.stringStore = stringStore;
    }

    @Override
    public void run() {
        while(true) {
            String s = stringStore.strings.get(0);

            stringStore.remove(s);

            System.out.println("REMOVE: " + Thread.currentThread().getName() + " " + s);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Colors.getRandomColor() +  Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + ANSI_RESET);
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Colors.getRandomColor() + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + ANSI_RESET);
    }
}

public class Main {

    public static void main(String[] args) {
        // Minden olyan dolog ami végrehajtás alatt áll, fut a számítógépen azt process-nek nevezzük.
        // Minden processen belül létezik legalább 1 szál. A szál a végrehajtó egység. A szál az, ami végrehajtja sorról-sorra az utasításokat.
        // Egy folyamatnak lehetnek további alfolyamatai, állapotai.
        // Állapot: new, ready, running, waiting, terminated, suspended.
        // Hogyan lehet több szálat létrehozni adott folyamaton belül:
        // Háromféleképpen: 1. leöröklünk a Thread osztályból, 2. implementáljuk a Runnable interfészt, 3. Runnable-nek megfelelő Lambda kifejezés

        // TODO 1. példa:
        // 1. példa, leökörlünk a Thread osztályból:
        // Fontos: A Thread start() metódusa az, ami ténylegesen létrehoz egy szálat majd a háttérben ütemezve elindítja azt.
        // A start() metódus a run() metódust hívja meg!

        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());

        MyThread t1 = new MyThread();
        t1.start();

        // Ahhoz hogy egy szálat hozzon létre a főszál, ahhoz a start metódust kell meghívni. Majd a fogja elindítani a run()-t.
        // A run() metódus a Runnable interfészből jön. A start() metódus pedig a Thread osztályból.
        // Thread osztályból azért fájdalmas örökölni, mert más osztályból közvetlenül már nem tudunk örökölni emiatt.
        // Vagy ha öröklünk már más osztályból akkor a threadből nemtudunk. Ez korlát.

        // TODO 2. PÉLDA
        // 2. példa: Runnable interfészből implementálni. A Runnable-nek csak run() metódusa van,  nincs start() metódusa,
        // nem tudunk új szálat létrehozni, ahhoz nekünk egy Thread objektumra szükség van. A thread objektum konstruktorába át tudjuk adni a saját Runnable példánkat.

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        // TODO 3. Példa
        // Java 8 világával jött be: Lambdával

        Runnable r = () -> System.out.println(Colors.getRandomColor() + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + ANSI_RESET);
        Thread t3 = new Thread(r);
        t3.start();

        // A Thread-0, Thread-1, stb. azok úgynevezett "Nem Daemon" szálak: A program addig nem tud leállni,
        // amíg ezek a belső szálak nem fejezik be a futásukat.
        // Egy program akkor áll le, ha az utolsó nem daemon szál is befejezte a futását.
        // Az elindított szálakat be tudjuk állítani daemon szálként is. Ha egy szál daemon szál, akkor nem befolyásolja a process befejezését.
        // Ha egy szál daemon szál, akkor egy szál futása még akkor is fennállhat, ha a process maga ami elindította már nem fut.
        // Szálakat nem a JVM hoz létre, hanem az operációs rendszer.

        // Minden szálnak külön stack-je van. Nincs olyan hogy az egyik szál el tudja érni a másik stackjét. Ezért a stack szálbiztos.
        // A stack egysége a keret. Pl. ha van egy metódus, ami készít a new kulcsszóval hozunk létre referenciát a heapben, akkor az 5 szál 5 objektumot hoz létre a heapben.
        // 2 szál nem tudja ugyan azt a memóriaterületet elérni. Minden szálnak van saját stackje.
        // AKkor van baj, ha van a heapen egy objektum amit több szál és elérhet.
        // Inkonzisztenssé válhat az állapota, hiszen a szálak nem tudnak egymásról, nincsenek szinkronizálva a szálak.


        // 14:58 https://codejar.hu/main/courses/junior_j_js/video_65
    }
}
