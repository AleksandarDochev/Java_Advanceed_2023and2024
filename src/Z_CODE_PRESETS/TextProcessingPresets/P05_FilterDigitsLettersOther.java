package Z_CODE_PRESETS.TextProcessingPresets;

import java.util.Scanner;

public class P05_FilterDigitsLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine =scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder characters = new StringBuilder();
        StringBuilder specailSybols = new StringBuilder();
        for (int i = 0; i < inputLine.length(); i++) {
            char symobol=inputLine.charAt(i);
            if (Character.isDigit(symobol)){
                digits.append(symobol);
            }else if (Character.isLetter(symobol)){
                characters.append(symobol);
            }else {
                specailSybols.append(symobol);
            }
        }
        System.out.println(digits);
        System.out.println(characters);
        System.out.println(specailSybols);



    }
}
