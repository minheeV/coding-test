package com.example.codingtest.baekjoon.math

class Honeycom2292 {
    fun main() = with(System.`in`.bufferedReader()){
        val num = readLine().toInt()
        var sum = 1
        if(num == 1){
            println("1")
        } else {
            for(i in 1..num){
                sum+=6*i
                if(num<=sum){
                    println(i+1)
                    break
                }
            }
        }
    }
}