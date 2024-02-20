import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MoonlitCoinMiner {

    public static void main(String[] args) {
        String secretKey = "iqwjasdirjuwjq";
        long smallestNumber = mineMoonlitCoin(secretKey);
        System.out.println("The smallest base 10 number is: " + smallestNumber);
    }

    public static long mineMoonlitCoin(String secretKey) {
        long number = 0;

        while (true) {
            String candidate = secretKey + number;
            String hash = calculateMD5(candidate);

            if (hash.startsWith("000000")) {
                return number;
            }

            number++;
        }
    }

    private static String calculateMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            StringBuilder hashText = new StringBuilder(no.toString(16));

            // Pad with leading zeros
            while (hashText.length() < 32) {
                hashText.insert(0, "0");
            }

            return hashText.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not found", e);
        }
    }
}
