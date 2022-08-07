package day37_exceptions;

public class TryCatchBlocks2 {
    public static void main(String[] args) {
        System.out.println("Program started ");
        int[] arr = {1, 2, 3, 4};
        try {
            System.out.println(arr[1000]);
        } catch (RuntimeException e) {
            e.printStackTrace(); // need to call the method from the exception object displays full details of the exception
        }
        System.out.println("Program ended ");
        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
