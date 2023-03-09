package Exercise_03;

import java.util.Random;

public class OddPrinter implements Runnable {
    private Random random = new Random();

    // Ütemezés, Kiválasztási stratégia:
    // Random, Round Robin, Legtöbb-, legkevesebb időt igénylő
    // Amikor ezekről beszélünk, akkor mindig az azonos prioritású feladatok közül választunk. Amelyiknek magasabb a prioritása annak hamarabb el kell készülnie.
    // Tehát prioritásonként döntünk ezekről a feladatokról hogy melyik soron következő fog elindulni.
    // Kiéheztetés: Starving, starvation: Amikor egy magasabb prio feladat olyan sokáig fut, hogy az alacsonyabb prioritású feladat nem hajtódik végre.
    // Deadlock: Olyan állapot, amikor patthelyzet van...több szál is várakozik, egymásra várakoznak. Egymásra várnak és pontosan olyan elemet/erőforrást/objektumot tartanak maguknál, ami a másiknak kellene
    // hogy tudjanak továbblépni, folytatni. A vár a B-re mert a B-nél van ami az A-nak kell, és a B vár az A-ra, mert az A-nál van ami a B-nek kell.
    // Deadlockot detektálni nagyon nehéz... erőforrások nem kerülnek felszabadításra, a szálak örökre várnak egymásra, tipikusan memory leaket okozhat.
    // Legfontosabb feltenni a kérdést ha többszálú környezetben dolgozunk, hogy bizonyosodjunk meg a Deadlock elkerüléséről. Tehát egyszerre egy szál csak egy objektumot lockoljon.
    // Thread metódusai: Yield, Sleep, Object.wait és Object.notify
    // Yield: Olyan művelet, amivel adott szál lemond a futás jogáról, de nem veszíti el automatikusan a futási jogot.
    // Sleep: Várakoztatja a szálat, de nem ad lehetőséget másik szál szálára. Magánál tartja a futási jogot. Ha a sleepnél eltelik az időkeret, és az ütemető nem adta tovább, akkor marad a futási joga.
    // Sleep ellenszere: Nem nagyon van, max az interrupt... Az ütemező természetesen megszakíthatja.
    // Wait: Úgy várakoztatja a szálat, hogy ki is dobatja a szálat a végrehajtás alól. Eldobja a futási jogot. Blocked/TimedWaiting állapotba kerül... Wait után vagy blocked, vagy futásra kész lesz az állapot. De egy biztos: Hogy nem lesz nála a labda.
    // Wait hatástalanítása ezzel a 2 metódussal történhet: notify() vagy notifyAll(), ilyenkor jelzünk az ütemezőnek hogy újra oszthat nekik.


    @Override
    public void run() {
        while(true) {
            int number = random.nextInt(100);
            if(number % 2 == 1) {
                System.out.println(Thread.currentThread().getPriority() + " " + number);
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted " + ex);
            }
        }
    }
}
