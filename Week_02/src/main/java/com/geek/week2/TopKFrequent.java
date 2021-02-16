package com.geek.week2;

import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> deque = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        for(Integer key : map.keySet()){
            if(deque.size()<k){
                deque.add(key);
            }else if(map.get(key)>map.get(deque.peek())){
                deque.poll();
                deque.add(key);
            }
        }
        int[] temp = new int[k];
        int i =0;
        while (!deque.isEmpty()){
            temp[i++] = deque.poll();
        }
        return temp;

    }
}
