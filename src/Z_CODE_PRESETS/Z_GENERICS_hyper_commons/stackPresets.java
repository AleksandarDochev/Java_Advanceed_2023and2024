package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

import java.util.ArrayDeque;

public class stackPresets {
    public static void main(String[] args) {

        //--------populating a stack , depopulation removing values from a stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 1; i <= 73; i++) {
            stack.push(i); //here we give data do the stack or deck

            System.out.println("show ast added number"+stack.peek());//here we just look
            System.out.println("last added number"+stack.pop());//here we remove the value from the deck and get it back to 0
            System.out.println("size"+stack.size()); // here we check the size after each addition , if we remove the top line the size will only grow
        }
        System.out.println("//--------populating a stack , depopulation removing values from a stack\n");
        //--------populating a stack , depopulation removing values from a stack

        //--------top of stack check, difference between stack push and add
        ArrayDeque<Integer> stack2 = new ArrayDeque<>();
        stack2.push(27);
        stack2.push(14);
        stack2.push(657);//with push, we add at the end or at the top so wen we pop it pop it frist
        stack2.add(11);
        stack2.add(7675);
        stack2.add(86867);//with add we add them to the begging so at the bottom of the stack iit's going to be last to be removed
        stack2.pop();
        int topOfStack = stack2.peek();
        System.out.println(topOfStack);
        System.out.println("--------top of stack check, difference between stack push and add");



    }

}
