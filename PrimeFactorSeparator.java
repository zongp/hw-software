import java.util.Scanner;

public class PrimeFactorSeparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long inputNumber = scanner.nextLong();

        System.out.print("Prime factors of " + inputNumber + ": ");
        separatePrimeFactors(inputNumber);

        scanner.close();
    }

    public static void separatePrimeFactors(long number) {
        if (number <= 1) {
            System.out.println("Prime factors are not defined for numbers less than or equal to 1.");
            return;
        }

        while (number % 2 == 0) {
            System.out.print("2 ");
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        if (number > 2) {
            System.out.print(number);
        }

        System.out.println();
    }
}
