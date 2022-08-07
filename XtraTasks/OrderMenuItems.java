package XtraTasks;

//Your task is to sort a given string.
// Each word in the string will contain a single number.
//Numbers can be from 1-9. 1 will be the first word (not 0)
// This number is the position the word should have in the result.
public class OrderMenuItems {
    public static void main(String[] args) {
        // Scanner kb = new Scanner(System.in);
        // System.out.println("Enter the menu items in a single line");
        //  String str = kb.nextLine();
        String str = "sh2all wha1t d4o w5ith 3we a6 dru7nken s8ailor";

        System.out.println(order(str));
    }

    public static String order(String str) {
        String[] strList = str.split(" ");

        String[] newList = new String[strList.length];
        String noAfterClean = "";
        int index = 0;
        String newString = "";
        for (int i = 0; i < strList.length; i++) {
            noAfterClean = strList[i].replaceAll("\\D+", ""); // remove non digits \\D+ regex for non digits

            index = Integer.parseInt(noAfterClean);
            newList[index - 1] = strList[i];
        }
        for (int i = 0; i < newList.length; i++) {
            newString += newList[i] + " ";

        }
        return newString;
    }
}
