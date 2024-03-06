package Jan2024.Java05_MultidimensionalArrays.Exercise;
import java.util.*;

public class P09_ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        boolean[][] parkingLot = new boolean[rows][cols - 1];

        scanner.nextLine(); // Consume the remaining newline character

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("stop")) {
                break;
            }

            String[] parts = line.split(" ");
            int entryRow = Integer.parseInt(parts[0]) - 1;
            int desiredX = Integer.parseInt(parts[1]) - 1;
            int desiredY = Integer.parseInt(parts[2]) - 1;

            int distance = park(parkingLot, entryRow, desiredX, desiredY, rows, cols);
            if (distance == -1) {
                System.out.println("Row " + (entryRow + 1) + " full");
            } else {
                System.out.println(distance);
            }
        }

        scanner.close();
    }

    private static int park(boolean[][] parkingLot, int entryRow, int desiredX, int desiredY, int rows, int cols) {
        if (!parkingLot[entryRow][desiredY]) {
            parkingLot[entryRow][desiredY] = true;
            return Math.abs(desiredY - 0) + 1;
        }

        int leftDistance = desiredY;
        int rightDistance = cols - desiredY - 2;
        int minDistance = Integer.MAX_VALUE;
        int closestSpot = -1;

        for (int i = 1; i <= Math.min(leftDistance, rightDistance); i++) {
            int leftSpot = desiredY - i;
            if (leftSpot >= 0 && !parkingLot[entryRow][leftSpot]) {
                int distance = i + 1;
                if (distance < minDistance || (distance == minDistance && leftSpot < closestSpot)) {
                    minDistance = distance;
                    closestSpot = leftSpot;
                }
            }

            int rightSpot = desiredY + i;
            if (rightSpot < cols - 1 && !parkingLot[entryRow][rightSpot]) {
                int distance = i + 1;
                if (distance < minDistance || (distance == minDistance && rightSpot < closestSpot)) {
                    minDistance = distance;
                    closestSpot = rightSpot;
                }
            }
        }

        if (closestSpot == -1) {
            return -1; // Row is full
        }

        parkingLot[entryRow][closestSpot] = true;
        return minDistance;
    }
}

