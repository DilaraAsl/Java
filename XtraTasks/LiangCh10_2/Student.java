package XtraTasks.LiangCh10_2;

public class Student extends Person {
    private final String classStatus;

    public Student(String name, String address, String email, String classStatus) {
        super(name, address, email);
        if (!(classStatus.equalsIgnoreCase("freshman") || classStatus.equalsIgnoreCase("sophomore") ||
                classStatus.equalsIgnoreCase("junior") || classStatus.equalsIgnoreCase("senior"))) {
            System.err.println("invalid class status for " + name);
            System.exit(1);
        }
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }

    @Override
    public String toString() {
        return super.toString() +
                " classStatus='" + classStatus + '\'' +
                '}';
    }
}
