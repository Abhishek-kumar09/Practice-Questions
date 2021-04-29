package com.codeforcause.TestApr29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BrickALadder {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

//        int arr[] = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String s = bf.readLine();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s.split(" ")[i]);
        }

        String bl = bf.readLine();
        int b = Integer.parseInt(bl.split(" ")[0]);
        int l = Integer.parseInt(bl.split(" ")[1]);

        int[] barr = new int[arr.length];

        for(int i = 1; i < n; i++) {
            barr[i] = arr[i] - arr[i-1];
            if(barr[i] < 0) {
                barr[i] = 0;
            }
        }

        barr[0] = 0;
        System.out.println(Arrays.toString(barr));
        System.out.println(countMax(barr, b, l, 0));
    }

    private static int countMax(int[] arr, int b, int l, int idx) {
        if(l < 0) {
            return Integer.MIN_VALUE;
        }

        if(b < 0) {
            return Integer.MIN_VALUE;
        }

        if(idx == arr.length) {
//            System.out.println(b +" " + l);
            return idx - 1;
        }

        if(arr[idx] > b && l == 0) {
            return Integer.MIN_VALUE;
        }

        return Math.max(idx, Math.max(countMax(arr, b - arr[idx], l, idx + 1),
                countMax(arr, b, l - 1, idx + 1)));
    }
}
