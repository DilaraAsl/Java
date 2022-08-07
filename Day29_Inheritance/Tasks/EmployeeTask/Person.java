package Day29_Inheritance.Tasks.EmployeeTask;

public class Person {
    private String name;
    private char gender;
    private int age;
    private String id;
    private String jobTitle;
    private double salary;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        if(gender!='M'&&gender!='F'){
            System.out.println("invalid gender entry: "+gender);
            System.exit(1);
        }
        this.gender=gender;
    }
    public int getAge(){
        if(age<0){
            System.out.println("Age cannot be negative : "+age);
            System.exit(1);
            if(age<18 || age>65){
                System.out.println("Invalid age :"+age);
                System.exit(1);
            }
        }
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if(salary<0){
            System.out.println("invalid salary : "+salary);
            System.exit(1);
        }
        this.salary=salary;
    }
    public Person (String name,char gender,int age, String id, String jobTitle, double salary){
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
