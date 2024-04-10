package Jan2024.AprilExam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class T01_PiePursuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read contestants' capacities
        int[] contestants = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Read pies' sizes
        int[] pies = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Use Deque to manage contestants (Queue for FIFO)
        Deque<Integer> contestantQueue = new ArrayDeque<>();
        for (int contestant : contestants) {
            contestantQueue.offer(contestant);
        }

        // Use Deque to manage pies (Stack for LIFO)
        Deque<Integer> pieStack = new ArrayDeque<>();
        for (int i = pies.length - 1; i >= 0; i--) {
            pieStack.push(pies[i]);
        }

        while (!contestantQueue.isEmpty() && !pieStack.isEmpty()) {
            int currentContestant = contestantQueue.poll(); // First contestant
            int currentPie = pieStack.pop(); // Last pie

            if (currentContestant >= currentPie) {
                currentContestant -= currentPie;
                if (currentContestant > 0) {
                    contestantQueue.offer(currentContestant); // Move to end of queue
                }
            } else {
                currentPie -= currentContestant;
                if (currentPie > 0) {
                    pieStack.push(currentPie); // Remain in stack
                }

                // Handle leftover pieces if last pie in stack
                if (pieStack.isEmpty() && currentPie == 1) {
                    pieStack.push(1);
                }
            }
        }

        if (contestantQueue.isEmpty() && pieStack.isEmpty()) {
            System.out.println("We have a champion!");
        } else if (contestantQueue.isEmpty()) {
            System.out.println("Our contestants need to rest!");
            System.out.print("Pies left: ");
            while (!pieStack.isEmpty()) {
                System.out.print(pieStack.pop());
                if (!pieStack.isEmpty()) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else { // Pies are over, contestants left
            System.out.println("We will have to wait for more pies to be baked!");
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
