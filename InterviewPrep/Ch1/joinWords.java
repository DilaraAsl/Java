package InterviewPrep.Ch1;

public class joinWords {
    public static void main(String[] args) {
        StringBuilder sentence=new StringBuilder();
        String[] words={"java","mava","kava"};
        for (String each : words) {
            sentence.append(each+" ");
        }
        System.out.println(sentence);
        //System.out.println(sentence.toString()); // both work
    }
}
