package Z_CODE_PRESETS.ObjectClassesInstancesPresets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_StudentsListsCalling {

    public static class Student {
        String firstName ;
        String secondName ;
        String age ;
        String town ;
        public Student(String firstName,String secondName,String age,String town){
            // this is the attributes in the class Song
            //here we say from the class Song(this) we get the String named typeList and we give it
            //a value that will come from the outside
            this.firstName = firstName;
            this.secondName = secondName;
            this.age=age;
            this.town=town;
        }


        public String getFirstName(){
            return this.firstName;
        }
        public String getSecondName(){
            return this.secondName;
        }
        public String getAge(){
            return this.age;
        }
        public String getTown(){
            return this.town;
        }
    }
    public static void main(String[] args) {
        //https://softuni.bg/trainings/resources/video/85693/video-22-june-2023-veronika-vaneva-programming-fundamentals-with-java-may-2023/4095
        // -43:44
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> studentList= new ArrayList<>();
        while (!input.equals("end")){
            String[] studentData = input.split(" ");
            String firstName =studentData[0];
            String secondName =studentData[1];
            String age =studentData[2];
            String town =studentData[3];

            Student currentStudent = new Student(firstName,secondName,age,town);
            studentList.add(currentStudent);

            input = scanner.nextLine();
        }


        String command = scanner.nextLine();
        for (Student student : studentList) {
            String currentTownStudent = student.getTown();
            if (currentTownStudent.equals(command)) {
                System.out.println(student.getFirstName() + " " + student.getSecondName() + " is " + student.getAge() + " years old");
            }
        }

    }
}
