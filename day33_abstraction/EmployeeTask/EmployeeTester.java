package day33_abstraction.EmployeeTask;

public class EmployeeTester {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher("Muhtar", 33, 'M', "123", "Java Teacher", 100000);
        System.out.println(myTeacher);
        Mentor myMentor = new Mentor("Momo", 18, 'M', "111");
        System.out.println(myMentor);
        // Developer myDeveloper = new Developer("Neo", 55, 'M', "99", 120000, "java");
        // System.out.println(myDeveloper);
        // Driver myDriver = new Driver("Shima", 22, 'F', "561", 45000);
        // System.out.println(myDriver);

        //  myDeveloper.work();
    }
}
