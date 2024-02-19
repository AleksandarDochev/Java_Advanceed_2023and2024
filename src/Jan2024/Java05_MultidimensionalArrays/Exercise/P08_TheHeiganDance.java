package Jan2024.Java05_MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P08_TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double damageToHeigan = Double.parseDouble(scanner.nextLine());
        double playerHP = 18500;
        double heiganHP = 3_000_000;
        int playerRow = 7;
        int playerCol = 7;

        boolean isCloudActive = false;
        boolean isPlayerDead = false;

        while (playerHP > 0 && heiganHP > 0) {
            if (isCloudActive) {
                playerHP -= 3500;
                if (playerHP <= 0) {
                    isPlayerDead = true;
                    break;
                }
            }

            heiganHP -= damageToHeigan;

            String[] spellInput = scanner.nextLine().split("\\s+");
            String spell = spellInput[0];
            int spellRow = Integer.parseInt(spellInput[1]);
            int spellCol = Integer.parseInt(spellInput[2]);

            if (isInDamageZone(playerRow, playerCol, spellRow, spellCol)) {
                // Try to move up, right, down, and left
                if (!isInDamageZone(playerRow - 1, playerCol, spellRow, spellCol) && playerRow - 1 >= 0) {
                    playerRow--;
                } else if (!isInDamageZone(playerRow, playerCol + 1, spellRow, spellCol) && playerCol + 1 < 15) {
                    playerCol++;
                } else if (!isInDamageZone(playerRow + 1, playerCol, spellRow, spellCol) && playerRow + 1 < 15) {
                    playerRow++;
                } else if (!isInDamageZone(playerRow, playerCol - 1, spellRow, spellCol) && playerCol - 1 >= 0) {
                    playerCol--;
                } else {
                    if (spell.equals("Cloud")) {
                        playerHP -= 3500;
                        isCloudActive = true;
                        if (playerHP <= 0) {
                            isPlayerDead = true;
                        }
                    } else if (spell.equals("Eruption")) {
                        playerHP -= 6000;
                        if (playerHP <= 0) {
                            isPlayerDead = true;
                        }
                    }
                }
            }

            if (isPlayerDead) {
                break;
            }
        }

        // Print results
        if (heiganHP <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", heiganHP);
        }

        if (isPlayerDead) {
            if (isCloudActive) {
                System.out.println("Player: Killed by Plague Cloud");
            } else {
                System.out.println("Player: Killed by Eruption");
            }
        } else {
            System.out.printf("Player: %.2f%n", playerHP);
        }

        System.out.printf("Final position: %d, %d%n", playerRow, playerCol);

        scanner.close();
    }

    private static boolean isInDamageZone(int playerRow, int playerCol, int spellRow, int spellCol) {
        for (int i = spellRow - 1; i <= spellRow + 1; i++) {
            for (int j = spellCol - 1; j <= spellCol + 1; j++) {
                if (i == playerRow && j == playerCol) {
                    return true;
                }
            }
        }
        return false;
    }
}
