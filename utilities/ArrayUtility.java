package utilities;

import java.util.Arrays;

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
public static int[] addElement(int[] array,int element){
    int[] newArray= Arrays.copyOf(array,array.length+1);

    newArray[newArray.length-1]=element;
    return newArray;
    }
    public static double[] addElement(double[] array,double element){
        double[] newArray= Arrays.copyOf(array,array.length+1);

        newArray[newArray.length-1]=element;
        return newArray;
    }
    public static String[] addElement(String[] array,String element){
        String[] newArray= Arrays.copyOf(array,array.length+1);

        newArray[newArray.length-1]=element;
        return newArray;
    }
    public static boolean contains(int[]array, int element){
        for (int each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(double[] array, double element){
        for (double each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(char[] array, char element){
        for (char each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(String[] array, String element){
        for (String each : array) {
            if(each.equals(element)){
                return true;
            }
        }
        return false;
    }
    public static int[] remove(int[] array, int index){
        int[] temp=new int[array.length-1];
        // skip the index when assigning values to temp
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(i==index){
                continue;
            }
            else {temp[j]=array[i]; j++;}
        }
        return temp;
    }
    public static int[] removeDuplicates(int[] array){
        int[] temp=new int[array.length];
        for (int iEach : array) {
            int i=0;
            for (int jEach : array) {
                if(iEach!=jEach && !ArrayUtility.contains(temp,jEach)){
                    temp[i]=jEach;
                    i++;

                }
            }
            return temp;
        }
return temp;
    }
}
