package Z_CODE_PRESETS.TextProcessingPresets;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessingStringManipulationsBuildingModify {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String textStatic="wordsLetters";
        String text =scanner.nextLine();
        //String to individual chars in an array
        char[] charArray = text.toCharArray();
        //String to individual chars in an array

        //add data to Sting with +=
        textStatic+="Jhon";
        System.out.println(textStatic);

        String t = String.join("  ","con","ca","ten","ate");
        System.out.println(t);

        //SubString operations----------------------------------------
        String bigString="123Zdf";
        String part="Zdf";
        String card="10C";
        //this substring (start,end);
        String partOfCard = card.substring(0,2);
        System.out.println(partOfCard);
        //starting index of  word , here because Z is onthe 3 index int is 3
        int stratingIndex = bigString.indexOf(part);
        //remove or replace part of string
        //can be specific \/
        bigString = bigString.replace("123","0");
        //Check for removal from string if contans
        if (bigString.contains("Zdf")){
            bigString= bigString.replace("Zdf","");
            System.out.println("Whats left of big stng: "+bigString);
        }

        //SubString operations----------------------------------------

        //String builder add to a string -------------------------------
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("a");
        }//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        System.out.println(sb);

        //Matcher when to use while and if statements -----------------------
        String dataFromInput ="=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i=";
        String regexStringRegex101 ="([=\\/])(?<destination>[A=Z][a-zA-Z]{2,})\\1";//some horrible gibberish
        Pattern pattern23=Pattern.compile(regexStringRegex101);//we use the patter to compile or Regex code
        //in this case matcher has more than 1 element
        Matcher matcher = pattern23.matcher(dataFromInput);
        //we use while for matcher when we want to check more thant 1 elemtn in the matcher
        //and we use IF for the matcher if there is only one element in it
        while (matcher.find()){
            //bla bla
        }
        //Matcher when to use while and if statements -----------------------




    }
}
