package com.geek.week4;

/**
 * https://leetcode-cn.com/problems/lemonade-change/description/
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five =0;int ten =0;
        for(int bill : bills){
            if(bill ==5){
                five ++;
            } else if(bill == 10){
                ten++;
                five--;
            }else if(ten>0){
                five--;
                ten--;
            }else {
                five -=3;
            }
            if(five<0){
                return false;
            }
        }
        return true;
    }
}
