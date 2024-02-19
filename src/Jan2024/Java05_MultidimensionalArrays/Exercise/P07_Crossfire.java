package Jan2024.Java05_MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P07_Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parse matrix dimensions
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create and fill the matrix
        int[][] matrix = new int[rows][cols];
        fillMatrix(matrix);

        // Process commands
        String command;
        while (!(command = scanner.nextLine()).equals("Nuke it from orbit")) {
            String[] tokens = command.split("\\s+");
            int centerRow = Integer.parseInt(tokens[0]);
            int centerCol = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);

            destroyCells(matrix, centerRow, centerCol, radius);
        }

        // Print remaining matrix
        printMatrix(matrix);

        scanner.close();
    }

    private static void fillMatrix(int[][] matrix) {
        int value = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value++;
            }
        }
    }

    private static void destroyCells(int[][] matrix, int centerRow, int centerCol, int radius) {
        for (int i = Math.max(0, centerRow - radius); i <= Math.min(matrix.length - 1, centerRow + radius); i++) {
            for (int j = Math.max(0, centerCol - radius); j <= Math.min(matrix[i].length - 1, centerCol + radius); j++) {
                if (i == centerRow || j == centerCol) {
                    matrix[i][j] = 0; // Destroy cells forming the cross
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
