package XtraTasks;

public class LongestString {
    public static void main(String[] args) {
        String sen = "i love dogs";
        String[] wordList = sen.split(" ");
        int max = wordList[0].length();
        String longest = "";
        for (int i = 0; i < wordList.length - 1; i++) {
            if (max < wordList[i].length()) {
                max = wordList[i].length();
                longest = wordList[i];
            }
        }
        System.out.println(longest);
    }
}