package Day30_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class PersonTester {
    public static void main(String[] args) {

        Student student1 = new Student("Joan", LocalDate.of(1966, 12, 12));
        System.out.println(student1);
        President myPresident = new President("Joe Biden", LocalDate.of(1933, 12, 12), LocalDate.of(2021, 1, 21));
        System.out.println(myPresident);
    }
}
