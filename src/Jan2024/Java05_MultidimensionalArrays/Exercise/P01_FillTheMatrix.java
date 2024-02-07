package Jan2024.Java05_MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01_FillTheMatrix {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);


        String[] stringArr = scanner.nextLine().split(", ");
        int dimensions = Integer.parseInt(stringArr[0]);
        String pattern = stringArr[1];
        //                        rows       cols
        int[][] matrix = new int[dimensions][dimensions];

        if (stringArr[1].equals("A")){
            patternA(matrix);
        }else {
            patternB(matrix);
        }

        //printMultiDimArrayV1(matrix);
        //printMultiDimArrayV2(matrix);

    }
    private static void patternA(int[][] array){

        int num = 1;
        int dimensions= array.length;
        for (int col = 0; col < dimensions; col++) {
            for (int row = 0; row < dimensions; row++) {
                array[row][col] = num++;
            }
        }
        printMultiDimArrayV1(array);
    }
    private static void patternB(int[][] array){
        int num = 1;
        int dimensions= array.length;
        for (int col = 0; col < dimensions; col++) {
            if (col%2==1){
                for (int row = dimensions-1; row <= dimensions; row--) {
                    if (row<0){
                        break;
                    }
                    array[row][col] = num++;

                }
            }else {
                for (int row = 0; row < dimensions; row++) {
                    array[row][col] = num++;
                }
            }

        }
        printMultiDimArrayV1(array);

    }
    public static void printMultiDimArrayV1(int[][] array){
        for (int row = 0; row < array.length; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < array[row].length; col++) {
                sb.append(array[row][col])
                        .append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
    private static void printMultiDimArrayV2(int[][] array){
        for (int row = 0; row < array.length; row++) {
            System.out.println(Arrays.toString(array[row]).replaceAll("\\[],",""));
        }
    }
}
