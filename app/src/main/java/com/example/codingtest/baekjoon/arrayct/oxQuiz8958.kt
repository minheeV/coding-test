package com.example.codingtest.baekjoon.arrayct

import java.io.BufferedReader
import java.io.InputStreamReader

class oxQuiz8958 {
    fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val tcCount = br.readLine().toInt() // tc 수
        val testList = mutableListOf<CharArray>()

        for (i in 0 until tcCount) {
            testList.add(br.readLine().toCharArray())
            var sum = 0
            var cnt = 0
            testList[i].forEachIndexed { index, c ->
                if (c.toString() == "O") {
                    cnt++
                    sum += cnt
                } else if (c.toString() == "X") {
                    cnt = 0
                }
            }
            println(sum)
        }

    }
}