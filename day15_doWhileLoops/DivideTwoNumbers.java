package day15_doWhileLoops;
import java.util.Scanner;
public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int num1=kb.nextInt();
        int num2=kb.nextInt();
        kb.close();
        int sum=0;
        if(num1%num2==0){
            for (int i =1; i<num1 ; i++) {
                sum+=num2;
                if(num1==sum){
                    System.out.println(num1+" divided by "+num2+"="+i);
                    break;
                }

            }

        }
        else System.out.println(" not divisible");
    }
}
