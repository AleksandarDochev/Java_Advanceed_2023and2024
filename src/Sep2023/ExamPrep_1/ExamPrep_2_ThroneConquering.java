package Sep2023.ExamPrep_1;

import java.util.Scanner;

public class ExamPrep_2_ThroneConquering {

    private static String TEST_INPUTS = "------b-\n" +
                                        "--------\n" +
                                        "--------\n" +
                                        "--------\n" +
                                        "--------\n" +
                                        "-w------\n" +
                                        "--------\n" +
                                        "--------\n";

    public static void main(String[] args) {

        var input = new Scanner(TEST_INPUTS);
        char[][] board = inputToBoard(input);
    }
    private static char[][] inputToBoard(Scanner input){
        char[][] board = new char[8][8];
        return board;
    }


}
