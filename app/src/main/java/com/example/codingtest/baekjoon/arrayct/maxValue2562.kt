package com.example.codingtest.baekjoon.arrayct

class maxValue2562 {
    fun main() = with(System.`in`.bufferedReader()){
        var numList = mutableListOf<Int>()
        for (i in 1..9){
            numList.add(readLine().toInt())
        }
        val maxNum = numList.maxOf { it }
        var cnt = 0
        println(maxNum)
        for(num in numList){
            cnt++
            if(maxNum == num)
                break
        }
        println(cnt)
    }
}