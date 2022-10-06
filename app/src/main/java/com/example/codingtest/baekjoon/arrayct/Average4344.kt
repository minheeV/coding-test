package com.example.codingtest.baekjoon.arrayct

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class Average4344 {
    fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val tcCount = br.readLine().toInt() // tc 수
        val scoreArray = mutableListOf<List<String>>() // 학생 수 , 점수

        for (cnt in 0 until tcCount) {
            val list = br.readLine().split(" ")
            scoreArray.add(list)
        }

        /*for (cnt in 0 until tcCount) {
            val st = StringTokenizer(br.readLine()," ")
            val list = mutableListOf<String>()
            for(i in 0  until st.countTokens()){
                list.add(st.nextToken())
            }
            val list1 = br.readLine().split(" ")
            scoreArray.add(list)
        }*/

        var scoreSum = 0

        for (scoreArr in scoreArray) {
            for (sum in 1 until scoreArr.size){
                scoreSum += scoreArr[sum].toInt()
            }

            var excess = 0
            for(i in 1 until scoreArr.size){
                println("${scoreArr[i].toDouble()} 확인")
                if(scoreArr[i].toDouble()>scoreSum/scoreArr[0].toInt()){
                    excess++
                }
            }

            val result =
                String.format("%.3f", excess / scoreArr[0].toDouble() * 100.000)
            println("$result%")
            scoreSum=0
        }
    }

}