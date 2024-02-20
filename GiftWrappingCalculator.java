import java.util.Scanner;

public class GiftWrappingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the photo box with the scene
        System.out.print("Enter length of the photo box: ");
        int length = scanner.nextInt();

        System.out.print("Enter width of the photo box: ");
        int width = scanner.nextInt();

        System.out.print("Enter height of the photo box: ");
        int height = scanner.nextInt();

        // Calculate surface area of the picture with the scene
        int surfaceArea = 2 * (length * width + length * height + width * height);

        // Calculate size of gift wrapping paper
        int giftWrappingSize = surfaceArea + findSmallestSideArea(length, width, height);

        // Calculate length of the ribbon
        int ribbonLength = findSmallestSidePerimeter(length, width) + length * width * height;

        System.out.println("Size of gift wrapping paper: " + giftWrappingSize);
        System.out.println("Length of the ribbon: " + ribbonLength);

        scanner.close();
    }

    // Helper method to find the area of the smallest side
    private static int findSmallestSideArea(int length, int width, int height) {
        return Math.min(length * width, Math.min(length * height, width * height));
    }

    // Helper method to find the perimeter of the smallest side
    private static int findSmallestSidePerimeter(int length, int width) {
        return 2 * (length + width);
    }
}

