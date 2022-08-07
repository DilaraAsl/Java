package day38_exceptions_throws;

class CustomCheckedException extends Exception {

}

class CustomUncheckedException extends RuntimeException {

}

public class CustomExceptions {
    public static void main(String[] args) {
        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------------------");
    }
}
