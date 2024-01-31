package Jan2024.Java03_StacksAndQueues_exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input545 = scanner.nextLine();
        List<String> inputList = Arrays.stream(input545.split(" ")).collect(Collectors.toList());
        if (isBalanced(inputList)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    private static boolean isBalanced(List<String>inputList){
        Deque<String> openParenthesesStack = new ArrayDeque<>();
        for (String brace : inputList){
            switch (brace){

                case "}":
                    if (openParenthesesStack.isEmpty()){
                        return false;
                    }
                    String openBrace = openParenthesesStack.pop();
                    if (!openBrace.equals("{")){
                        return false;
                    }
                    break;
                case "]":
                    if (openParenthesesStack.isEmpty()){
                        return false;
                    }
                    openBrace=openParenthesesStack.pop();
                    if (!openBrace.equals("[")){
                        return false;
                    }
                    break;
                case ")":
                    if (openParenthesesStack.isEmpty()){
                        return false;
                    }
                    openBrace=openParenthesesStack.pop();
                    if (!openBrace.equals("(")){
                        return false;
                    }
                    break;
                default:
                    openParenthesesStack.push(brace);
                    break;
            }

        }
        return openParenthesesStack.isEmpty();

    }
}
