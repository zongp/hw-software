public class FibonacciOddSum {

    public static void main(String[] args) {
        int n = 100; // Number of terms in the Fibonacci sequence
        long oddSum = findFibonacciOddSum(n);

        System.out.println("The sum of odd numbers in the first 100 Fibonacci terms is: " + oddSum);
    }

    public static long findFibonacciOddSum(int n) {
        long a = 0, b = 1, sum = 0;

        for (int i = 0; i < n; i++) {
            if (a % 2 != 0) {
                sum += a;
            }

            long temp = a + b;
            a = b;
            b = temp;
        }

        return sum;
    }
}
