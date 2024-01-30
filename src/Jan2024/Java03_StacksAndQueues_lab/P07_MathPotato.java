package Jan2024.Java03_StacksAndQueues_lab;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P07_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());
        PriorityQueue<String> queue = new PriorityQueue<>();
        boolean isPrime;
        for (String child : children)
            queue.offer(child);
        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++)
                queue.offer(queue.poll());
            //if (isPrime(cycle))
                System.out.println("Prime " + queue.peek());
            //else
                System.out.println("Removed " + queue.poll());
            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }

    }
