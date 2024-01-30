package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

import java.util.Arrays;
import java.util.Scanner;

public class arraysPresets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //--------Create empty Array , create dynamic length array----------
        int [] array567 = new int[]{};
        int [] array5690 = new int[]{56,567,57};
        System.out.println(array5690.length); // 3
        //--------Create empty Array , create dynamic length array----------

        // ---------------- Massive / ARRaYS  clean print outs --------------------
        String[] numbersArr463 = {"51","47","32","61","21"};
        int[] numbersArr400 = {1,2,3,4,5};
        for (String element : numbersArr463){
            System.out.print(element + " ");  //This prints out massives by each element
        }

        System.out.print(String.join(" ",numbersArr463));//This only work for String printouts clean
        System.out.println(Arrays.toString(numbersArr400).replace("[","").replace("]",""));//Take ing arrays and print it out clean
        // ---------------- Massive / ARRaYS clean print outs --------------------

        //------------ConversionToWholeNumbers----------------------------------------
        int [] numbersArr78686 = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
                        .split(" "))                     //["1","4","3","2"]
                        .mapToInt(Integer::parseInt)           //[1,4,3,2]
                        .toArray();
        //-------------ConversionToWholeNumbers-------------------------------------


        //------------------- POPULATE integer and print out integer array --------------------------
        int iterations = Integer.parseInt(scanner.nextLine());
        String[] wordsArr = scanner.nextLine().split(" ");//we take the input of the console and put it in a massive
        int[] numbersArr90= new int[iterations]; //array new int[iterations] here is the amount of elements
        int sum =0;
        for (int i = 0; i < numbersArr90.length; i++) {
            numbersArr90 [i] = Integer.parseInt(scanner.nextLine());
            sum += numbersArr90[i];

        }
        for (int i = 0; i < numbersArr90.length; i++) {
            System.out.printf("%d ",numbersArr90[i]);
        }
        System.out.printf("%n%d",sum);
        //------------------- POPULATE integer and print out integer array --------------------------

        //--------------------Reading elements only-------------
        String[] stringArr0 = scanner.nextLine().split(" ");
        for (String elementReaderOnlyInForCycle : stringArr0) {
            System.out.println(elementReaderOnlyInForCycle);
        }
        //--------------------Reading elements only-------------


        //Arrays presets Integer array , setting length ,filling it with data on each position , reading it out backwards -----------------------------------------

        int num = Integer.parseInt(scanner.nextLine());
        String[] stringArr = scanner.nextLine().split(" ");
        int[] numbersArr = new int[num]; //massive n here is the amount of elements
        for (int i = 0; i < numbersArr.length ; i++) {
            numbersArr[i] = Integer.parseInt(scanner.nextLine());
            //numbersArr[we take the position of the element] and we tell what the number is going to go there
        }

        for (int i = numbersArr.length; i > 0; i--) {
            System.out.printf("%d ",numbersArr[i-1]);
        }
        //Arrays presets Integer array , setting length ,filling it with data on each position , reading it out backwards -----------------------------------------

        //Arrays transfer String array to int array      Way 1------------------------------------------------------------------------
        String input = scanner.nextLine();

        //we create a String array and it scans the whole line it automatically gets it length
        //by the amount of data give and differentiates  with a " " in between symbols
        String[] inputArrString = input.split(" ");

        //we create an int array with the length of the String array
        int[] numbersArr2 = new int[inputArrString.length];

        for (int i = 0; i < numbersArr2.length; i++) {
            //we say for each position of the int array starting to zero ending at the length
            //we parse and put the data from the same position from the String array
            numbersArr2[i] = Integer.parseInt(inputArrString[i]);
        }
        //Arrays transfer String array to int array      Way 1------------------------------------------------------------------------

        //Arrays transfer String array to int array      Way 2------------------------------------------------------------------------
        String input2 = scanner.nextLine();
        //we make int array we get the input and we split with space " " , then we map it to every element "e" and we send it back
        int[] numbersArrFromString = Arrays.stream(input2.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        //Arrays transfer String array to int array      Way 2------------------------------------------------------------------------

        //Arrays transfer String array to int array      Way 3------------------------------------------------------------------------
        //create  int array   . get the input and split it with " ". and map it to the array length as integers
        String input3 = scanner.nextLine();
        int[] numbersArr3 = Arrays.stream(input3.split(" ")).mapToInt(Integer::parseInt).toArray();
        //Arrays transfer String array to int array      Way 3------------------------------------------------------------------------

        //Reading an Array from end to beginning Replacing arrays elements with other elements -----------------------------------------------------
        String input4 = "a b c d e ";
        String[] inputArr = input4.split(" ");
        //or String[] inputArr2 = scanner.nextLine().split(" ");

        //we write the /2 so we don't reach the "c" in the middle when we exchange elements
        for (int i = 0; i < inputArr.length/2; i++) {
            String oldElement = inputArr[i];
            //we put the -1 for the first iteration so we get the last symbol its 5-1-i(witch is 0) = 4
            //and for all the following we get - 1 to get the numbers one way back and i to move accordingly
            inputArr[i] = inputArr[inputArr.length-1 - i];
            inputArr[inputArr.length-1 - i] = oldElement;
        }
        //Reading an Array from end to beginning Replacing arrays elements with other elements -----------------------------------------------------

        System.out.println(String.join(" ",inputArr)); // how to print string contents

        //--------------ForEach reading massive and array ------------------------
        int[] numbersArr8 = {1,2,3,4,5};
        for (int numberInFor : numbersArr8){
            System.out.print(numberInFor + " ");
        }
        //--------------ForEach reading massive and array ------------------------

        //----take data from a specific spot from an input line or string and parse into string--------
        String command =scanner.nextLine();
        String command1 = "swap 2 4";
        int index1 = Integer.parseInt(command1.split(" ")[1]);
        int index2 = Integer.parseInt(command1.split(" ")[2]);
        System.out.println(index2+" "+index1);
        //----take data from a specific spot from an input line or string and parse into string--------

        //------take smallest integer from array , take biggest , sum elements , average
        // min , max ,sum ,average
        int [] array5690e = new int[]{56,567,57};
        int small = Arrays.stream(array5690e).min().getAsInt();
        int maxnum = Arrays.stream(array5690e).max().getAsInt();
        int sumArrElements = Arrays.stream(array5690e).sum();
        System.out.println(small);
        //------take smallest integer from array

        //-----take all the other elements of an array/massive that are not the smallest
        int [] array5690ze = new int[]{56,567,57};
        int others = Arrays.stream(array5690ze).min().orElse(array5690ze.length-1);
        System.out.println(others);

    }
}
