package com.example.codingtest.baekjoon.arrayct

import java.lang.Math.round
import java.util.*
import kotlin.math.roundToInt

class Average4344 {
    fun main() = with(Scanner(System.`in`)) {
        val tcCount = nextInt() // tc 수
        val scoreArray = mutableListOf<Array<Int>>() // 학생 수 , 점수

        for (cnt in 0..tcCount) {
            var c = nextInt()
            var sc : Array<Int>? = arrayOf()
            for(i in 0 until c){
                sc?.set(i, nextInt())
            }
            if (sc != null) {
                scoreArray.add(sc)
            }
        }

        var scoreSum = 0
        var scoreAvg = 0

        for (scoreArr in scoreArray) {
            for (sum in 1 until scoreArr.size){
                scoreSum += scoreArr[sum]
            }
            scoreAvg = scoreSum/scoreArr[0]
            val excess =  scoreArr.count {
                it>scoreAvg
            }

            val result =
                String.format("%.4f", excess / scoreArr[0].toDouble() * 100).toDouble()
                    .roundToInt()
            println("$result%")
        }
    }

}