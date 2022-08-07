package XtraTasks.GaddisTrivia493;

import java.util.Scanner;

public class Player {
   public String name;
    int correctAns=0;

    public Player(String name) {
        this.name = name;
    }
    public void answer(Questions question){

        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your answer");
        if(question.correctAns.equals(kb.next())) {System.out.println("You got it right!");counter();}
        else System.out.println("Maybe next time!");



    }



    private void  counter() {
        correctAns++;
    }


    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", correctAns=" + correctAns +
                '}';
    }
}
