package day16_nestedLoops;

public class WithoutStringCodingBat {
    public static void main(String[] args) {
        String remove="is";
        String base="This is a Fish";
        base=base.toLowerCase();
        remove=remove.toLowerCase();

        int removeLen=remove.length();
        int baseLen=base.length();
        while(base.contains(remove)){
            base=base.replace(remove,"");
        }

        for(int i=0; (i+removeLen)<base.length();i++){
            if(remove.equalsIgnoreCase(base.substring(i,i+removeLen))){
                base=base.replace(base.substring(i,i+removeLen),"");

            }
        }
    }
}
