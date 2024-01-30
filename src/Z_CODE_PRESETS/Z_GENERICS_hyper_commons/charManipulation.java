package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

public class charManipulation {
    public static void main(String[] args) {
        String word = "Desislava";
        System.out.println("Word analyzed is :"+word);
        System.out.println("word length: "+word.length());//broi na sumvolite
        System.out.println("word first letter "+word.charAt(0));//puwa bukva
        System.out.println("word last letter "+word.charAt(word.length() - 1));//posledna bukwa

        //----------Char lower upper case detection , scanning --------
        char valueChar = 'a';
        // GO here >>> P08_LowerorUpper.main();
        //----------Char lower upper case detection , scanning --------

        //length is 9 characters BUT
        //chars are not position like that
        //because we count form position 0 so at Desislava has  length 9
        //but position 0 to 8 because we start counting from 0

        //-----------see or get ASCII code number from table for a Symbol
        char letter ='F';
        System.out.println("see or get ASCII code number from table for a Symbol : "+letter+" is "+(int) letter); // we get 70
        //-----------see or get ASCII code number from table for a Symbol

        //-----------see or get ASCII code char from table for a Number
        int number = 60;
        System.out.println("see or get ASCII code char from table for a Number  : "+number+" is "+(char)number); //we get <
        //-----------see or get ASCII code char from table for a Number

        //@#FreshFisH@#, @###Brea0D@###, @##Che46sE@##, @##Che46sE@###
        StringBuilder sb = new StringBuilder();
        String barcode = "@##Che46sE@##";
        for (int j = 0; j < barcode.length(); j++) {
            char symbol = barcode.charAt(j);
            if (Character.isDigit(symbol)){

            }
        }

    }
}
