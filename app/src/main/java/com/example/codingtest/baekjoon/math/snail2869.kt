package com.example.codingtest.baekjoon.math

import java.io.BufferedReader
import java.io.InputStreamReader

class snail2869 {
    fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
        val numList = readLine().split(" ").map { it.toInt() }
        var sum = 0
        var cnt = 0
        val a = numList[0]
        val b = numList[1]
        val c = numList[2]
        while (true) {
            cnt++
            sum += a
            if (sum >= c) {
                println(cnt)
                break
            }
            sum -= b
            if (sum >= c) {
                println(cnt)
                break
            }
        }
    }
}