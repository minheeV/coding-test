package com.example.codingtest.baekjoon.math

class BreakEven1712 {
    fun main() = with(System.`in`.bufferedReader()) {
        val numList = readLine().split(" ").map { it.toInt() }
        if (numList[1] >= numList[2]) {
            println("-1")
        } else {
            val cnt = numList[0] / (numList[2] - numList[1])
            if (numList[2] * cnt > numList[0] + numList[1] * cnt) {
                println(cnt)
            } else {
                println(cnt + 1)
            }
        }
    }
}