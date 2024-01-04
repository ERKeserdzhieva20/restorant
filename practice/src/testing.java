import java.util.concurrent.ExecutorService;
import java.util.Scanner;
import java.util.concurrent.Executors;

public class testing {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();



        Runnable task = new PrintNumbersTask(a, b);

        executor.execute(task);


        executor.shutdown();

    }

    static class PrintNumbersTask implements Runnable {

        private final int numberOne;
        private final int numberTwo;

        public PrintNumbersTask(int numberOne, int numberTwo) {

            this.numberOne = numberOne;
            this.numberTwo = numberTwo;


        }

        static boolean isPrime(int n)
        {
            // Corner case
            if (n <= 1)
                return false;

            // Check from 2 to n-1
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;

            return true;
        }

        @Override

        public void run() {

            for (int i = numberOne; i <= numberTwo; i++) {

                if (isPrime(i)){
                    System.out.println(i);

                }

            }

        }

    }

}