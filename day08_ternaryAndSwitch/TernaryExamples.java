package day08_ternaryAndSwitch;

public class TernaryExamples {
    public static void main(String[] args) {
        int score=89;
        String result=(score>70)?"pass":"fail";
        System.out.println(result);
        int age=34;
        String eligibleAge=(age>21)?"eligible":"not eligible";
        System.out.println(eligibleAge);
        int number=0;
        String output=(number>0)?(number<0)?"positive":"negative":"zero";
        System.out.println(output);
        String output2=(number>0)?"positive":(number<0)?"negative":"zero";
        System.out.println(output2);
        int n=1;
        String day=(n==1)?"monday":(n==2)?"tuesday":(n==3)?"wednesday":(n==4)?"thursday":"friday";
        System.out.println(day);
    }
}
