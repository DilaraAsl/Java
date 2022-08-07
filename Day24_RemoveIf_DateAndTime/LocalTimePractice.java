package Day24_RemoveIf_DateAndTime;
import java.time.LocalTime;
public class LocalTimePractice {
    public static void main(String[] args) {
        LocalTime right_now=LocalTime.now();
        System.out.println(right_now);
        LocalTime startTime=LocalTime.of(10,5);//max hr 23 min 59 will throw an exception if it is more or less than the min
        System.out.println(startTime);
        startTime=startTime.minusMinutes(45);
        System.out.println(startTime);
    }
}
