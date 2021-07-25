package com.codeforcause.TestApr29;

import java.io.*;


import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'fibonacciModified' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER t1
     *  2. INTEGER t2
     *  3. INTEGER n
     */

    public static BigInteger fibonacciModified(int t1, int t2, int n) {
        return fibo(t1, t2, n, new BigInteger[n + 1]);
    }

    public static BigInteger fibo(int t1, int t2, int n, BigInteger[] dp) {
        if (n == 1) {
            return new BigInteger(String.valueOf(t1));
        }

        if (n == 2) {
            return new BigInteger(String.valueOf(t2));
        }

        if (dp[n] != null) {
            return dp[n];
        }

        BigInteger a = fibo(t1, t2, n - 1, dp);
        BigInteger b = fibo(t1, t2, n - 2, dp);

        dp[n] = b.add(a.multiply(a));

        return dp[n];
    }

    public static List<Integer> maxSubarray(List<Integer> arr) {

        int[] array = kadane(arr);
        List<Integer> list = new ArrayList<>();
//        Collections.addAll(list, array);

        return list;
    }

    public static int[] kadane(List<Integer> list) {
        int sum = 0;
        int max = 0;
        int sub = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);

            if (sum < 0) {
                sum = 0;
            }

            if (sum > max) {
                max = sum;
            }

            if (list.get(i) > 0) {
                sub += list.get(i);
            }
        }

        return new int[]{max, sub};
    }
}

public class BI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int t1 = Integer.parseInt(firstMultipleInput[0]);

        int t2 = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        BigInteger result = Result.fibonacciModified(t1, t2, n);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
