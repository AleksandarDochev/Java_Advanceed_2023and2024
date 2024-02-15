package Jan2024.Java05_MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixDimensions = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[matrixDimensions][matrixDimensions];
        //for cycle for filling a matrix row by
        //3
        //11 2 4
        //4 5 6
        //10 8 -12
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int row = 0; row < matrix.length; row++) {
            int [] numbersCurrentRow = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
                            .split(" "))                     //["1","4","3","2"]
                    .mapToInt(Integer::parseInt)           //[1,4,3,2]
                    .toArray();
            for (int col = 0; col < matrixDimensions; col++) {
                matrix[row][col]=numbersCurrentRow[col];
            }
        }
        for (int row = 0; row < matrixDimensions; row++) {
            for (int col = 0; col < matrixDimensions; col++) {
                if (row==col){
                    primaryDiagonal = primaryDiagonal + matrix[row][col];
                }
                if (col==matrixDimensions-1-row){
                    secondaryDiagonal = secondaryDiagonal + matrix[row][col];
                }
            }
        }

        System.out.println(Math.abs(primaryDiagonal-secondaryDiagonal));

    }
    private static void buildIntegerMatrix(int rowsInput, int colsInput){

        int[][] matrix = new int[rowsInput][colsInput];


        //fillByColumnMatrix(matrix);
        //fillByRowMatrix(matrix,);
    }
    private static void fillByRowMatrix(int[][] expectedMatrix){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < expectedMatrix.length; i++) {
            int [] numbersCurrentRow = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
                            .split(" "))                     //["1","4","3","2"]
                    .mapToInt(Integer::parseInt)           //[1,4,3,2]
                    .toArray();
        }


    }



    private static void fillByColumnMatrix(int [][] expectedMatrix,int[]values){
        int position=0;
        int dimensions= expectedMatrix.length;
        for (int col = 0; col < dimensions; col++) {
            for (int row = 0; row < dimensions; row++) {
                expectedMatrix[row][col] = values[position++];
            }
        }
    }
}
