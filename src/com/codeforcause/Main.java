package com.codeforcause;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
