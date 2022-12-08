package com.example.codingtest.baekjoon.arrayct

class xMinNum10871 {
    fun main() = with(System.`in`.bufferedReader()) {
        var cntList = readLine().split(" ").map { it.toInt() }
        var numList = readLine().split(" ").map { it.toInt() }
        var result = ""
        for(i in 0 until cntList[0]){
            if(cntList[1]> numList[i])
                result = result + numList[i] + " "
        }
        println(result.substring(0, result.length-1))
    }
}