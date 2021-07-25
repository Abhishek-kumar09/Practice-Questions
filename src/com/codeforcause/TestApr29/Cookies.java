package com.codeforcause.TestApr29;

import java.util.*;

public class Cookies {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(10);
        list.add(12);
        Collections.sort(list);
        System.out.println(cookies(7, list));

    }

    public static int cookies(int k, List<Integer> A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(A);
        int count = 0;

        while(pq.peek() < k) {
            pq.add(pq.remove() + 2 * pq.remove());
            count++;
        }

        return count;
    }
}
