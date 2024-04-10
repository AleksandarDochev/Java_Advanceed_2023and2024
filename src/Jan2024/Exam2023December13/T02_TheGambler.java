package Jan2024.Exam2023December13;

import java.util.Arrays;
import java.util.Scanner;

public class T02_TheGambler {
    private static int initialGambling = 100;
    private static boolean jackpot = false;
    private static boolean end = false;
    public static void main(String[] args) {

        //read matrix dimension
        Scanner scanner = new Scanner(System.in);
        //create matrix with dimension
        int [] matrixDimensions = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
                        .split(" "))                     //["1","4","3","2"]
                .mapToInt(Integer::parseInt)           //[1,4,3,2]
                .toArray();
        String[][] matrix = new String[matrixDimensions[0]][matrixDimensions[0]];

        //Gambler stats

        int[] gamblerOldPosition  = new int[2];
        int[] gamblerCurrentPosition  = new int[2];

        //fill each row of matrix
        for (int row = 0; row < matrixDimensions[0]; row++) {
            String[] inputRows = scanner.nextLine().split("");
            for (int col = 0; col < matrixDimensions[0]; col++) {
                matrix[row][col] = inputRows[col];
                if (inputRows[col].equals("G")){
                    gamblerCurrentPosition[0] = row; //gambler row is on 0
                    gamblerCurrentPosition[1] = col; //gambler colmn is on 1
                }
            }
        }



        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.equals("down")){
                //we update old position ,replace with -
                gamblerOldPosition[0]=gamblerCurrentPosition[0];
                gamblerOldPosition[1]=gamblerCurrentPosition[1];
                matrix[gamblerOldPosition[0]][gamblerOldPosition[1]]="-";
                //we go down one row
                gamblerCurrentPosition[0]++;
                gamblerPNL(matrix,gamblerCurrentPosition);
                //•	If the gambler leaves the boundaries of the board END
                if (gamblerCurrentPosition[0]>matrixDimensions[0]||gamblerCurrentPosition[1]>matrixDimensions[0]){
                    gameOver();
                }else {
                    matrix[gamblerCurrentPosition[0]][gamblerCurrentPosition[1]]="G";
                }

            } else if (command.equals("right")) {
                //we update old position ,replace with -
                gamblerOldPosition[0]=gamblerCurrentPosition[0];
                gamblerOldPosition[1]=gamblerCurrentPosition[1];
                matrix[gamblerOldPosition[0]][gamblerOldPosition[1]]="-";
                //we go right one row
                gamblerCurrentPosition[1]++;
                gamblerPNL(matrix,gamblerCurrentPosition);
                //•	If the gambler leaves the boundaries of the board END
                if (gamblerCurrentPosition[0]>matrixDimensions[0]||gamblerCurrentPosition[1]>matrixDimensions[0]){
                    gameOver();
                }else {
                    matrix[gamblerCurrentPosition[0]][gamblerCurrentPosition[1]]="G";
                }

            } else if (command.equals("left")) {
                //we update old position ,replace with -
                gamblerOldPosition[0]=gamblerCurrentPosition[0];
                gamblerOldPosition[1]=gamblerCurrentPosition[1];
                matrix[gamblerOldPosition[0]][gamblerOldPosition[1]]="-";
                //we go left one row
                gamblerCurrentPosition[1]--;
                gamblerPNL(matrix,gamblerCurrentPosition);
                //•	If the gambler leaves the boundaries of the board END
                if (gamblerCurrentPosition[0]>matrixDimensions[0]||gamblerCurrentPosition[1]>matrixDimensions[0]){
                    gameOver();
                }else {
                    matrix[gamblerCurrentPosition[0]][gamblerCurrentPosition[1]]="G";
                }

            } else if (command.equals("up")) {
                //we update old position ,replace with -
                gamblerOldPosition[0]=gamblerCurrentPosition[0];
                gamblerOldPosition[1]=gamblerCurrentPosition[1];
                matrix[gamblerOldPosition[0]][gamblerOldPosition[1]]="-";
                //we go up one row
                gamblerCurrentPosition[0]--;
                gamblerPNL(matrix,gamblerCurrentPosition);
                //•	If the gambler leaves the boundaries of the board END
                if (gamblerCurrentPosition[0]>matrixDimensions[0]||gamblerCurrentPosition[1]>matrixDimensions[0]){
                    gameOver();
                }else {
                    matrix[gamblerCurrentPosition[0]][gamblerCurrentPosition[1]]="G";
                }

            }
            command = scanner.nextLine();
        }
        if (jackpot=true){
            System.out.println("You win the Jackpot!");
        }
        System.out.printf("End of the game. Total amount: %d$\n",initialGambling);
        printMultiDimArrayV1forStrings(matrix);


    }
    private static void gameOver(){
        end=true;
        System.out.println("Game over! You lost everything!");
        System.exit(0);
    }
    private static void gamblerPNL(String[][] matrix, int[] gamblerCurrentPosition){
        String currentElement = matrix[gamblerCurrentPosition[0]][gamblerCurrentPosition[1]];
        if (currentElement.equals("-")){
        } else if (currentElement.equals("W")) {
            initialGambling=initialGambling+100;
        } else if (currentElement.equals("P")) {
            initialGambling=initialGambling-200;
            //•	If the gambler money is lower than 0 END
            if (initialGambling<0){
                gameOver();
            }
        }else if (currentElement.equals("J")) {
            initialGambling=initialGambling+100000;
            jackpot=true;
        }else {
            matrix[gamblerCurrentPosition[0]][gamblerCurrentPosition[1]]="G";
        }

    }
    public static void printMultiDimArrayV1forStrings(String[][] array){
        for (int row = 0; row < array.length; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < array[row].length; col++) {
                sb.append(array[row][col])
                        .append("");
            }
            System.out.println(sb.toString().trim());
        }
    }

}
