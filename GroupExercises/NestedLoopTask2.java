package GroupExercises;

public class NestedLoopTask2 {
    public static void main(String[] args) {
        String space=" ";
        for (int i =0; i<5 ; i++) {

                for (int k=0; k<i ; k++) {
                    System.out.print(space);
                }
            for (int j =5-i; j>0; j--) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }

}