package Sep2023.ExamPrep_1;

import java.util.*;
import java.util.stream.Collectors;

public class ExamPrep_1_Meeting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String male = scanner.nextLine();
        String female = scanner.nextLine();
        List<Integer> maleList = Arrays
                .stream(male.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Collections.reverse(maleList);
        maleList.removeIf(number -> number.equals(0));
        for (int i = 0; i < maleList.size(); i++) {
            int currentIndexValue = maleList.get(i);
            if (currentIndexValue%25==0){
                maleList.remove(i);
                maleList.remove(i++);
            }
        }
        ArrayDeque<Integer> stackMale = new ArrayDeque<>();
        for (int e:
             maleList) {
            stackMale.offer(e);
        }

        List<Integer> femaleList = Arrays
                .stream(female.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        femaleList.removeIf(number -> number.equals(0));
        for (int i = 0; i < femaleList.size(); i++) {
            int currentIndexValue = femaleList.get(i);
            if (currentIndexValue%25==0){
                femaleList.remove(i);
                femaleList.remove(i++);
            }
        }
        ArrayDeque<Integer> stackFemale = new ArrayDeque<>();

        for (int e:
                femaleList) {
            stackFemale.offer(e);
        }
        int matchesCount=0;

        while (!stackMale.isEmpty() && !stackFemale.isEmpty()){
            if (stackMale.peek()==stackFemale.peek()){
                stackMale.pop();
                stackFemale.pop();
                matchesCount++;
            } else if (stackMale.peek()!=stackFemale.peek()) {
                int maleCurrent=stackMale.peek();
                maleCurrent= maleCurrent-2;
                stackMale.pop();
                if (maleCurrent>0){
                    stackMale.addFirst(maleCurrent);
                }
                stackFemale.pop();
            }
        }

        System.out.println("Matches: "+matchesCount);
        StringJoiner joiner = new StringJoiner(", ");
        if (stackMale.size()==0){
            System.out.println("Males left: none");
        }else {
            for (Integer element : stackMale) {
                joiner.add(element.toString());
            }
            // Print the result
            System.out.println("Males left: " + joiner.toString());
        }
        if (stackFemale.size()==0){
            System.out.println("Females left: none");
        }else {
            for (Integer element : stackFemale) {
                joiner.add(element.toString());
            }
            // Print the result
            System.out.println("Females left: " + joiner.toString());
        }

    }
}
