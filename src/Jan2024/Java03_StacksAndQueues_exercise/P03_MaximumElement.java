package Jan2024.Java03_StacksAndQueues_exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String command;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            command=scanner.nextLine();
            List<Integer> numbersListInteger1 = Arrays
                    .stream(command.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            if (numbersListInteger1.get(0)==1){
                stack.push(numbersListInteger1.get(1));
            } else if (numbersListInteger1.get(0)==2) {
                stack.pop();
            } else if (numbersListInteger1.get(0)==3) {
                int currentTopNum = stack.getLast();
                for (int e:stack) {
                    if (e>currentTopNum){
                        currentTopNum = e;
                    }
                }
                System.out.println(currentTopNum);
            }

        }
    }
}
