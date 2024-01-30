package Z_CODE_PRESETS.TextProcessingPresets;

import java.util.Scanner;

public class P03_SubstringRemovingPartsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove =scanner.nextLine();
        String text =scanner.nextLine();

        //kicegiciceeb
        //starting index
        int index = text.indexOf(toRemove);
        while (index !=-1){
            text = text.replace(toRemove,"");//kgiciceeb
            index = text.indexOf(toRemove);
        }
        System.out.println(text);

    }
}
