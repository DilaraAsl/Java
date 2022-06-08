package Day19_IntroToArrays;

public class ClassMates {
    public static void main(String[] args) {
        String[] classmates=new String[]{"java girl","mava man","kava cat","lava lamp"};
        for (int i = 0; i < classmates.length; i++) {
            System.out.print(""+classmates[i].charAt(0)+". ");
            for (int j = 0; j <classmates[i].length()-1 ; j++) {

                if(classmates[i].charAt(j)==' '){
                    System.out.println(classmates[i].charAt(j+1)+".");
                }

            }

        }

    }
}
