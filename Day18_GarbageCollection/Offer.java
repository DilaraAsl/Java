package Day18_GarbageCollection;

public class Offer {
    String location,companyName, jobTitle;
    boolean hasBenefit, hasPTO, isWFH, isFullTime;
    double salary;

    public Offer(String location, String companyName, String jobTitle, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime, double salary) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
