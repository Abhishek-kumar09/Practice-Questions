package com.codeforcause.arrays;

import java.util.Arrays;

public class LongestBitonicSubarray {
    public static void main(String[] args) {
        int[] arr = {25, 43, 83, 59, 59, 94, 63, 61, 2, 25, 39, 71, 15};
        System.out.println(longestB(arr));
    }

    private static int longestB(int[] arr) {
        int l = 0, r = 0;
        int n = arr.length;


         int[] ansa = new int[2];
        int ans = 0;
        if (n < 3) {
            return n;
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > arr[i - 1]) {

                int j = i-1;
                while(arr[j] < arr[i-1]) {
                    j--;
                }
                l = j+1;
            }

            r = i;

            if (r - l + 1 > ans) {
                ans = r - l + 1;
                ansa[0] = l;
                ansa[1] = r;
            }
        }
        System.out.println(Arrays.toString(ansa));
        return ans;
    }


}
