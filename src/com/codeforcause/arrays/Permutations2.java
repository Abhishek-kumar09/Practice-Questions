package com.codeforcause.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Permutations2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2};
        System.out.println(permuteUnique(arr));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }

//    private static List<List<Integer>> m2(int[] nums, HashMap<Integer, Integer> hm) {
////        if(nums.length == al.size()) {
////            list.add(new ArrayList<>(al));
////            return;
////        }
//
//        List<List<Integer>> list = new ArrayList<>();
//
//        for(int num : nums) {
//            hm.merge(num, 1, Integer::sum);
//        }
//
//        ArrayList<Integer> al =  new ArrayList<>();
//
//        for(int keys : hm.keySet()) {
//            ArrayList<Integer> al2 = new ArrayList<>();
//            al2.add(keys);
//
//            for(int num : al) {
//                al2.add(num);
//            }
//        }
//    }
}
