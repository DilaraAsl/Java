package XtraTasks.GaddisTrivia493;

public class Questions {
    public String question;
    public String possibleAns1,possibleAns2;
    public String correctAns;

    public Questions(String question, String possibleAns1, String possibleAns2, String correctAns) {
        this.question = question;
        this.possibleAns1 = possibleAns1;
        this.possibleAns2 = possibleAns2;
        this.correctAns = correctAns;
    }
    public void printQuestion(){
        System.out.println(question);
    }
    public String getAns(){
       return correctAns ;
    }
}
