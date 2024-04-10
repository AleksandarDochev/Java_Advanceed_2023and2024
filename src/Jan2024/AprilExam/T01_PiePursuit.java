package Jan2024.AprilExam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class T01_PiePursuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read contestantsCount' capacities
        //using the maps
        int[] contestantsCount = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Read the piesAll
        // проверка
        int[] piesAll = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Use Deque to manage contestantsCount
        //дек тестинг
        Deque<Integer> contestantQueue = new ArrayDeque<>();
        for (int contestant : contestantsCount) {
            contestantQueue.offer(contestant);
        }

        // Use Deque to manage
        //използваме дека
        Deque<Integer> pieStack1 = new ArrayDeque<>();
        for (int i = piesAll.length - 1; i >= 0; i--) {
            pieStack1.push(piesAll[i]);
        }

        while (!contestantQueue.isEmpty() && !pieStack1.isEmpty()) {
            int currentContestant = contestantQueue.poll(); // First contestant
            int pieUsedNow = pieStack1.pop(); // Last pie



            if (currentContestant >= pieUsedNow) {
                currentContestant -= pieUsedNow;
                if (currentContestant > 0) {
                    contestantQueue.offer(currentContestant); // Move to end of queue
                }
            } else {
                pieUsedNow -= currentContestant;
                if (pieUsedNow > 0) {
                    pieStack1.push(pieUsedNow); // Remain in stack
                }

                // Handle leftover pieces if last pie in stack
                if (pieStack1.isEmpty() && pieUsedNow == 1) {
                    pieStack1.push(1);
                }
            }
        }

        if (contestantQueue.isEmpty() && pieStack1.isEmpty()) {
            System.out.println("We have a champion!");
        } else if (contestantQueue.isEmpty()) {
            System.out.println("Our contestantsCount need to rest!");
            System.out.print("Pies left: ");
            while (!pieStack1.isEmpty()) {
                System.out.print(pieStack1.pop());
                if (!pieStack1.isEmpty()) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else { // Pies are over, contestantsCount left
            System.out.println("We will have to wait for more piesAll to be baked!");
            System.out.print("Contestants left: ");
            while (!contestantQueue.isEmpty()) {
                System.out.print(contestantQueue.poll());
                if (!contestantQueue.isEmpty()) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
