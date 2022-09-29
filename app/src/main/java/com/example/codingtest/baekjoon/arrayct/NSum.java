package com.example.codingtest.baekjoon.arrayct;

public class NSum {
    long sum(int[] a) {
        long ans = 0;
        for(int i : a){
            ans+=i;
        }
        return ans;
    }
}
