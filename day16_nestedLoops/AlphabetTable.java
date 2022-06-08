package day16_nestedLoops;

public class AlphabetTable {
    public static void main(String[] args) {
        char var='A';
        for (int i =0 ; i <5 ; i++) {

            for (char j =97; j <=122 ; j++) {

                System.out.printf("%4s",var+""+j);

            }
            System.out.println();
            var++;

        }

    }
}
