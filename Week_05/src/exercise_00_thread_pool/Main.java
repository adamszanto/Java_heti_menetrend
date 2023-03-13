package exercise_00_thread_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Nem mi hozzuk létre a szálakat, hanem Executor Serviceket használunk.
        // Előre legyártott szálak közül választunk. Ezen keresztül tudunk feladatot odaadni a poolnak.

        ExecutorService es = Executors.newFixedThreadPool(5);
        ComplexTask ct1 = new ComplexTask();

        // Ha a feladatot el szeretnénk végeztetni az ExecutorService-el akkor:
        // Future visszatérési érték, olyan típus ami elküldjük futásra. Amikor szükségünk van rá akkor csekkoljuk hogy completed-e vagy sem.

        Future<Integer> f = es.submit(ct1);
        System.out.println("TEXT");
        // Futurenek 4 fontos metódusa van:
        // 1. get(), a végrehajtás addig nem megy tovább a hívás helyén, amíg vissza nem tér az eredménnyel az elkülönített szál
        // 2. isDone() boolean, befejezte-e a végrehajtást vagy sem? Ha az isDone true, akkor a get azonnal visszaadja
        // 3. cancel() félbeszakítani a metódust
        // 4. isCancelled() megnézni hogy félbeszakítottuk-e
        // Future async hívást eredményez, nem várakoztat amíg vár, hanem engedi tovább a futást.
        Integer result = f.get();
        System.out.println(result);


    }
}
