package com.geek.week2;

import java.util.*;

/**
 * 字母异位词分组
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, List<String>> map = new HashMap();
//        for(String s : strs){
//            char[] chars = s.toCharArray();
//            Arrays.sort(chars);
//            String key = new String(chars);
//            List<String> list = map.getOrDefault(key, new ArrayList<String>());
//            list.add(s);
//            map.put(key, list);
//        }
//        return new ArrayList<List<String>>(map.values());
        Map<Integer, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int getHash = hash(strs[i]);
            List<String> list = map.getOrDefault(getHash, new ArrayList<String>());
            list.add(strs[i]);
            map.put(getHash, list);
        }
        return new ArrayList<List<String>>(map.values());

    }

    public int hash(String s){
        int length = s.length();
        if(length == 0){
            return 0;
        }
        int res = 0;
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            res = res + 5*c*c*c/26 + c*1009 - c*c*997;
        }
        return res;
    }


}
