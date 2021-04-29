package com.codeforcause.TestApr29;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import static jdk.nashorn.internal.objects.Global.print;

public class RatMazeRightMost {

    private static boolean found = false;
    public static void main(String[] args ) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nm = bf.readLine();

        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);

        String[] strs = new String[n];

        for(int i = 0; i < n; i++) {
            strs[i] = bf.readLine();
        }

        path(strs, 0, 0, new int[n][m]);

        if(!found) {
            System.out.println("-1");
        }


    }

    private static void path(String[] strs, int i, int j, int[][] visited) {
        if(i == strs.length - 1 && j == strs[i].length() - 1) {
            found = true;
            visited[i][j] = 1;
            printNow(visited);
            System.exit(0);
        }

        if (j == strs[i].length() || j < 0 || i < 0 || i == strs.length || strs[i].charAt(j) == 'X' || visited[i][j] == 1) {
            return;
        }

        visited[i][j] = 1;
        path(strs, i, j+1, visited);
        path(strs, i+1, j, visited);
        visited[i][j] = 0;
    }

    private static void printNow(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
5 4
OXOO
OOOX
OOXO
XOOO
XXOO
 */
