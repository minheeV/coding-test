package com.example.codingtest.baekjoon.math

class BreakEven1712 {
    fun main() = with(System.`in`.bufferedReader()) {
        val numList = readLine().split(" ").map { it.toInt() }
        var cnt = 0
        for(i in 1..270000000){
            val value = (numList[2]*i)/(numList[0]+(numList[1]*i)).toDouble()
            println(value)
            if(value>1){
                cnt = i
                break
            } else if(value<1 && i == 270000000){
                cnt = -1
            }
        }
        println(cnt)
    }
}