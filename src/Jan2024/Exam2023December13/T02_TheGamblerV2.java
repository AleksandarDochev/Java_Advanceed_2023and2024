package Jan2024.Exam2023December13;

import java.util.Scanner;

public class T02_TheGamblerV2 {
    private static int sum = 100;
    private static boolean jackpot = false;
    private static boolean end = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] board = new char[size][size];

        fillBoard(scanner, size, board);

        int[] currentPosition = findStartPosition(size, board);

        while (true) {
            if (jackpot) {
                System.out.println("You win the Jackpot!");
                break;
            }
            if (end) {
                break;
            }
            String command = scanner.nextLine();

            assert currentPosition != null;
            moveGambler(command, currentPosition, board);

            if (isOutOfBounds(currentPosition, size) || zeroAmount()) {
                gameOver();
                break;
            } else {
                handleCurrentPosition(currentPosition, board);
            }
            if (command.equals("end")) {
                break;
            }
        }

        if (!end) {
            System.out.printf("End of the game. Total amount: %d$\n", sum);
            for (char[] chars : board) {
                System.out.println(chars);
            }
        }
    }
    private static void handleCurrentPosition(int[] position, char[][] board) {
        char currentChar = board[position[0]][position[1]];

        switch (currentChar) {
            case 'J':
                sum += 100000;
                jackpot = true;
                break;
            case 'W':
                sum += 100;
                break;
            case 'P':
                sum -= 200;
                break;
        }
        board[position[0]][position[1]] = 'G';
    }
    private static boolean zeroAmount() {
        return sum <= 0;
    }
    private static void gameOver() {
        end = true;
        System.out.println("Game over! You lost everything!");
    }
    private static void moveGambler(String command, int[] position, char[][] board) {
        int row = position[0];
        int col = position[1];
        board[row][col] = '-';
        switch (command) {
            case "up":
                position[0]--;
                break;
            case "down":
                position[0]++;
                break;
            case "left":
                position[1]--;
                break;
            case "right":
                position[1]++;
                break;
        }
    }
    private static boolean isOutOfBounds(int[] position, int size) {
        for (int i = 0; i < 2; i++) {
            if (position[i] < 0 || position[i] >= size) {
                return true;
            }
        }
        return false;
    }
    private static int[] findStartPosition(int size, char[][] fishingArea) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (fishingArea[i][j] == 'G') {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    private static void fillBoard(Scanner scanner, int size, char[][] board) {
        for (int i = 0; i < size; i++) {
            board[i] = scanner.nextLine().toCharArray();
        }
    }
}
