package GroupExercises;

public class NestedLoopTask3Alternative {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j<=i-1) {
                    System.out.print("* ");
                } else {
                    System.out.print(6-j + "   ");
                }
            }
            System.out.println();
        }
    }
}
