package XtraTasks.LiangCh10_2;

import java.time.LocalDate;

public class PersonTester {
    public static void main(String[] args) {
        Staff myStaff = new Staff("Lisa", "CA", "lisa@gmail.com", LocalDate.of(1998, 1, 2), 65000, true, "secretary");
        Student myStudent = new Student("Jo", "NY", "jo@yahoo.com", "Freshman");
        System.out.println(myStaff);
        System.out.println(myStudent);
    }
}
