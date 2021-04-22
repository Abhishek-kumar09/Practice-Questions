package com.codeforcause.arrays;

import java.util.HashMap;

public class LargestArrayOfZeroAndOnes {
    public static void main(String[] args) {
//        int arr[] = {1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0};
        int[] arr = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1};
        System.out.println(count(arr, arr.length));
    }

    private static int count(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int sum = 0;
        hm.put(0,-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] == 0 ? -1 : 1;

            if (hm.containsKey(sum)) {
                if (i - hm.get(sum) > max) {
                    max = i - hm.get(sum);
                }
            } else {
                hm.put(sum, i);
            }
        }

        return max;
    }

}
