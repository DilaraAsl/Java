package JavaLab_05_Strings;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str="java java java python ruby";
        String temp=str; //temp equals "java java python ruby"
        temp=temp.replace("java","aaa"); //java 4 aaa to 3 characters
        System.out.println(str.length()-temp.length()); // difference give the repetition of java each one difference points to java occurance

    }
}
