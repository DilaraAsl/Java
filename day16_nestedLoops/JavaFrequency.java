package day16_nestedLoops;


public class JavaFrequency {
    public static void main(String[] args) {
        String word="My Java favorite Java programming language is Java, I love jAva, JAVA is so cool.";
        word=word.toLowerCase();
        String find="java";
        System.out.println(frequency(word,find));
    }

    private static int frequency(String word, String find) {
       int sum=0;
        for (int i = 0; i <word.length()-3; i++) {
            if(find.equals(word.substring(i,i+4))) sum++;

        }
        return sum;
    }


}
