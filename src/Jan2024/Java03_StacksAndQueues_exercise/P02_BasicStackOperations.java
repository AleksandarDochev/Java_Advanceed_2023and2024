package Jan2024.Java03_StacksAndQueues_exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String conditions = scanner.nextLine();
        String numbers = scanner.nextLine();
        List<Integer> conditonsList = Arrays
                .stream(conditions.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> numbersListInteger1 = Arrays
                .stream(numbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < conditonsList.get(0); i++) {
            stack.push(numbersListInteger1.get(i));
        }
        for (int i = 0; i < conditonsList.get(1); i++) {
            stack.pop();
        }
        if (stack.contains(conditonsList.get(2))){
            System.out.println("true");
        }else if (stack.isEmpty()) {
            System.out.println("0");
        }else if (!stack.contains(conditonsList.get(2))) {
           int samllestnum =stack.peek();
            for (int currentnum:stack) {
                if (currentnum<samllestnum){
                    samllestnum=currentnum;
                }
            }
            System.out.println(samllestnum);
        }

    }
}
