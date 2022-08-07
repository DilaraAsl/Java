package XtraTasks.enums;

public class DaysOfTheWeekTester {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.FRIDAY;
        if (day == DaysOfTheWeek.FRIDAY) {
            System.out.println("Yay,it's Friday!!!");
        }
        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }

    }
}
