package Jan2024.Java03_StacksAndQueues_lab;

import java.util.ArrayDeque;
import java.util.Scanner;
//start 28/12/2023 16:00 - 21;10 5 hours

public class P01_BrowserHistory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        String currentURL;
        String previousURL;
        ArrayDeque<String> history = new ArrayDeque<>();

        while (!input.equals("Home")){

            input = scanner.nextLine();
            if (input.equals("Home")){
                break;
            }
            if(!input.equals("back")){
                currentURL = input;
                System.out.println(currentURL);
                history.push(input);
            } else if (input.equals("back")) {
                if (history.size()==1){
                    System.out.println("no previous URLs");
                    if (!input.equals("back")){
                        history.push(input);
                    }
                }
                if (history.size()<=1){

                }else {
                    history.pop();
                    System.out.println(history.peek());
                }

            }
        }
    }
}