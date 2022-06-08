package Day20_ArraysUtilityClass;

public class ForEachMaxMinNO {
    public static void main(String[] args) {
        int[] nums={10,40,70,5,25};
        int max=nums[0];
        for (int each:nums) {
            if (max<each) max=each;
        }
        System.out.println(max);
        
        String[] names={"java girl","mava man","kava cat"};
        for (String each : names) {
            System.out.println(""+each.charAt(0)+" "+each.charAt(each.lastIndexOf(" ")+1));
        }
    }
}
