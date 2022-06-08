package day08_ternaryAndSwitch;

public class SwitchDays {
    public static void main(String[] args) {
        String day = "Wednesday";
        String result="";
        switch (day) {
            case("Monday"):
                result="Monday";
                break;
            case("Tuesday"):
                    result="Tuesday";
                break;
            default:
                result="invalid";

        }
        System.out.println(result);
    }
}
