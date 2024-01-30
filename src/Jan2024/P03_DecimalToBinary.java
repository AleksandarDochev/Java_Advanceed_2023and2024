package Jan2024;

import java.util.Scanner;

public class P03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(Integer.toBinaryString(num));
    }
}
