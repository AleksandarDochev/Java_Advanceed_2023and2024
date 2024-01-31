package Z_CODE_PRESETS.Z_GENERICS_hyper_commons;

public class RecursionDemo {
    public static void main(String[] args) {
        //for (int i = 0; i < 10; i++) {
         //   System.out.println(i);
        //}
        //methodA(0);
        methodB(0);


    }
    private static void methodA (int count){
        System.out.println(count);
        methodA(count); // here we call our methodA again in of it self
        //and thus making a infinite loop with it self
        //this is call recursion, basicly a mehod call it self and it going to break with Stack ofveflow error
    }
    private static void methodB (int count){
        if (count ==10){
            return;
        }
        count++;
        System.out.println(count);
        methodB(count); // here we call our methodB again in of it self
        //this case is when we do a check so we call the methd but
        //every call is counted and wehn that coun reaches 10 we stop
        //the method with a return;
    }
}
