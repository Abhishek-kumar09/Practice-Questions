package com.codeforcause.dp;

import java.util.HashSet;
import java.util.PriorityQueue;

public class UglyBumber {
    public static void main(String[] args) {
        System.out.println(getNthUglyNo(150));
    }

    static long getNthUglyNo(int n) {
        if(n < 6) {
            return n;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1); hs.add(2); hs.add(3); hs.add(5);
        pq.add(1); pq.add(2); pq.add(3); pq.add(5);
        int rem = 0;
        while(hs.size() < n) {
            rem = pq.remove();
            hs.add(rem);
            pq.add(rem*2);
            pq.add(rem*3);
            pq.add(rem*5);
        }

        return rem;
    }

}
