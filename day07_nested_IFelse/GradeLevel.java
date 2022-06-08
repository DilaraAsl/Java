package day07_nested_IFelse;

public class GradeLevel {
    public static void main(String[] args) {
        byte grade=12;
        String result="";
        if(grade<=5){
            result="Elementary";
        }
        else if (grade<=8){
            result="Middle";
        }
        else if (grade<=12){
            result="High";
        }
        else if(grade<=16){
            result="College";
        }
        else if (grade<=18){
            result="Grad School";}
        else result="Invalid entry";
        System.out.println(result);
    }
}
