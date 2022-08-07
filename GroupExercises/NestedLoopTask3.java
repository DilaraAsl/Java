package GroupExercises;

public class NestedLoopTask3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(j <= i ? j + " " : " " + " ");

            }
            System.out.println();

        }
    }
}
