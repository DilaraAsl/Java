package Day25_ConstructorsAndDateFormatting;
import java.time.LocalDateTime;
public class LocalDateAndTimePractice {
    public static void main(String[] args) {
        LocalDateTime starts=LocalDateTime.now();
        System.out.println(starts);
        LocalDateTime ends=LocalDateTime.of(2023,5,10,11,0);
        // methods of LocalDate and LocalTime can be used for LocalDateTime

        System.out.println(ends.getYear());
        System.out.println(starts.getDayOfWeek());
    }
}
