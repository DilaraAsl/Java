package day38_exceptions_throws;

import utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        Library.sleep(3.5);
        System.out.println("------------------------------------------------------------");
        if (LocalTime.now().equals(LocalTime.of(13, 00))) {
            throw new BreakTimeException("It's time to go home");
        }
    }
}
