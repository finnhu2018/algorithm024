package com.geek.week2;

public class UglyNumber {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] temp = new int[n];
        temp[0] = 1;
        for (int i = 1; i < n; i++) {
            int n2 = temp[a] * 2, n3 = temp[b] * 3, n5 = temp[c] * 5;
            temp[i] = Math.min(Math.min(n2, n3), n5);
            if (temp[i] == n2) {
                a++;
            }
            if (temp[i] == n3) {
                b++;
            }
            if (temp[i] == n5) {
                c++;
            }
        }
        return temp[n - 1];
    }
}
