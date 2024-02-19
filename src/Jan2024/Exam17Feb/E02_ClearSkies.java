package Jan2024.Exam17Feb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E02_ClearSkies {

    public static String clearSkiesMainMethod() {
        var input1 = "5\n" +
                "-R---\n" +
                "-J--E\n" +
                "-E---\n" +
                "--E-E\n" +
                "-R---\n" +
                "up\n" +
                "down\n" +
                "down\n" +
                "down\n" +
                "right\n" +
                "right\n" +
                "right\n";

        Scanner scanner = new Scanner(input1); // Use input1 as input

        List<String> output = new ArrayList<>();

        // Read the size of the matrix (airspace)
        int n = Integer.parseInt(scanner.nextLine());

        // Read the matrix
        char[][] airspace = new char[n][n];
        int jetfighterRow = -1, jetfighterCol = -1;
        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                airspace[i][j] = row.charAt(j);
                if (airspace[i][j] == 'J') {
                    jetfighterRow = i;
                    jetfighterCol = j;
                }
            }
        }

        int armor = 300; // Jetfighter's initial armor

        // Read and execute direction commands
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.equals("up")) {
                jetfighterRow--;
            } else if (command.equals("down")) {
                jetfighterRow++;
            } else if (command.equals("left")) {
                jetfighterCol--;
            } else if (command.equals("right")) {
                jetfighterCol++;
            }

            // Check if the new position is within the airspace
            if (jetfighterRow < 0 || jetfighterRow >= n || jetfighterCol < 0 || jetfighterCol >= n) {
                break;
            }

            // Check the condition of the new position
            char newPosition = airspace[jetfighterRow][jetfighterCol];
            if (newPosition == 'E') {
                armor -= 100;
                if (armor <= 0) {
                    output.add(String.format("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!", jetfighterRow, jetfighterCol));
                    airspace[jetfighterRow][jetfighterCol] = '-';
                    break;
                }
                airspace[jetfighterRow][jetfighterCol] = 'J';
            } else if (newPosition == 'R') {
                armor = 300;
                airspace[jetfighterRow][jetfighterCol] = '-';
            } else if (newPosition == '-') {
                // Move to the new position
                airspace[jetfighterRow][jetfighterCol] = 'J';
            }
        }

        // Add the final state of the airspace to the output list
        StringBuilder finalState = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                finalState.append(airspace[i][j]);
            }
            output.add(finalState.toString());
            finalState.setLength(0); // Clear the StringBuilder for the next row
        }

        // Build the output string
        StringBuilder outputString = new StringBuilder();
        for (String line : output) {
            outputString.append(line).append("\n");
        }

        return outputString.toString().trim(); // Trim to remove trailing newline
    }


    @Test
    public void testEquality() {
        var output2 = "Mission failed, your jetfighter was shot down! Last coordinates [3, 4]!\n" +
                "-----\n" +
                "----E\n" +
                "-----\n" +
                "----J\n" +
                "-R---";

        assertEquals(output2, clearSkiesMainMethod());
    }
    @Test
    public void testEquality1() {
        var output2 = "Mission failed, your jetfighter was shot down! Last coordinates [3, 4]!\n" +
                "-----\n" +
                "----E\n" +
                "-----\n" +
                "----J\n" +
                "-R---";

        String actualOutput = clearSkiesMainMethod();

        System.out.println("Expected Output:");
        System.out.println(output2);
        System.out.println("Actual Output:");
        System.out.println(actualOutput);

        assertEquals(output2, actualOutput);
    }
    @Test
    public void testEquality2() {
        var output2 = "Mission failed, your jetfighter was shot down! Last coordinates [3, 4]!\n" +
                "-----\n" +
                "----E\n" +
                "-----\n" +
                "----J\n" +
                "-R---";

        String actualOutput = clearSkiesMainMethod();

        assertEquals(output2, actualOutput);
    }

}
