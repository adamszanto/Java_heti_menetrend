package exercise_00_thread_pool;
import java.util.concurrent.Callable;

public class ComplexTask implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        return 10;
    }
}
