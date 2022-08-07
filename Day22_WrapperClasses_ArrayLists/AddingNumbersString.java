package Day22_WrapperClasses_ArrayLists;

public class AddingNumbersString {
    public static void main(String[] args) {
        String str="a1b2c3d4a5";
        int sum=0;
        char[] temp=str.toCharArray();
        for (char each : temp) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }

        }
        System.out.println(sum);
    }
}
