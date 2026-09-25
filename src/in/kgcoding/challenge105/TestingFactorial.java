package in.kgcoding.challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                FactorialCalculator task = new FactorialCalculator(i);
                list.add(service.submit(task));
            }

            for (int i = 0; i < list.size(); i++) {
                Future<Integer> future = list.get(i);
                System.out.printf("\nResult of %d is: %d", i, future.get());
            }


//            for (Future<Integer> future : list) {
//                System.out.printf("\n Result is: %d", future.get());
//            }

            service.shutdown();

            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("BOHOT HUA MAALIK.....");
                service.shutdown();
            }

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}






