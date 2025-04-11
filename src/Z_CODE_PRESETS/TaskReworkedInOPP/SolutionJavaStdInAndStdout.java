package Z_CODE_PRESETS.TaskReworkedInOPP;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SolutionJavaStdInAndStdout {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        takeInputFunction(scanner);
    }

    private static void takeInputFunction(Scanner scanner) {
        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> stringList = new ArrayList<>();
        List<String> integerList = new ArrayList<>();

        for (String item : inputList) {
            try {
                // The reason why a try-catch is used here is that if the item is not parsable as an int we will get a java error
                // and if we get an error we cannot use an if-else—the error event itself acts as an event that it triggers
                // the execution of the catch block (of code)
                int number = Integer.parseInt(item);
                integerList.add(String.valueOf(number));
            } catch (NumberFormatException e) {
                // e.printStackTrace(); // This print the error that we actually get if we need it only, try to turn it on and off in case u want to see
                stringList.add(item);
            } catch (Exception e2) {
                e2.printStackTrace();
                // The Exception here in the catch is super generic and generally should only be used
                // if we don't know what exception we are going to get. Here we use the NumberFormatException because we
                // know exactly what error we are going to generate in this case
            }
        }

        System.out.println(inputList);
        System.out.println("myString is: " + String.join(" ", stringList));
        System.out.println("myInt is: " + String.join(" ", integerList));
    }
}
