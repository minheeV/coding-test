package com.example.codingtest.baekjoon.math

class max10757 {
    fun main() = with(System.`in`.bufferedReader()) {
        var numList = readLine().split(" ").map { it.toBigDecimal() }.reduce { acc, i -> acc + i }
        println(numList)
    }
}