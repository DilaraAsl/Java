package JavaLab_06_Methods;

public class zipZap {
    public static void main(String[] args) {
        String str="azbcpzpp";
int k=str.length();
        System.out.println(k);

        for(int i=5;i<str.length()-2;i++)
        {

            if(str.charAt(i)=='z'&& str.charAt(i+2)=='p'){
                System.out.println(i);
                System.out.println(i+1);
                System.out.println(i+2);
                str=str.replaceFirst(""+str.charAt(i+1),"");

            }
        }
        System.out.println(str);
        }



    }

