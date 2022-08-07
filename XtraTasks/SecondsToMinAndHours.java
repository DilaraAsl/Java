package XtraTasks;

public class SecondsToMinAndHours {
    public static void main(String[] args) {
        int seconds = 8274;
        int hours = 0;
        int minutes = 0;
        int result = 0;
        hours = seconds / 3600;
        System.out.println(hours);
        result = seconds % 3600;
        System.out.println(result);
        minutes = result / 60;
        seconds = result % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
