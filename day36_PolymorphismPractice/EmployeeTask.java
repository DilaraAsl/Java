package day36_PolymorphismPractice;

import day33_abstraction.EmployeeTask.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTask {

    public static void main(String[] args) {
        Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28, 'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F', "A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "A05", "SDET", 105000),
                new Developer("Gulistan", 26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora", 28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Driver("Bella", 32, 'F', "D12", "Truck Driver", 95000),
                new Developer("Diana", 29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "A09", "SDET", 130000),
                new Developer("Alena", 26, 'F', "A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur", 29, 'M', "A11", "SDET", 115000),
                new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan", 26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia", 24, 'F', "A13", "QE", 125000),
                new Developer("Ermek", 26, 'M', "A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar", 30, 'M', "A15", "SDET", 105000),
                new Teacher("Conor", 35, 'M', "B2", "Physics Teacher", 85000),
        };
// store all the developers & testers into the following List of employees
        List<Employee> scrumMembers = new ArrayList<>();
        for (Employee each : employees) {
            if (each instanceof Developer || each instanceof Tester) {
                scrumMembers.add(each);
            }

        }

        //store all the testers into the following List of testers:
        List<Tester> testers = new ArrayList<>();
        for (Employee each : employees) {
            if (each instanceof Tester) {
                testers.add((Tester) each);
            }
        }
        // store all the developers into the following List of developers:
        List<Developer> developers = new ArrayList<>();
        for (Employee each : employees) {
            if (each instanceof Developer) {
                developers.add((Developer) each);
            }

        }
        double testerMaxSalary = 0;
        String highestPaidTester = "";
        for (Tester each : testers) {
            if (testerMaxSalary < each.getSalary()) {
                testerMaxSalary = each.getSalary();
                highestPaidTester = "Highest paid tester: " + each.getName();
            }
        }
        System.out.println(highestPaidTester + " " + testerMaxSalary);

        double developerMaxSalary = 0;
        String developerPaidTester = "";

        String highestPaidDeveloper = "";
        for (Developer each : developers) {
            if (developerMaxSalary < each.getSalary()) {
                developerMaxSalary = each.getSalary();
                highestPaidDeveloper = "Highest paid developer: " + each.getName();
            }
        }
        System.out.println(highestPaidDeveloper + " " + developerMaxSalary);

    }

}
/*
2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();

        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();

        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();

        2.4 which tester has the maximum salary?

        2.5 which developer has the maximum salary?


 */