package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

import java.util.Scanner;

public class multiDimensionalArrays {
    public static void main(String[] args) {

        // noraml arra from fundamentas module
        int[] arr = new int[10];
        arr[0]=5;
        System.out.println(arr[0]);
        System.out.println(arr.length);
        // noraml arra from fundamentas module

        //filling a multiDimensional array -------
        int[][] multiArr = new int[3][]; //these are the rows in the tables
        multiArr[0] = new int[10];    // these are how many elements per row
        multiArr[1] = new int[5];     // we have 3 because we already said 3 rows
        multiArr[2] = new int[2];
        //how it looks
        //0=0,0,0,0,0,0,0,0,0,0
        //1=0,0,0,0,0
        //2=0,0

        // accessing data/values in a multiDimesninal array
        multiArr[0][0] = 5;//we give 5 to row 0 index 0
        multiArr[0][1] = 2;//we give 2 to row 0 index 1
        //how it looks
        //0=5,2,0,0,0,0,0,0,0,0
        //1=0,0,0,0,0
        //2=0,0

        //create a massive with data in it fast
        int[] arrr = {1,2,3,4,5};  //same as int[] arr = new int[5];and then adding them 1 by one
        int[][] multiArr1 = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10}
        };  // same as int[][] multiArr = new int[3][]; and give all rows a lenght and values
        //get specific value from miltiArr
        System.out.println(multiArr1[1][2]);//we get the 6 from row 1 index 3 +1 cuy it starts from 0

        //Examples
        int[][] multiArr123 = new int[100][];
        for (int i = 0; i < multiArr123.length; i++) {
            multiArr123[i] = new int[i++];//we put on each row an incresing amout of elemets

        }

        //reading a matrix
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0; column < cols; column++) {
                matrix[row][column] =
                        Integer.parseInt(inputTokens[column]);
            }
        }








        System.out.println(multiArr123);
    }
}
