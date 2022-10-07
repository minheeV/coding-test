package com.example.codingtest.baekjoon.arrayct

class TheRest3052 {
    fun main() = with(System.`in`.bufferedReader()){
        val theRestList = mutableListOf<Int>()
        for(i in 1..10){
            var num = readLine().toInt()%42
            if(!theRestList.contains(num)){
                theRestList.add(num)
            }
        }
        println(theRestList.size)
    }
}