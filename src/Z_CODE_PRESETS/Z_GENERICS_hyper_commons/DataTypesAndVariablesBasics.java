package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

import java.util.Scanner;

public class DataTypesAndVariablesBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //byte age = Byte.parseByte(scanner.nextLine());

        System.out.println("Byte min "+Byte.MIN_VALUE);
        System.out.println("Byte max "+Byte.MAX_VALUE);
        System.out.println("Short min "+Short.MIN_VALUE);
        System.out.println("Short max "+Short.MAX_VALUE);
        System.out.println("Integer min "+Integer.MIN_VALUE);
        System.out.println("Integer max "+Integer.MAX_VALUE);
        System.out.println("Long min "+Long.MIN_VALUE);
        System.out.println("Long max "+Long.MAX_VALUE);
    }
}
