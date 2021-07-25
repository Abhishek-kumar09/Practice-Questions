//package com.codeforcause.TestApr29;
//
//import java.io.*;
//        import java.math.*;
//        import java.security.*;
//        import java.text.*;
//        import java.util.*;
//        import java.util.concurrent.*;
//        import java.util.function.*;
//        import java.util.regex.*;
//        import java.util.stream.*;
//        import static java.util.stream.Collectors.joining;
//        import static java.util.stream.Collectors.toList;
//
//class Result2 {
//
//    /*
//     * Complete the 'dynamicArray' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts following parameters:
//     *  1. INTEGER n
//     *  2. 2D_INTEGER_ARRAY queries
//     */
//
//    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
//        // Write your code here
//        List<Integer> ans = new ArrayList<>();
//        int la = 0;
//        List<List<Integer>> al = new ArrayList<>(n);
//
//        for(List<Integer> query: queries) {
//            int idx = ((query.get(1) ^ la)%n);
//            if(query.get(0) == 1) {
//                al.get(idx).add(query.get(2));
//            } else {
//                la = al.get(idx).get(query.get(2)%al.get(idx).size());
//                ans.add(la);
//            }
//        }
//
//        return ans;
//    }
//
//}
//
//class Solution {
//    public static void main(String[] args) throws IOException {
//       Result2 r2 = new Result2();
//       int
//    }
//}
