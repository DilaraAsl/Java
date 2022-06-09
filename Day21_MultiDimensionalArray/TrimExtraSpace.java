package Day21_MultiDimensionalArray;

public class TrimExtraSpace {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";

        String[] temp = str.split(" ");

        String newString = "";
        for (String each : temp) {
            if (!each.isEmpty()) {
                newString += each + " ";
            }
        }
    }
}