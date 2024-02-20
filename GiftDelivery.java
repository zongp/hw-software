import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GiftDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the directions
        System.out.print("Enter the directions: ");
        String directions = scanner.nextLine();

        // Calculate the number of houses visited at least once
        int housesVisited = calculateHousesVisited(directions);

        System.out.println("Number of houses visited at least once: " + housesVisited);

        scanner.close();
    }

    private static int calculateHousesVisited(String directions) {
        Set<String> visitedHouses = new HashSet<>();
        int currentX = 0, currentY = 0;

        // Mark the starting point as visited
        visitedHouses.add(currentX + "," + currentY);

        // Iterate through each direction
        for (char direction : directions.toCharArray()) {
            switch (direction) {
                case '^':
                    currentY++;
                    break;
                case 'v':
                    currentY--;
                    break;
                case '>':
                    currentX++;
                    break;
                case '<':
                    currentX--;
                    break;
            }

            // Mark the current position as visited
            visitedHouses.add(currentX + "," + currentY);
        }

        // Return the number of unique houses visited at least once
        return visitedHouses.size();
    }
}
