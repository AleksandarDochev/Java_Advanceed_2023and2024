package Z_CODE_PRESETS.TaskReworkedInOPP;

import java.util.*;

public class Solution_OOP_JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);
    public static int newIntFromVoidMethodResult = 0;

    public static void main(String[] args) {
        int inputInt = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Original int: " + inputInt);
        integerAddReturnMethod(inputInt); // Call method and give it console value
        System.out.println("Result from Return method +1 to original: " + integerAddReturnMethod(inputInt));

        integerAdd2VoidMethod(inputInt);
        System.out.println("Result from void method2 +2 to original: " + newIntFromVoidMethodResult);
        scanner.close();
    }
    private static List<Integer> integerAddReturnMethod(Integer integerForThisFunction) {
        List<Integer> intList = new ArrayList<>();
        integerForThisFunction++;
        intList.add(integerForThisFunction);
        return intList;
    }
    private static void integerAdd2VoidMethod(Integer integerForThisFunction) {
        List<Integer> intList = new ArrayList<>();
        integerForThisFunction = integerForThisFunction + 2;
        intList.add(integerForThisFunction);
        newIntFromVoidMethodResult = integerForThisFunction;
    }
}
