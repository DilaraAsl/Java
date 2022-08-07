package JavaLab_9_Objects_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private String PO;
    private String BA;
    private String SM;
    private ArrayList<Tester>  testers=new ArrayList<>(); // ScrumTeam HAS A relationship with Tester
    private ArrayList<Developer> developers=new ArrayList<>(); //ScrumTeam HAS A relationship with Developer
    private int daysOfSprint;

    public String getPO() {

        return PO;
    }

    public void setPO(String PO) {
        terminate(PO,"invalid PO name");
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        terminate(BA, "invalid BA name");
        this.BA = BA;
    }

    public String getSM() {
        terminate(SM,"invalid SM name");
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        if(daysOfSprint<=0){
            System.err.println("invalid days of Sprint ");
            System.exit(1);
        }
        this.daysOfSprint = daysOfSprint;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public void setTesters(ArrayList<Tester> testers) {
        this.testers = testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }
    private static void terminate(String arg, String err){ // err error message
        if (arg==null|| arg.trim().isEmpty()){
            System.err.println(err);
            System.exit(1);
        }
    }

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        setDaysOfSprint(daysOfSprint);
    }
    public void addTester(Tester tester){ // adds tester object to ArrayList<Tester>
        testers.add(tester);
    }
    public void addTester(Tester[] testerObj){ // adds tester objects to ArrayList<Tester>
        testers.addAll(Arrays.asList(testerObj));
    }

    public void removeTester(String id){
       testers.removeIf(p->p.getId().equalsIgnoreCase(id));
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDeveloper(Developer[] developerObj){
      developers.addAll(Arrays.asList(developerObj));
    }

    public void removeDeveloper(String id){
      developers.removeIf(p->p.getId().equalsIgnoreCase(id));

    }


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
