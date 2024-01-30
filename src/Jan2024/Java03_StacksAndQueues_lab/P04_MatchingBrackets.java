package Jan2024.Java03_StacksAndQueues_lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04_MatchingBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String expression = scanner.nextLine();
        for (int i=0; i<expression.length();i++){
            char current = expression.charAt(i);

            if ('('==current){
                stack.push(i);
            } else if (')'==current) {
                int startIndex =stack.pop();
                String match = expression.substring(startIndex,i+1);
                System.out.println(match);
            }
        }


    }
}
