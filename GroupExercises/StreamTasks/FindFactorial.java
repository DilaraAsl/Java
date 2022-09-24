package GroupExercises.StreamTasks;

import java.util.stream.IntStream;

public class FindFactorial {
    public static void main(String[] args) {

        System.out.println(calculateFactorial(2));

    }

    public static int calculateFactorial(int n){

    return IntStream.range(1,n+1).reduce((a,b)->a*b).orElseThrow(()->new RuntimeException("No such Number"));


        }
    }

