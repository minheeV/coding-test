package com.example.codingtest.baekjoon.arrayct

class count10807 {
    fun main() = with(System.`in`.bufferedReader()) {
        var m = readLine().toInt()
        var numberList = readLine().split(" ").map { it.toInt() }
        var a = readLine().toInt()
        var cnt = 0;
        for (i in numberList) {
            if (i == a)
                cnt++
        }
        println(cnt)
    }
}