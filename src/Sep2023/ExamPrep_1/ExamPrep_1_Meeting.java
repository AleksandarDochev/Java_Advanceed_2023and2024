package Sep2023.ExamPrep_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPrep_1_Meeting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String male = scanner.nextLine();
        String female = scanner.nextLine();
        List<String> maleList = Arrays.stream(male.split(" ")).collect(Collectors.toList());
        List<String> femaleList = Arrays.stream(female.split(" ")).collect(Collectors.toList());

    }
}
