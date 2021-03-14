package com.geek.week6;

import java.util.Arrays;

/**
 * 任务调度器
 * https://leetcode-cn.com/problems/task-scheduler/solution/ren-wu-diao-du-qi-by-leetcode-solution-ur9w/
 */
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] temp = new int[26];
        for(char c : tasks){
            temp[c-'A']++;
        }
        Arrays.sort(temp);
        int i = 25;
        while (i>=0 && temp[i] ==temp[25]){
            i--;
        }

        return Math.max(tasks.length,(temp[25]-1)*(n+1)+25-i);
    }
}
