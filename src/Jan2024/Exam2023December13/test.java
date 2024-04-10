package Jan2024.Exam2023December13;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the matrix
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Read the board
        char[][] board = new char[n][n];
        int gamblerRow = -1, gamblerCol = -1;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'G') {
                    gamblerRow = i;
                    gamblerCol = j;
                }
            }
        }

        int totalAmount = 100; // Initial amount

        // Directions mapping
        int[][] directions = {
                {-1, 0}, // up
                {1, 0},  // down
                {0, -1}, // left
                {0, 1}   // right
        };

        // Game loop
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine().trim();

            if (command.equals("end")) {
                break;
            }

            int[] direction = null;

            switch (command) {
                case "up":
                    direction = directions[0];
                    break;
                case "down":
                    direction = directions[1];
                    break;
                case "left":
                    direction = directions[2];
                    break;
                case "right":
                    direction = directions[3];
                    break;
                default:
                    System.out.println("Invalid command. Please enter 'up', 'down', 'left', 'right', or 'end'.");
                    continue;
            }

            // Calculate new position based on the direction command
            int newGamblerRow = gamblerRow + direction[0];
            int newGamblerCol = gamblerCol + direction[1];

            // Check if new position is within bounds
            if (newGamblerRow < 0 || newGamblerRow >= n || newGamblerCol < 0 || newGamblerCol >= n) {
                System.out.println("Game over! You lost everything!");
                return;
            }

            // Clear current position
            board[gamblerRow][gamblerCol] = '-';

            // Update gambler's position
            gamblerRow = newGamblerRow;
            gamblerCol = newGamblerCol;

            char currentCell = board[gamblerRow][gamblerCol];

            if (currentCell == 'W') {
                totalAmount += 100;
            } else if (currentCell == 'P') {
                totalAmount -= 200;
                if (totalAmount <= 0) {
                    System.out.println("Game over! You lost everything!");
                    return;
                }
            } else if (currentCell == 'J') {
                totalAmount += 100000;
                System.out.println("You win the Jackpot!\nEnd of the game. Total amount: " + totalAmount+"$");
                printBoard(board);
                return;
            }

            // Update board with new gambler position
            board[gamblerRow][gamblerCol] = 'G';
        }

        // End of the game without winning the jackpot
        System.out.println("End of the game. Total amount: " + totalAmount+"$");
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(new String(row));
        }
    }
}
