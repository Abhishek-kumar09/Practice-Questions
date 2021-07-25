package com.codeforcause.dp;

public class ZOKnapsack {
    public static void main(String[] args) {
        int[] weight = {60, 20, 30};
        int[] values = {60, 100, 120};
        int[][] dp = new int[values.length + 1][weight.length + 1];
        System.out.println(zeroOne(values, weight, 0, 50));
    }

    private static int zeroOne(int[] values, int[] weight, int i, int tar) {
        if (i == values.length) {
            return 0;
        }

        if (weight[i] > tar) {
            return zeroOne(values, weight, i + 1, tar);
        }

        return Math.max((values[i] + zeroOne(values, weight, i + 1, tar - weight[i])), zeroOne(values, weight, i + 1, tar));
    }

    private static int zeroOneDp(int[] values, int[] weight, int i, int tar, int[][] dp) {

        if (i == values.length) {
            return 0;
        }

        if (dp[i][tar] != 0) {
            return dp[i][tar];
        }

        if (weight[i] > tar) {
            dp[i][tar] = zeroOne(values, weight, i + 1, tar);
            return dp[i][tar];
        }

        dp[i][tar] = Math.max((values[i] + zeroOne(values, weight, i + 1, tar - weight[i])), zeroOne(values, weight, i + 1, tar));
        return dp[i][tar];
    }

//    private static int zeroOneItr(int[] values, int[] weight, int tar, int[][] dp) {
////        for(int i = 0; i < )
//
//
//
//        if (i == values.length) {
//            return 0;
//        }
//
//        if (dp[i][tar] != 0) {
//            return dp[i][tar];
//        }
//
//        if (weight[i] > tar) {
//            dp[i][tar] = zeroOne(values, weight, i + 1, tar);
//            return dp[i][tar];
//        }
//
//        dp[i][tar] = Math.max((values[i] + zeroOne(values, weight, i + 1, tar - weight[i])), zeroOne(values, weight, i + 1, tar));
//        return dp[i][tar];
//    }


}
