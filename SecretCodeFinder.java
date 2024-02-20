public class SecretCodeFinder {

    public static void main(String[] args) {
        String[] dataSet = {
                "1abc2",
                "pqr3stu8vwx",
                "a1b2c3d4e5f",
                "treb7uchet"
        }; // Example input dataset

        int secretCode = findSecretCode(dataSet);
        System.out.println("The secret code is: " + secretCode);
    }

    public static int findSecretCode(String[] dataSet) {
        int sum = 0;

        for (String line : dataSet) {
            int firstNumber = extractNumber(line, true);
            int lastNumber = extractNumber(line, false);

            // Add the extracted numbers to the sum
            sum += (firstNumber + lastNumber);
        }

        return sum;
    }

    public static int extractNumber(String line, boolean isFirst) {
        StringBuilder number = new StringBuilder();

        for (char c : isFirst ? line.toCharArray() : new StringBuilder(line).reverse().toString().toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            } else if (number.length() > 0) {
                break; // Stop when a non-digit character is encountered after extracting the number
            }
        }

        return number.length() > 0 ? Integer.parseInt(number.toString()) : 0;
    }
}
