package Day19_IntroToArrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alphabet=new char[26]; //index 0-25
        char[] descendingLetters=new char[26];
        for (int i = 0,j='A', k='Z'; i < alphabet.length; i++,j++,k--) {
            alphabet[i]=(char)j; // cast it to char
            descendingLetters[i]=(char)k;

        }
        System.out.println("alphabet = " + Arrays.toString(alphabet));
        System.out.println("alphabet = " + Arrays.toString(descendingLetters));



        }
    }

