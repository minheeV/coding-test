package com.example.codingtest.baekjoon.math

import java.io.BufferedReader
import java.io.InputStreamReader

class Fraction1193 {
    fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
        val num = readLine().toInt()
        var sum = 0

        for (i in 1..num) {
            var denominator = 0
            var numerator = 0
            sum += i
            if (sum >= num) {
                val d = i-(sum-num) // 번째
                if(i%2==0){
                    denominator = d
                    numerator = i-d+1
                }else{
                    denominator = i-d+1
                    numerator = d
                }
                println("${denominator}/${numerator}")
                break
            }
        }
    }
}