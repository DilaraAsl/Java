package XtraTasks.LiangCh10_2;

import java.time.LocalDate;

public class Faculty extends Employee {
    private int officeHrs;
    private String rank;

    public Faculty(String name, String address, String email, LocalDate dateHired, double salary, boolean hasOffice, int officeHrs, String rank) {
        super(name, address, email, dateHired, salary, hasOffice);
        setOfficeHrs(officeHrs);
        setRank(rank);
    }

    public int getOfficeHrs() {
        return officeHrs;
    }

    public void setOfficeHrs(int officeHrs) {
        this.officeHrs = officeHrs;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() +
                " officeHrs=" + officeHrs +
                ", rank='" + rank + '\'';
    }
}
