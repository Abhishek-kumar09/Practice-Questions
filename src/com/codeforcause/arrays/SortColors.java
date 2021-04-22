package com.codeforcause.arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,1,1,0,1,2,0,0,2};
    }

    private static void sort(int[] arr) {
        int n = arr.length - 1;
        int sb = 0, eb = n - 1;

        sb = findSb(arr, sb);
//        eb = findEb(arr, eb);
    }

    private static int findSb(int[] arr, int csb) {
        for(int i = csb; i< arr.length; i++) {
            if(arr[i] != 0) {

            }
        }
        return 0;
    }


}
