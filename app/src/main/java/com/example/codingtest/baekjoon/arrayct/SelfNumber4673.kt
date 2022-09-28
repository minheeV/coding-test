package com.example.codingtest.baekjoon.arrayct

import java.lang.Exception

class SelfNumber4673 {
    fun main() {
        val sumList = arrayListOf<Int>()
        for (num in 1..10000) {
            var sum = 0
            val splitNum = num.toString().split("")
            for (i in splitNum) {
                if(i.isNotEmpty())
                    sum += i.toInt()
            }
            sum += num
            sumList.add(sum)
        }

        val sortSumList = sumList.sorted()

        for (num in 1..10000) {
            if (!sortSumList.contains(num)) {
                println(num)
            }
        }
    }
}