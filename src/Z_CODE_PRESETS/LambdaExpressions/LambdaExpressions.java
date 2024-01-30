package Z_CODE_PRESETS.LambdaExpressions;

import java.util.Arrays;

public class LambdaExpressions {
    public static void main(String[] args) {

        //https://softuni.bg/trainings/resources/video/86027/video-28-june-2023-veronika-vaneva-programming-fundamentals-with-java-may-2023/4095
        //Time:-29

        int [] array5690ze = new int[]{56,567,57};
        int others = Arrays.stream(array5690ze).min().orElse(2);
        System.out.println(others);
    }
}
