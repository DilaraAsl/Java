package day28_Encapsulation.encapsulation;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.age=200;
        student.setAge(25);
        student.setName("Jake12");
        System.out.println(student.getAge());
        // student.privateAge=100; private is not accessible we cannot assign a value
        System.out.println(student.getName());

    }
}
