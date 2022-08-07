package day32_finalKeyWord.Person;

import java.time.LocalDate;

public class PersonTester {
    public static void main(String[] args) {
        Person me = new Person("Java", LocalDate.of(1924, 10, 10), 'M');
        System.out.println(me);
        Employee futureMe = new Employee("Dilara", "Java Developer", LocalDate.of(1980, 1, 1), 'F', 1000000);
        System.out.println(futureMe);
        futureMe.breathe();
        me.breathe();
        CydeoDevStudents myStudent = new CydeoDevStudents("Daisy", 122, LocalDate.of(2000, 1, 12), 'F', 1, "Zero to Hero");
        System.out.println(myStudent);
        myStudent.breathe();
        // myStudent.eat();
        // myStudent.drink();
    }
}
