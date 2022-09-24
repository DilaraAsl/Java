package Day26_Statics.StudentTask;

public class Student {
    public String name, id;
    public int age;
    public char gender;

    public Student(String name, String id, int age, char gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }
    public void study(){

    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
