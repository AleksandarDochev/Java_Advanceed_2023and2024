package Z_CODE_PRESETS.ListsCodePresets;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ListsPresets {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        //----------Creating new empty dynamic list--------------------
        List<Integer> numList65 = new ArrayList<>();
        List<String> wordsList = new ArrayList<>();
        wordsList.add("ass");
        wordsList.add("bigAss");

        for (String e :wordsList) {
            System.out.println(e);
        }
        if (numList65.isEmpty()){
            System.out.println("empty");
        }
        //----------Creating new empty dynamic list--------------------

        //----------Creating a subLIst of list , a list that is part of an existing list
        List<Integer> numList6578 = new ArrayList<>(Arrays.asList(5,5,6,78,876));
        //if numList6578 had 4 7 9 0 4
        //then numList6578SumList would be 4 6 , not taking index 2
        List<Integer> numList6578SumList = numList6578.subList(0,2);
        //----------Creating a subLIst of list , a list that is part of an existing list

        //--------------List add remove and other operations --------------
        List<String> wordsList2 = new ArrayList<>(Arrays.asList("Ver","Ger","Maria"));
        wordsList2.remove("Maria"); // remove elemnet form the list
        wordsList2.add(2, "43ggf"); // add element to specific position
        wordsList2.set(2,"Marco");  // replace element in ArrayList
        wordsList2.contains("Ver");
        numList6578.removeIf(e -> e <0); //remove negative numbers from list
        numList6578.removeIf(e -> e % 2 ==0);//remove even number from list
        //--------------List add remove and other operations --------------

        //-------------- List flling , population , filling with data  ----------------
        String input545 = scanner.nextLine();
        List<String> inputList = Arrays.stream(input545.split(" ")).collect(Collectors.toList());
        System.out.println();
        //-------------- List flling , population , filling with data  ----------------

        //---------Parse numbers from String list into whole numbers into integer list
        // From String to integer List ---------WAY 1
        String input5455 = scanner.nextLine();
        List<String> numbersListString = Arrays.stream(input5455.split(" ")).collect(Collectors.toList());
        System.out.println();
        List<Integer> numbersListInteger = new ArrayList<>();

        for (int i = 0; i <numbersListString.size() ; i++) {
            int currentNum=Integer.parseInt(numbersListString.get(i));
            numbersListInteger.add(currentNum);
        }
        //---------Parse numbers from String list into whole numbers into integer list
        // From String to integer List ---------WAY 1


        //---------Parse numbers from String list into whole numbers into integer list
        // From String to integer List ---------WAY 2
        List<Integer> numbersListInteger1 = Arrays
                .stream(input5455.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println();
        //---------Parse numbers from String list into whole numbers into integer list
        // From String to integer List ---------WAY 2

        //--------ArrayList join function add changes to all elements
        List<String> inputList34 = Arrays.stream(input545.split(" ")).collect(Collectors.toList());
        System.out.println(String.join(", ",inputList34));
        //4 5 6 7 89 34 2 -> 4, 5, 6, 7, 89, 34, 2
        //--------ArrayList join function add changes to all elements

        //-----------ArrayList print content out clean no [] no ,with delimiter and etc -------
        List<Integer> numList5765 = new ArrayList<>(Arrays.asList(5,5,6,78,876));
        List<String> nameList676 = new ArrayList<>(Arrays.asList("Victor","4iki","Gobler"));
        //ArrayList print content out clean very easy and simple
        System.out.println(String.join(" ",nameList676));
        Collections.sort(nameList676); //sorts by Alphabetical name the list
        System.out.println(String.join(" ",nameList676));//prints out sorted
        System.out.println(); //[5, 5, 6, 78, 876]
        System.out.println(numList5765.toString().replaceAll("[\\[\\],]",""));//[5, 5, 6, 78, 876] -> 5 5 6 78 876
        for (int item: numList5765) {
            System.out.println(item+" ");
        }//[5, 5, 6, 78, 876] -> 5 5 6 78 876
        ///// print sorted and with numbers
        int lineNumber=1;
        for (String name:nameList676) {
            System.out.printf("%d.%s%n",lineNumber++,name);
        }
        /////

        //-----------ArrayList print content out clean no [] no ,with delimiter and etc -------



    }
    //---------method for  join elements with delimeter---------------------
    //System.out.println(joinMethodElementsByDelimeter(" ",xxxListWeWantTOEditxxx));
    public static String joinMethodElementsByDelimeter(String delimeterMethodIntake, List<Double> listDoubleMethodIntake){
        DecimalFormat df= new DecimalFormat("0.###");//12.0000 ->12 12.3454 ->12.346
        String result="";
        for (double item:listDoubleMethodIntake) {
            String numDf=df.format(item)+ delimeterMethodIntake;
            result +=numDf;
        }
        return result;
    }
    //---------method for  join elements with delimeter---------------------

}
