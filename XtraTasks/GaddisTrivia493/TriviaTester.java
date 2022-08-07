package XtraTasks.GaddisTrivia493;

import java.util.ArrayList;
import java.util.Arrays;

public class TriviaTester {
    public static void main(String[] args) {
        Player player1=new Player("Dilara");
        Player player2=new Player("Erdem");
        ArrayList<Questions> questionList=new ArrayList<>(Arrays.asList(new Questions("Do you live in NY?","T","F","F"),
                (new Questions("Do you work from home?","T","F","T")  )));
        play(questionList,player1,player2);
        if(player1.correctAns>player2.correctAns){
            System.out.println("winner is player 1");

        }
        else System.out.println(" Winner is player 2");

    }
    public static void play (ArrayList<Questions> questionList,Player player1, Player player2){
        questionList.get(0).printQuestion();
        player1.answer(questionList.get(0));
        questionList.get(1).printQuestion();
        player2.answer(questionList.get(1));
    }
}
