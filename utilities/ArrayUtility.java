package utilities;

public class ArrayUtility {
    public static int[] merge(int[] arr1,int[] arr2){
        int[] temp=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i]=arr1[i];
        }
        for (int k = 0,j=arr1.length; k < arr2.length; k++,j++) {

            temp[j]=arr2[k];

        }
        return temp;
    }
    public static double[] merge(double[] arr1,double[] arr2){
        double [] temp=new double[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i]=arr1[i];
        }
        for (int k = 0,j=arr1.length; k < arr2.length; k++,j++) {

            temp[j]=arr2[k];

        }
        return temp;
    }
    public static String[] merge(String[] arr1, String[] arr2){
        String [] temp=new String[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i]=arr1[i];
        }
        for (int k = 0,j=arr1.length; k < arr2.length; k++,j++) {

            temp[j]=arr2[k];

        }
        return temp;
    }
    public static int[] reverse(int[] arr){
        int[] reverse=new int[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j]=arr[i];
        }
        return reverse;
    }
    public static String[] reverse(String[] arr){
        String[] reverse=new String[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j]=arr[i];
        }
        return reverse;
    }
    public static char[] reverse(char[] arr){
        char[] reverse=new char[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j]=arr[i];
        }
        return reverse;
    }
    public static void findUnique(int[] numbers){
        String temp="";
        for (int each : numbers) {
            int counter=0;
            for (int i : numbers) {
                if (i==each)
                    counter++;
            }
            if (counter==1){
                temp+=""+each;

            }
            System.out.println(each);
        }

    }

}
