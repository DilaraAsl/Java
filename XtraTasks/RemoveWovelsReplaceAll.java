package XtraTasks;

import java.util.regex.Pattern;

public class RemoveWovelsReplaceAll {
    private static final Pattern DISEMVOWEL_PATTERN = Pattern.compile("[AaEeIiOoUu]");

    public static void main(String[] args) {
        String str = "akdkeiiidkdl";

        str.replaceAll("[aAeEiIoOuU]", "");
        System.out.println(str);
    }
}
