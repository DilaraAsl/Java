package day32_finalKeyWord.Person;

import java.time.LocalDate;

public class CydeoDevStudents extends Person {
    private final int id;

    private String batchName;
    private int batchNo;
    public static final String programmingLanguage;


    static {
        programmingLanguage = "java";
    }

    public void setBatchName(String batchName) {
        if (!batchName.equalsIgnoreCase("Zero to Hero") && !batchName.equalsIgnoreCase("Alumni")) {
            System.err.println("No such batch in Cydeo!!!");
            System.exit(1);
        }
        this.batchName = batchName;
    }

    public String getBatchName() {
        return batchName;
    }


    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        if (batchNo <= 0) {
            System.err.println("Invalid batch NO! ");
            System.exit(1);
        }
        this.batchNo = batchNo;
    }

    public CydeoDevStudents(String name, int id, LocalDate dateOfBirth, char gender, int batchNo, String batchName) {
        super(name, dateOfBirth, gender);
        if (getAge() < 18) {
            System.err.println("Invalid Age");
            System.exit(1);
        }
        this.id = id;

        eat();
        drink();
        setBatchNo(batchNo);
        setBatchName(batchName);
    }

    public int getId() {
        return id;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage + "");
    }

    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage + "");
    }

    @Override
    public String toString() {
        return super.toString() +
                "id=" + id +
                ", age=" + getAge() +
                ", batchName='" + batchName + '\'' +
                ", batchNo=" + batchNo +
                '}';
    }
}
/* 1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables
*/