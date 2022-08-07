package Day26_Statics.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentGroup {// Student group "has a relationship" with Student- Student Group HAS A Student
    public String groupName,groupId;
    public ArrayList<Student> studentList=new ArrayList<>(); // object needs to be created in the constructor
    // size is 0 at the beginning


    public StudentGroup(String groupName, String groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
// studentList=new ArrayList<>(); ArrayList can be instantiated here
    }

    //addStudent(Student): adds the specified student to the students arrayList
    //                removeStudent(id): removes the student with the specified id from the students arraylist
    public void addStudent(Student student){ // adds the student object one by one
        studentList.add(student);

    }
    public void addStudent(Student[] students){ // Adds students array
        studentList.addAll(Arrays.asList(students));

    }
    public void addStudent(String name, int age, char gender, String id){ //
        Student s1=new Student(name, id, age,  gender);// constructs a new student object first then adds it to the student list
        studentList.add(s1);
    }
    public void removeStudent(Student student){
        studentList.remove(student);
    }

    public void removeStudent(String id){
     studentList.removeIf(p->p.id.equals(id));
    }


    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId='" + groupId + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}

