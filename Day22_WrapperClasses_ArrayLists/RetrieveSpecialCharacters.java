package Day22_WrapperClasses_ArrayLists;

public class RetrieveSpecialCharacters {
    public static void main(String[] args) {
        String str="Wooden spoon!";
        String isLetter="";
        String isDigit="";
        String special="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLetter(str.charAt(i))){
                isLetter+=""+str.charAt(i);
            }
            else if(Character.isDigit(str.charAt(i))){
                isDigit+=""+str.charAt(i);
            }
            else if(!Character.isLetterOrDigit(str.charAt(i))){
                special+=""+str.charAt(i);
            }
        }
        System.out.println("letters : "+isLetter);
        System.out.println("digits : "+isDigit);
        System.out.println("special characters: "+special);

    }
}
