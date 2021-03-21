package com.geek.week7;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 * https://leetcode-cn.com/problems/generate-parentheses/
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list,"",0,0,n);
        return list;

//        List<List<String>> res = new LinkedList<>();
//        res.add(new LinkedList<>(Arrays.asList("")));
//        res.add(new LinkedList<>(Arrays.asList("()")));
//        for(int i =2;i<=n;i++){
//            List<String> temp = new LinkedList<>();
//            for(int j=0;j<i;j++){
//                List<String> str1 = res.get(j);
//                List<String> str2 = res.get(i-j-1);
//                for(String s1 : str1){
//                    for(String s2 : str2){
//                        String str = "(" +s1+")"+s2;
//                        temp.add(str);
//                    }
//                }
//            }
//            res.add(temp);
//        }
//        return res.get(n);
    }

    private void backtrack(List list,String str,int open,int close,int max){
        if(str.length() ==max*2){
            list.add(str);
            return;
        }
        if(open < max){
            backtrack(list,str+"(",open+1,close,max);
        }
        if(close<open){
            backtrack(list,str+")",open,close+1,max);
        }
    }
}
