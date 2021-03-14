package com.geek.week6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 青蛙过河
 * https://leetcode-cn.com/problems/frog-jump/
 */
public class FrogJump {
    public boolean canCross(int[] stones) {
        if(stones == null || stones.length<1){
            return false;
        }
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            map.put(stones[i],new HashSet<Integer>());
        }
        map.get(0).add(0);
        for (int i = 0; i < stones.length; i++) {
            for (int k : map.get(stones[i])){
                for (int j = k-1; j <=k+1 ; j++) {
                    if(j>0 && map.containsKey(stones[i]+j)){
                        map.get(stones[i]+j).add(j);
                    }
                }
            }
        }
        return map.get(stones[stones.length-1]).size()>0;







    }
}
