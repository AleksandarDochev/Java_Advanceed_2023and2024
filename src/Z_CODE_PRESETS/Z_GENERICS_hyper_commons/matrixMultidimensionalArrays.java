package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

import java.util.Arrays;
import java.util.Scanner;

public class matrixMultidimensionalArrays {
    public static void main(String[] args) {



        //--- create a integer matrix and fill with integers ---------
        Scanner scanner = new Scanner(System.in);
        int [] matrixDimensions = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
                        .split(" "))                     //["1","4","3","2"]
                .mapToInt(Integer::parseInt)           //[1,4,3,2]
                .toArray();
        int[][] matrix = new int[matrixDimensions[0]][matrixDimensions[1]];
        //for cycle for filling a matrix row by
        //4 5
        //1 5 5 2 4
        //2 1 4 14 3
        //3 7 11 2 8
        //4 8 12 16 4

        for (int row = 0; row < matrixDimensions[0]; row++) {
            int [] numbersCurrentRow = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
                            .split(" "))                     //["1","4","3","2"]
                    .mapToInt(Integer::parseInt)           //[1,4,3,2]
                    .toArray();
            for (int col = 0; col < matrixDimensions[1]; col++) {
                matrix[row][col]=numbersCurrentRow[col];
            }
        }
        //--- create a integer matrix and fill with integers ---------

    }
}
