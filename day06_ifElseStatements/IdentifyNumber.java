package day06_ifElseStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number=1000;
        boolean isPositive=number>0; // if the number is greater then 0
        boolean isNegative=number<0; //if the number is less than 0
        boolean isZero=!isPositive&&!isNegative; // or isZero=number==0;
    }
}
