package day08_ternaryAndSwitch;

public class SwitchGrade {
    public static void main(String[] args) {


        char grade = 'A';
        String result = "";
        switch (grade) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Good!";
                break;
            default:
                result = "invalid";
                break;

        }
        System.out.println(result);
    }
}