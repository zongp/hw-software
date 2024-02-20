public class PrimeNumberSum {

    public static void main(String[] args) {
        int sum = findAndSumPrimes(0, 1000);
        System.out.println("The sum of prime numbers between 0 and 1000 is: " + sum);
    }

    public static int findAndSumPrimes(int start, int end) {
        int sum = 0;

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                sum += number;
            }
        }

        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

