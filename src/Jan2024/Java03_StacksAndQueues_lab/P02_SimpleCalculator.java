package Jan2024.Java03_StacksAndQueues_lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02_SimpleCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String expression =scanner.nextLine();
        String[] tokens = expression.split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i = tokens.length-1;i >= 0;i--){
            String token = tokens[i];
            stack.push(token);
        }
        while (stack.size()>1){
            int firstNum = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());
            switch (op){
                case "+":
                    stack.push(String.valueOf(firstNum+secondNum));
                    break;
                case "-":
                    stack.push(String.valueOf(firstNum-secondNum));
                    break;
            }
        }
        System.out.println(stack.pop());

    }
}
