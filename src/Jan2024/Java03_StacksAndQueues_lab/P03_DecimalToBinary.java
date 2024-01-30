package Jan2024.Java03_StacksAndQueues_lab;

import java.util.Scanner;

public class P03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(Integer.toBinaryString(num));
    }
}
