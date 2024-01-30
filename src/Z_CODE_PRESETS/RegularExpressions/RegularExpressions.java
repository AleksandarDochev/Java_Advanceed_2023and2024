package Z_CODE_PRESETS.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //https://regex101.com/
        //https://regexr.com/
        //Lecture ->
        // src/Z_CODE_PRESETS/RegularExpressions/09. JavaFundamentals-Presentation-RegularExpressionsRegex.pdf

        //REGULAR EXPRESSIONS -----------------------------------------------------------------------------
        //[]      what to match for one element ,
        //       Example ghjghj[fj6yj]ugf8uy the pattern of Symblos
        //       inside the [] is the element and in the [] we put the criteria
        // for the specific pattern we need
        //[a-z]   matches all letters on that symbol , lowercase
        //[a-z]+  means the + say how many times do we want to see the
        //        symbol of the type / Quantity modifier
        //[a-z]*  matches all the previous token between zero and unlimited times
        //[a-z]?  matches 0 or 1 times
        //[a-z]{5}matches 5 letters from a-z

        //[A-Z][a-z]+ [A-Z][a-z]+ [A-Z][a-z]+ // gets the 3 names of a Person from
        //"Desislava Yonkova Topuzakova"
        //Starts with one big letter and unknow amout of small letters
        //and a single space


        //"I am Desislava Topuzakova from Stara Zagora and I am 25 years old."
        //we needs t oget all numbers from thatr /\
        //[0-9]  //we get 2 and 5 single digit
        //[0-9]+ //we get 25  multiple digits

        //"I am Desislava Topuzakova from Stara Zagora and I am 25 years old."
        //[arv] we get all elements "a" m "r" and "v".
        //[arv]+ we get all combinations of "arv" "a" "ava" or
        //[^arv] we get all letters except these 3

        // \w we match everything a-zA-Z0-9_ can be used as an escape
        // \W we unmatch everything a-zA-Z0-9_
        // \d we match all numbers same as [0-9]
        // \D we unmatch all numbers same as [^0-9]
        // \s we match all spaces (whitespaces) same as [\r\n\t\f\v ]
        // \S we unmatch everthing without spaces same as [^\r\n\t\f\v ]

        //"Ttrthfthfh"
        //"Odgdfgdfg"
        //[A-Z][a-z]? maches only 2 letters Tt and Od

        //match Name with 5 letters
        //[A-Z][a-z]{5} we get one uppercase and 5 lower case

        //when we have an element that can be and operator and symbol at the same time
        // we use "\" before it so if we want a word to start with +
        // we write \+\
        // we want o check a  telephone number
        //+
        // \+\d* matches "+all or no numbers" that above is a match
        //+6756756756
        // \+\d+ matches "+all numbers " that abose is matc but the previous one is not
        // \+\d? matches only 1 after the token so +6

        //this is how we match whole words
        // [A-Za-z]+
        //this how we match whole word that end on a
        // [A-Za-z]+a{1}


        //his how we match whole word that end on a and ends with
        //space or a dot
        //[A-Za-z]+a{1}[.| ]
        //a{1,} maches a fro a min of 1 times or more
        //a{2,3} maches  a  for a min of 2 or maximum of 3 times

        //[A-Za-z0-9_]+ gets all all that and is
        // the same as \w+ because "_" is considered a charcter

        //REGULAR EXPRESSIONS -----------------------------------------------------------------------------

        //REGULAR SUB EXPRESSIONS -----------------------------------------------------------------------------
        // with () we give groups
        // (\d{2})-(\w{3})-(\d{4})    -> 22-Jan-2015
        // that regex has 3 groups
        // with (?<>) the ?<> we give the name
        // (?<day>\d{2})-(?<month>\w{3})-(?<year>\d{4})

        //([A-Z][a-z]+) \1 matches names
        // but the "\1" meats that after the " "match everything
        // as is in group 1 , because ([A-Z][a-z]+) is our group 1
        // that means ([A-Z][a-z]+) \1 == ([A-Z][a-z]+) ([A-Z][a-z]+)

        //\b ([]) \b is when does it start annd end ,that's called borders
        //\b(?<FirstName>[A-Z][a-z]+) (?<SecondName>[A-Z][a-z]+)\b

        //Regular expression separators
        // if we want to write a speartor that is "/"or"-"or"."
        // we have to write [\.\-\/]

        //REGULAR SUB EXPRESSIONS -----------------------------------------------------------------------------

        //Putting our Regex in Java------------------------------------------------------------
        //for each "\" we put another one at the back so \\ to say 1 in Java
        //like here for example

        // Standard preset for Regex-----------------------------------------------------------

        //Original regex is \b(?<FirstName>[A-Z][a-z]+) (?<SecondName>[A-Z][a-z]+)\b
        String regex1 ="\\b(?<FirstName>[A-Z][a-z]+) (?<SecondName>[A-Z][a-z]+)\\b";
        //and then we put our pattern or шаблон into a compiler
        Pattern pattern1 = Pattern.compile(regex1);
        String inputText1 = scanner.nextLine();
        //and then we use a matcher with takes the pattern and puts on a String or inpput
        Matcher matcher1 = pattern1.matcher(inputText1);//here we store all
        // the test that glow green in https://regex101.com/ after we write our regular expression

        // Simple preset for Regex-----------------------------------------------------------

        String inputText = scanner.nextLine();
        String regex =""; //Regex pattern
        Pattern pattern = Pattern.compile(regex); //Regex pattern compiler for Java
        //OR we create an empty Matcher that we can call later
        //Matcher matcher = null
        Matcher matcher = pattern.matcher(inputText); //we get the compiled regex and we applie it to a input and we save the result to a matcher
        while (matcher.find()){ //so while matcher is true(by default) that's why we don't write =true
            System.out.println(matcher.group()+" ");//we print out groups stored in the matcher starting from group1
        }

        // Simple preset for Regex-----------------------------------------------------------
        // Standard preset for Regex-----------------------------------------------------------


        //Matcher functions in Java -------------------------------------------------------------
        matcher.find(); //boolean that gives true if text is founf or flase if it isn't
        String regex2 ="\\b(?<FirstName>[A-Z][a-z]+) (?<SecondName>[A-Z][a-z]+)\\b";
        while (matcher.find()){ //so while matcher is true(by default) that's why we don't write =true
            System.out.println(matcher.group("FirstName")+" ");//we print out groups stored in the matcher starting from group() goes trought every grup one by one
        }                                                              //we "" we put the name of the group we want to print
        //Matcher functions in Java -------------------------------------------------------------



    }
}
