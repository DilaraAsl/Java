package day32_finalKeyWord.finalKeyWord;

import java.time.LocalDate;

class CydeoStudent {

    // final methods can never be overridden
    public final void language() {
        System.out.println("java programming");
    }
}

public final class FinalKeyword extends CydeoStudent { // This class can never be a parent

    public static void main(String[] args) {
        final char gender = 'F';
        System.out.println();
        //  gender='M'; will give compile error
        System.out.println("-----------------------------------------");
        final LocalDate dateOfBirth = LocalDate.now();
        //dateOfBirth=dateOfBirth.plusYears(20); compile error

        new CydeoStudent().language();
        new FinalKeyword().language();
    }

    // public void language() {  Compile Error overriden method is final
    //     System.out.println("python programming");
    // }

}
