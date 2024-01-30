package Z_CODE_PRESETS.ObjectClassesInstancesPresets;

import java.time.LocalDate;
import java.util.Scanner;

public class ObjectClassesInstancesPresets {
    public static class Song {
        String typeList; //we
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            // this is the attributes in the class Song
            //here we say from the class Song(this) we get the String named typeList and we give it
            //a value that will come from the outside
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
    }
    public static void main(String[] args) {

        //we create an object of the class that we created -------

        Song objectNameInMain = new Song("favourite","Destruction","4:20");

        //we create an object of the class that we created -----

        //An example of 3 instances of the same object
        LocalDate birthday1 = LocalDate.of(1996,11,27);
        LocalDate birthday2= LocalDate.of(1997,11,23);
        LocalDate birthday3= LocalDate.of(1956,1,2);
        System.out.println(birthday1+" "+birthday2+" "+birthday3);
        //An example of 3 instances of the same object

        //               "new Scanner" here is we create an instance of this class
        Scanner scanner = new Scanner(System.in);





    }
}
