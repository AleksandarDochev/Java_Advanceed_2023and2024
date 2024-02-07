package Jan2024.Java05_MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P02_MatrixOfPalindromes {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);


        String[] stringArr = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(stringArr[0]);
        int cols = Integer.parseInt(stringArr[1]);
        if (rows+cols<=27){
            //                        rows       cols
            String[][] matrix = new String[rows][cols];
            arrayMethod(matrix);

        }

    }
    private static void arrayMethod(String [][] arrayWithChars){
        int rowcount = arrayWithChars.length;
        int colcount = arrayWithChars[0].length;
        for (int row = 0; row <rowcount ; row++) {
            char firstLetter=(char)('a'+row);
            char thirdLetter=(char)('a'+row);
            for (int col = 0; col < colcount; col++) {

                char middleLetter=(char)(firstLetter+col);

                StringBuilder sb = new StringBuilder();
                sb.append(firstLetter);
                sb.append(middleLetter);
                sb.append(thirdLetter);
                String result =sb.toString();
                arrayWithChars[row][col] = result;
            }
        }
        printMultiDimArrayV1forStrings(arrayWithChars);
    }
    public static void printMultiDimArrayV1forStrings(String[][] array){
        for (int row = 0; row < array.length; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < array[row].length; col++) {
                sb.append(array[row][col])
                        .append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
