package com.codeforcause.TestApr29;

import java.util.ArrayList;
import java.util.List;

public class SherlockHolmes {
    public static void main(String[] args) {
        int main = 10;
        System.out.println(Integer.toBinaryString(main));
        System.out.println(Integer.toBinaryString(~main));

        // Binary to Integer
        String s = "11011";
        System.out.println(Integer.parseInt(s, 2));

        // Integer to Binary
        int a = 27;
        System.out.println(Integer.toBinaryString(a));

        int[] arr = new int[]{10, 1, 10, 1, 10};
        List<Integer> list = new ArrayList<>();
        list.add(1);

        findMax(arr);

        List<Integer> ls = new ArrayList<>();
        ls.add(1);
//        System.out.println(5 ^ 0);
        int[] primitive = ls.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }

    private static int findMax(int[] arr) {
        int ans = 0;
        int s1 = 0;
        int s2 = 0;


        for (int i = 1; i < arr.length; i++) {
            int a = i % 2 == 0 ? arr[i] : 1;
            int b = i % 2 != 0 ? arr[i - 1] : 1;
            s1 += Math.abs(a - b);
        }

        for (int i = 1; i < arr.length; i++) {
            int a = i % 2 != 0 ? arr[i] : 1;
            int b = i % 2 == 0 ? arr[i - 1] : 1;
            s2 += Math.abs(a - b);
        }

        return Math.max(s1, s2);
    }

    public static int xorAndSum(String a, String b) {
        // Write your code here
        int sum = 0;

        int ad = Integer.parseInt(a, 2);
        int bd = Integer.parseInt(b, 2);


        for (int i = 0; i <= 314159; i++) {
            sum += (ad ^ (bd << i));
        }

        return (sum % 1000000007);

    }
}
