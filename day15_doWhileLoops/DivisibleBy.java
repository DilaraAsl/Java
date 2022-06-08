package day15_doWhileLoops;

public class DivisibleBy {
    public static void main(String[] args) {
        String fifteen="";
        String three="";
        String five="";
        for (int i = 1; i <=100 ; i++) {
            if(i%15==0) fifteen+=" "+i;
            else if(i%3==0) three+=" "+i;
            else if (i%5==0) five+=" "+i;

        }
        System.out.println("Divisible by 3: ");
        System.out.println(three);
        System.out.println("Divisible by 5: ");
        System.out.println(five);
        System.out.println("Divisible by 15: ");
        System.out.println(fifteen);
    }
}
