package com.example.codingtest.baekjoon.methodct

import java.io.BufferedReader
import java.io.InputStreamReader

class HanSu1065 {
    fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        var str = ""
        str = br.readLine()

        val num = str.toInt()
        var count = 0

        if (num < 100) {
            count = num
        } else {
            for (i in 1..num) {
                if (i < 100) {
                    count++
                } else {
                    val numList = mutableListOf<Int>()
                    var z = i
                    while (z != 0){
                        numList.add(z%10)
                        z/=10
                    }
                    if (numList[0] - numList[1] ==
                        numList[1] - numList[2]
                    ) {
                        if (numList.size < 4) {
                            count++
                        } else {
                            if (numList[1] - numList[2] ==
                                numList[2] - numList[3]
                            ) {
                                count++
                            }
                        }

                    }
                }
            }
        }
        println(count)
    }
}