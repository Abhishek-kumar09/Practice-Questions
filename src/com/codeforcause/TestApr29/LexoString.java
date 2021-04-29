package com.codeforcause.TestApr29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LexoString {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++) {
            String s = bf.readLine();
            char[] t = s.toCharArray();
            Arrays.sort(t);
            s = new String(t);
            System.out.println();
            printLexo(s, 0, "");
        }
    }

    private static void printLexo(String str, int i, String ans) {
        if (i == str.length()) {
            return;
        }

        System.out.println(ans + str.charAt(i));

        printLexo(str, i + 1, ans + str.charAt(i));
        printLexo(str, i + 1, ans);
    }
}

/*
3
ab
abc
aAb
 */