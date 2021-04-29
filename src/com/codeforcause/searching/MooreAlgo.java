package com.codeforcause.searching;

public class MooreAlgo {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,2,1,1,0,2};
        System.out.println(findMajor(arr));
    }

    private static int findMajor(int[] nums) {
        int n = nums.length;

        int majI = 0, count = 1;

        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[majI])
                count++;
            else count--;

            if(count == 0) {
                majI = i;
                count = 1;
            }

            System.out.println(majI);
        }

        return nums[majI];
    }
}
