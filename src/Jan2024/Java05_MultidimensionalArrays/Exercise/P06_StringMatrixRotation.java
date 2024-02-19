package Jan2024.Java05_MultidimensionalArrays.Exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int degrees = Integer.parseInt(command.substring(7, command.length() - 1)) % 360;

        List<String> lines = new ArrayList<>();
        String line;
        while (!(line = scanner.nextLine()).equals("END")) {
            lines.add(line);
        }

        char[][] matrix = new char[lines.size()][];
        int maxLength = 0;
        for (int i = 0; i < lines.size(); i++) {
            matrix[i] = lines.get(i).toCharArray();
            maxLength = Math.max(maxLength, matrix[i].length);
        }

        if (degrees == 90) {
            rotate90Degrees(matrix, maxLength);
        } else if (degrees == 180) {
            rotate180Degrees(matrix, maxLength);
        } else if (degrees == 270) {
            rotate270Degrees(matrix, maxLength);
        } else {
            printMatrix(matrix);
        }

        scanner.close();
    }

    private static void rotate90Degrees(char[][] matrix, int maxLength) {
        for (int col = 0; col < maxLength; col++) {
            for (int row = matrix.length - 1; row >= 0; row--) {
                if (col < matrix[row].length) {
                    System.out.print(matrix[row][col]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void rotate180Degrees(char[][] matrix, int maxLength) {
        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = maxLength - 1; col >= 0; col--) {
                if (col < matrix[row].length) {
                    System.out.print(matrix[row][col]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void rotate270Degrees(char[][] matrix, int maxLength) {
        for (int col = maxLength - 1; col >= 0; col--) {
            for (char[] row : matrix) {
                if (col < row.length) {
                    System.out.print(row[col]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            System.out.println(row);
        }
    }
}
