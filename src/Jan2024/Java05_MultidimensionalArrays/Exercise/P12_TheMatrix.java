package Jan2024.Java05_MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P12_TheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine(); // Move to the next line

        // Read the matrix
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = line.charAt(j * 2); // Adjust index to skip spaces
            }
        }

        // Read fillChar
        char fillChar = scanner.nextLine().charAt(0);

        // Read start position
        int startRow = scanner.nextInt();
        int startCol = scanner.nextInt();

        // Perform fill operation
        fill(matrix, startRow, startCol, matrix[startRow][startCol], fillChar);

        // Print the filled matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void fill(char[][] matrix, int row, int col, char startChar, char fillChar) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] != startChar) {
            return;
        }

        matrix[row][col] = fillChar;

        fill(matrix, row - 1, col, startChar, fillChar); // Up
        fill(matrix, row + 1, col, startChar, fillChar); // Down
        fill(matrix, row, col - 1, startChar, fillChar); // Left
        fill(matrix, row, col + 1, startChar, fillChar); // Right
    }
}
