package JavaLab_9_Objects_Encapsulation;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester[] testers={
                new Tester("Jo",35,'M',"A1","QA",45),
                new Tester("Emily",45,'F',"A1","SDET",42),
                new Tester("Bella",38,'F',"A1","QE",45),
        };
        Developer[] developers={
                new Developer ("Shukur",35,'M',"A1","Front End Developer",50,"Java"),
                new Developer ("Marika",28,'F',"A1","Front End Developer",51,"Java"),
                new Developer ("Umran",44,'F',"A1","Front End Developer",55,"Java"),
                new Developer ("Diana",30,'F',"A1","Front End Developer",55,"Java"),
        };
        ScrumTeam scrumTeam=new ScrumTeam("Mo","Lucy","Gail",14);

        scrumTeam.addTester(testers);
        scrumTeam.addDeveloper(developers);
        System.out.println(scrumTeam);

        for (Tester eachTester : scrumTeam.getTesters()) {  //scrumTeam.getTesters().for
            System.out.println(eachTester.getName()+" $"+eachTester.getSalary());
        }
        for (Developer eachDeveloper : scrumTeam.getDevelopers()) {
            System.out.println(eachDeveloper.getName()+" $"+eachDeveloper.getSalary());
        }
    }
}
