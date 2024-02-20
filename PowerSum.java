import java.math.BigInteger;

public class PowerSum {

    public static void main(String[] args) {
        BigInteger power = BigInteger.valueOf(2).pow(1337);
        int digitSum = sumDigits(power);

        System.out.println("The sum of digits of 2^1337 is: " + digitSum);
    }

    public static int sumDigits(BigInteger number) {
        String digits = number.toString();
        int sum = 0;

        for (int i = 0; i < digits.length(); i++) {
            sum += Character.getNumericValue(digits.charAt(i));
        }

        return sum;
    }
}

