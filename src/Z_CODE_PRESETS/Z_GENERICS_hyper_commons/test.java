package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<Integer> numList5765 = new ArrayList<>(Arrays.asList(5,5,6,78,876));
        List<String> nameList676 = new ArrayList<>(Arrays.asList("Victor","4iki","Gobler"));
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
    }
}
