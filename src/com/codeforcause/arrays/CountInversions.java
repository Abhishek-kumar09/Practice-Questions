package com.codeforcause.arrays;

public class CountInversions {
    public static void main(String[] args) {
        long[] arr = {2, 4, 1, 3, 5};
        System.out.println(countInversions(arr, 0, arr.length-1));
    }

    private static long countInversions(long[] arr, long si, long ei) {
        if(ei <= si) {
            return 0;
        }

        long count = 0;

        long mid = (si+ei)/2;

        count += countInversions(arr, si, mid);
        count += countInversions(arr, mid+1, ei);

        long[] nArr = new long[(int)(ei-si+1)];

        long  i = si;
        long j = mid+1;
        long k = 0;

        while(i <= mid && j <= ei) {
            if(arr[(int)i] > arr[(int)j]) {
                count += mid - i + 1;
                nArr[(int)k++] = arr[(int)j++];
            } else {
                nArr[(int)k++] = arr[(int)i++];
            }
        }

        while(i <= mid) {
            nArr[(int)k++] = arr[(int)i++];
        }
        while(j <= ei) {
            nArr[(int)k++] = arr[(int)j++];
        }

        for(i = 0; i < nArr.length; i++) {
            arr[(int)i + (int)si] = nArr[(int)i];
        }

        return count;
    }


}
