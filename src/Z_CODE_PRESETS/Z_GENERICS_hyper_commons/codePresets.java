package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

import java.util.Arrays;
import java.util.Scanner;

public class codePresets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //----take data from a specific spot from an input line or string and parse into string--------
        String command =scanner.nextLine();
        String command1 = "swap 2 4";
        int index1 = Integer.parseInt(command1.split(" ")[1]);
        int index2 = Integer.parseInt(command1.split(" ")[2]);
        System.out.println(index2+" "+index1);
        //----take data from a specific spot from an input line or string and parse into string--------

        //--- split data from input sting to samll bits in a array
        String inputString = "Sam John Sara";
        String[] children = inputString.split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());

        //


        //---Console input scanners---------
        int xx = Integer.parseInt(scanner.nextLine());
        String xxx = scanner.nextLine();
        double x = Double.parseDouble(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);

        //---Console input scanners---------

        //---------------Numerical print out manipulations ---------------------------
        int meters = Integer.parseInt(scanner.nextLine());
        double km = meters / 1000.0;
        System.out.printf("%.2f",km); //moves dot from end to begging with 2 spots, example 100 to 1.00
        //---------------Numerical print out manipulations ---------------------------
        /////////
        int [] arrayXX = Arrays.stream(scanner.nextLine()        //This is a massive that READS DATA from console and takes line given "24 50 36 70" and reads the elements
                     .split(" "))                          // We parse the data from xxxx with one space intervals and put in a massive with these individual elements  ["24", "50", "36", "70"]
                     .mapToInt(Integer::parseInt)                //With this we take all the elemnts in ["24", "50", "36", "70"] and we convert them into normal integers [24, 50, 36, 70]
                                                                 //"mapToInt" reads every element of the massive and aplyes what;s in the "()" after it
                                                                 //"::"From the Class "Integer" we call the method "parseInt" and apply it to the read elements from "mapToInt"
                     .toArray();                                 //With this we create the massive with Whole numbers "цели числа"
                                                                 //this takes the 'processed' code from the previous lines and puts it back  in massive with integer elements this time
        //////////
        //
        int [] arrayXXX = new int[10];  //This an empty massive that we will fill with data later and it will have 10 elements
        arrayXXX [0] = 10; //Here in the 'arrayXXX' on position '0' we put the data '10'
        //


        //--------------------Basic line scanner for continuous reading from console and adding to int ----------------
//        int sum = 0;
//        while (true){
//            int num = Integer.parseInt(scanner.nextLine());
//            sum = sum + num;
//        }
        //--------------------Basic line scanner for continuous reading from console and adding to int ----------------
//--------------------DIVISIONS----------------------------------
        System.out.println(10 / 4); // 2 (integral division)
        System.out.println(10 / 4.0); // 2.5 (real division)
        System.out.println(10 / 0.0); // Infinity
        System.out.println(-10 / 0.0); // -Infinity
        System.out.println(0 / 0.0); // NaN (not a number)
        System.out.println(8 % 2.5); // 0.5 (3 * 2.5 + 0.5 = 8)
        System.out.println(10 / 0); // ArithmeticException*/
//--------------------DIVISIONS----------------------------------
    }
}
