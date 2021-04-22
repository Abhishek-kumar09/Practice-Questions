package com.codeforcause.proioryQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,1,2,1,2,3,1,2,1,1,2,2,1,1,1,1,1};

        System.out.println(Arrays.toString(topKFrequent(arr, 3)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num: nums) {
            hm.merge(num, 1, Integer::sum);
        }

        PriorityQueue<Integer> pq = new PriorityQueue(Comparator.comparingInt(hm::get));

        for(int key: hm.keySet()) {
            pq.offer(key);

            if(pq.size() > k ){
                pq.remove();
            }
        }

//        System.out.println(pq);

//        int[] array = pq.stream().mapToInt(i -> i).toArray();
        return pq.stream().mapToInt(i -> i).toArray();

    }
}
