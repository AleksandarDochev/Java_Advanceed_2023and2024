package Jan2024.Java03_StacksAndQueues_lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line =scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!"print".equals(line)){

            if ("cancel".equals(line)){
                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled " + queue.poll());
                }
            }else {
                queue.offer(line);
            }
           line =scanner.nextLine();
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
