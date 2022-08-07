package Day29_Inheritance.Tasks.EmployeeTask;

public class Developer extends Person {
    private String programmingLanguage;

    public Developer(String name, char gender, int age, String id, String jobTitle, double salary,String programmingLanguage) {
        super(name, gender, age, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }


    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        boolean isValid = programmingLanguage.equalsIgnoreCase("java") || programmingLanguage.equalsIgnoreCase("JavaScript") ||
                programmingLanguage.equalsIgnoreCase("Python") || programmingLanguage.equalsIgnoreCase("Ruby") ||
                programmingLanguage.equalsIgnoreCase("C#") || programmingLanguage.equalsIgnoreCase("C++") ||
                programmingLanguage.equalsIgnoreCase("Swift");
        if (!isValid) {
            System.err.println("Invalid programming language!!!");
            System.exit(1);
        }

    }
public void coding(){
    System.out.println(getName()+" is coding");
}
}
