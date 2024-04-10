package Jan2024.AprilExam;

import java.util.Scanner;

public class T02_EscapeTheMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the maze
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Read the maze layout
        char[][] maze = new char[n][n];
        int playerRow = -1, playerCol = -1;

        // Populate the maze and find the initial player position
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                maze[i][j] = line.charAt(j);
                if (maze[i][j] == 'P') {
                    playerRow = i;
                    playerCol = j;
                }
            }
        }

        int health = 100; // Initial health

        // Process commands until exit or death
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();

            int newRow = playerRow;
            int newCol = playerCol;

            // Calculate new position based on the command
            switch (command) {
                case "up":
                    newRow = playerRow - 1;
                    break;
                case "down":
                    newRow = playerRow + 1;
                    break;
                case "right":
                    newCol = playerCol + 1;
                    break;
                case "left":
                    newCol = playerCol - 1;
                    break;
                default:
                    continue; // Skip invalid commands
            }

            // Check if the new position is within the maze boundaries
            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {
                char nextCell = maze[newRow][newCol];

                if (nextCell == 'M') {
                    // Encounter with monster, reduce health by 40
                    health -= 40;
                    if (health <= 0) {
                        health = 0;
                        break; // Player is defeated
                    }else {
                        // Remove monster from the maze
                        maze[newRow][newCol] = '-';
                        maze[playerRow][playerCol] = 'P'; // Set new position for player
                    }
                } else if (nextCell == 'H') {
                    // Encounter with health potion, increase health by 15
                    health += 15;
                    if (health > 100) {
                        health = 100; // Cap health to 100
                    }
                    // Remove health potion from the maze
                    maze[newRow][newCol] = '-';
                } else if (nextCell == 'X') {
                    // Reached the exit, end game successfully
                    maze[playerRow][playerCol] = '-'; // Clear current position
                    playerRow = newRow;
                    playerCol = newCol;
                    maze[playerRow][playerCol] = 'P'; // Set new position for player
                    break;
                }

                // Move the player to the new position
                maze[playerRow][playerCol] = '-'; // Clear current position
                playerRow = newRow;
                playerCol = newCol;
                maze[playerRow][playerCol] = 'P'; // Set new position for player
            }
        }

        // Output the result based on the final player state
        if (health <= 0) {
            System.out.println("Player is dead. Maze over!");
        } else {
            System.out.println("Player escaped the maze. Danger passed!");
        }
        System.out.println("Player's health: " + health + " units");

        // Print the final state of the maze
        for (char[] row : maze) {
            System.out.println(new String(row));
        }
    }
}
