package Jan2024.Java05_MultidimensionalArrays.Exercise;
import java.util.Arrays;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        // --- create an integer matrix and fill it with integers ---
        Scanner scanner = new Scanner(System.in);
        int[] matrixDimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] matrix = new int[matrixDimensions[0]][matrixDimensions[1]];

        for (int row = 0; row < matrixDimensions[0]; row++) {
            int[] numbersCurrentRow = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int col = 0; col < matrixDimensions[1]; col++) {
                matrix[row][col] = numbersCurrentRow[col];
            }
        }
        // --- create an integer matrix and fill it with integers ---

        // Find the square 3x3 with maximal sum
        int maxSum = Integer.MIN_VALUE;
        int startRow = -1, startCol = -1;

        for (int i = 0; i <= matrixDimensions[0] - 3; i++) {
            for (int j = 0; j <= matrixDimensions[1] - 3; j++) {
                int sum = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        sum += matrix[k][l];
                    }
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    startRow = i;
                    startCol = j;
                }
            }
        }

        // Print the square 3x3 with maximal sum
        System.out.println("Sum = " + maxSum);
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
