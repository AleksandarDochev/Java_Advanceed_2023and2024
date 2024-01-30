package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

import java.text.DecimalFormat;
import java.util.List;

public class methodsPrests {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "world!";
        printHello();
        String fullSentence = stringConcatenation(hello,world);
        System.out.println(fullSentence);

    }
    //----------------------------Basic void method -------------------------------------
    //public is to use it everywhere
    //static idk
    //void is when it does something but it doesn't return any value , like "walk 5 meters" we just do something no result
    //is no void is set then "take a sh*t" , we are expecting a value or result  that is the sh*t
    public static void printHello(){
        System.out.println("Hello");
        //https://softuni.bg/trainings/resources/video/84452/video-31-may-2023-veronika-vaneva-programming-fundamentals-with-java-may-2023/4095
        //-2:25:22
    }
    //----------------------------Basic void method -------------------------------------


    //----------------------------Basic return some Value method -------------------------------------
    // !!!!!!!! WE NEED TO SAVE THE value from this in the main method before using it -- see:
    // String fullSentence = stringConcatenation(hello,world);
    //System.out.println(fullSentence);
    public static String stringConcatenation(String firstString ,String secondString){
//        String fullWord = firstString +" "+ secondString;
//        return firstString;
        //or
        return firstString +" "+ secondString;
    }
    //----------------------------Basic return some Value method -------------------------------------

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
