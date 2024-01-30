package Jan2024.Java03_StacksAndQueues_exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01ReverseNumberswithaStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String xxx = scanner.nextLine();
        String[] numbers = xxx.split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numbers.length; i++) {
            stack.push(Integer.valueOf(numbers[i]));
        }
        while (!stack.isEmpty()){
            int currentnum = stack.pop();
            System.out.printf("%d ",currentnum);
        }

    }
}
