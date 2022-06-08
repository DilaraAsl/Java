package JavaLab_05_Strings;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str="java java mava kava lava";


        int counter=0; // counts the repeated word java
        System.out.println(str);

        while(str.contains("java")){

            str=str.replaceFirst("java","");

            counter++;

        }
        System.out.println(counter);
    }
}
