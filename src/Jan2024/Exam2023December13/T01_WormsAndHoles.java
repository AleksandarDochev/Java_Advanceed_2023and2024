package Jan2024.Exam2023December13;

import java.util.*;
import java.util.stream.Collectors;

public class T01_WormsAndHoles {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String inputWormSize = scanner.nextLine();
        String inputWormHoles = scanner.nextLine();
        // Start timing
        long startTime = System.nanoTime();
        int matches = 0;
        List<Integer> listWormSize = Arrays
                .stream(inputWormSize.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //Collections.reverse(listWormSize);
        List<Integer> listWormHoles = Arrays
                .stream(inputWormHoles.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Collections.reverse(listWormHoles);

        ArrayDeque<Integer> stackWormSize = new ArrayDeque<>();
        for (Integer e:listWormSize) {
            stackWormSize.push(e);
        }
        ArrayDeque<Integer> stackWormHoles = new ArrayDeque<>();
        for (Integer e:listWormHoles) {
            stackWormHoles.push(e);
        }
        while (!stackWormSize.isEmpty() && !stackWormHoles.isEmpty()){
            if (stackWormSize.peek()==stackWormHoles.peek()){
                matches++;
                stackWormSize.pop();
                stackWormHoles.pop();
            }else if (stackWormSize.peek()>stackWormHoles.peek()){
                stackWormHoles.pop();
                int currentWormLowered = stackWormSize.peek()-3;
                stackWormSize.pop();
                //stackWormSize.push(currentWormLowered);
                if (currentWormLowered <=0 ){
                    stackWormSize.pop();
                }else {
                    stackWormSize.push(currentWormLowered);
                }
            }
        }
        if (matches>0){
            System.out.println("Matches: "+matches);
        }else {
            System.out.println("There are no matches.");
        }
        if (stackWormSize.isEmpty() || inputWormSize.length()==matches){
            System.out.print("Every worm found a suitable hole!");
        } else if (stackWormSize.isEmpty()) {
            System.out.print("Worms left: none");
        }
        if (!stackWormSize.isEmpty()) {
            List<String> listWormsLeft = new ArrayList<>();
            for (Integer e:stackWormSize) {
                listWormsLeft.add(String.valueOf(e));
            }
            Collections.reverse(listWormsLeft);
            System.out.print("Worms left: "+String.join(", ",listWormsLeft));
        }
        if (stackWormHoles.isEmpty()){
            System.out.println("\nHoles left: none");
        }else {
            List<String> listHolesLeft = new ArrayList<>();
            for (Integer e:stackWormHoles) {
                listHolesLeft.add(String.valueOf(e));
            }
            System.out.print("Worms left: "+String.join(", ",listHolesLeft));
        }

        // End timing
        long endTime = System.nanoTime();

        // Calculate execution time in milliseconds
        long executionTimeNano = endTime - startTime;
        double executionTimeMillis = (double) executionTimeNano / 1_000_000; // convert to milliseconds

        // Print the execution time
        //System.out.println("Execution time: " + executionTimeMillis + " milliseconds");

    }
}
