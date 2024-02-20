import java.util.Arrays;

public class TriangleCounter {

    public static void main(String[] args) {
        int[][] sizesSet = {
                {3, 4, 5},
                {5, 10, 25},
                {7, 8, 10}
        }; // Example input set

        int result = countTrianglesInSet(sizesSet);
        System.out.println("The sum of valid triangles is: " + result);
    }

    public static int countTrianglesInSet(int[][] sizesSet) {
        int count = 0;

        for (int[] sizes : sizesSet) {
            if (isValidTriangle(sizes)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isValidTriangle(int[] sizes) {
        // Sorting the array to simplify the triangle validity check
        Arrays.sort(sizes);

        // Checking the triangle inequality
        return sizes[0] + sizes[1] > sizes[2];
    }
}
