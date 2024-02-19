package Jan2024.Java05_MultidimensionalArrays.Exercise;
import java.util.Arrays;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        // --- create a string matrix and fill it with strings ---
        Scanner scanner = new Scanner(System.in);
        int[] matrixDimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[][] matrix = new String[matrixDimensions[0]][matrixDimensions[1]];

        for (int row = 0; row < matrixDimensions[0]; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }
        // --- create a string matrix and fill it with strings ---

        // Process commands until "END" is entered
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("END")) {
                break;
            }

            String[] tokens = command.split(" ");
            if (tokens.length != 5 || !tokens[0].equals("swap")) {
                System.out.println("Invalid input!");
                continue;
            }

            try {
                int row1 = Integer.parseInt(tokens[1]);
                int col1 = Integer.parseInt(tokens[2]);
                int row2 = Integer.parseInt(tokens[3]);
                int col2 = Integer.parseInt(tokens[4]);

                if (!isValidCell(matrixDimensions[0], matrixDimensions[1], row1, col1) ||
                        !isValidCell(matrixDimensions[0], matrixDimensions[1], row2, col2)) {
                    System.out.println("Invalid input!");
                    continue;
                }

                String temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;

                printMatrix(matrix);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }

        scanner.close();
    }

    // Check if the cell coordinates are within the bounds of the matrix
    private static boolean isValidCell(int numRows, int numCols, int row, int col) {
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }

    // Print the matrix
    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
