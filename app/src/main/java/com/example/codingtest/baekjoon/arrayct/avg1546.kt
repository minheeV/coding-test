package com.example.codingtest.baekjoon.arrayct

class avg1546 {
    fun main() = with(System.`in`.bufferedReader()){
        val cnt = readLine().toInt()
        val scoreList = readLine().split(" ").map { it.toDouble() }

        val max = scoreList.maxOf { it }
        var sum = 0.0
        for(score in scoreList){
            sum += score/max*100
        }
        println(sum/cnt)
    }
}