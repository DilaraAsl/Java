package XtraTasks.leetCode.Easy;

import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};
        System.out.println((Arrays.toString(mergeSortedArrays(a, b, 3, 3))));

    }

    public static int[] mergeSortedArrays(int[] a, int[] b, int n, int m) {
        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;

        while (k >= 0) { // every element should be checked and placed in the final array
            if (j < 0 || (i >= 0 && a[i] > b[j])) {
                a[k] = a[i];
                k--;
                i--;
            } else {
                a[k] = b[j];
                k--;
                j--;
            }
        }

        return a;
    }
}
/* 88 -Merge Two Sorted Arrays
You are given two integer arrays a and b, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in a and b respectively.
Merge a and b into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function,
but instead be stored inside the array a.
To accommodate this, a has a length of m + n,
where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. b  has a length of n.

a={1,2,3,0,0,0} i=m-1; k=m+n-1
b={2,5,6} j=n-1;
a={1,2,2,3,5,6}

 */