package day15_doWhileLoops;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {

            if(i==6) break;

            System.out.println(i);
        }
        for (char i ='A'; i <='Z'; i++) {

            if(i=='J') continue;// skip J
            System.out.println(i);

        }
        // if i is even do not print skip
        for (int i = 0; i <10 ; i++) {
            if(i%2==0) continue;
            System.out.print(i);

        }

    }
}
