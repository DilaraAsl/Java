package XtraTasks.AggregationTask;

public class Course {
    public String courseName;

    public Instructor instructor; // Aggregation Instructor object is a field in Course class
public TextBook textbook;
    public Course(String courseName,Instructor instructor, TextBook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }
    public String getName(){
        return courseName;
    }
    public Instructor getInstructor(){ // gets the instructor object??

        return new Instructor(instructor);
    }
    public TextBook getTextbook(){
        return new TextBook(textbook);
    }


    public String toString() {
        return "Course Information : " +
                "\n courseName: " + courseName + '\'' +
                "\n textbook:  " + textbook + '\'' +
                "\n instructor: " + instructor +"\n";
    }
}
