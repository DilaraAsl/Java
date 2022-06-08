package Day19_IntroToArrays;

import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        String[] names={"Anna", "Nancy","Sarah"};
        int[] scores={90,75,80};
        char[] grades=new char[names.length];

        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>=90) grades[i]='A';
            else if (scores[i]>=80) grades[i]='B';
            else if(scores[i]>=70) grades[i]='C';
            else grades[i]='F';

            }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"'s score is : "+scores[i]+" grade is: "+grades[i]);

        }
        }

    }

