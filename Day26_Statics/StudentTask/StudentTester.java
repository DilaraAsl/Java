package Day26_Statics.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTester {
    public static void main(String[] args) {


  ArrayList<Student> newGroup=new ArrayList<>(Arrays.asList(new Student("Dilara","12345",48,'F'),
          new Student("Emin","12348",2,'M'),
          new Student("Alp","55345",55,'M'),
          new Student("Erdem","55645",11,'M'),
          new Student("Mert","55745",21,'M')));


  StudentGroup group1=new StudentGroup("Group1","001");
  group1.studentList=newGroup; // assign the newGroup to the object list
        System.out.println(group1.toString());

        group1.removeStudent("12348");
        System.out.println(newGroup);
    }
}
