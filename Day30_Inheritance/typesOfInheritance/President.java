package Day30_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class President extends Person {
    private LocalDate electionDate;

    public President(String name, LocalDate DOB, LocalDate electionDate) {
        super(name, DOB);
        setElectionDate(electionDate);
    }

    public LocalDate getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(LocalDate electionDate) {
        this.electionDate = electionDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "electionDate=" + electionDate +
                '}';
    }
}
