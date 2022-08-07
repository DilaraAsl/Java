package XtraTasks.AggregationTask;

public class Instructor {
    public String lastName, firstName, officeNo;

    public Instructor(String lastName, String firstName, String officeNo) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNo = officeNo;
    }
    // A copy constructor:
    // A copy constructor is a constructor that accepts an object ot he same class as an argument
    //It makes the object that is being created a copy of the object that was passed as an argument
    public Instructor(Instructor obj2){
        this.lastName=obj2.lastName;
        this.firstName=obj2.firstName;
        this.officeNo=obj2.officeNo;

    }

    // set method to sets the value for each field

    public void set(String lastName, String firstName,String officeNo){
        this.lastName=lastName;
        this.firstName=firstName;
        this.officeNo=officeNo;

    }


    public String toString() {
        return "Instructor Information : " +
                "\n lastName : " + lastName + '\'' +
                "\n  firstName: " + firstName + '\'' +
                "\n  officeNo: " + officeNo + '\'' ;
    }
}
