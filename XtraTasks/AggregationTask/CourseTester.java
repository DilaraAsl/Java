package XtraTasks.AggregationTask;

public class CourseTester {
    public static void main(String[] args) {

        Instructor myInstructor=new Instructor("Lemongrass","Jake","123");
        TextBook myTextBook=new TextBook("Starting out with Java","Gaddis","Pearson");
         Course myCourse=new Course("Java",myInstructor,myTextBook);
        System.out.println(myCourse);


    }
}
