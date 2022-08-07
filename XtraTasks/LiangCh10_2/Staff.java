package XtraTasks.LiangCh10_2;

import java.time.LocalDate;

public class Staff extends Employee {
    private String jobTitle;

    public Staff(String name, String address, String email, LocalDate dateHired, double salary, boolean hasOffice, String jobTitle) {
        super(name, address, email, dateHired, salary, hasOffice);
        setJobTitle(jobTitle);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() +
                "jobTitle='" + jobTitle + '\'';
    }
}
