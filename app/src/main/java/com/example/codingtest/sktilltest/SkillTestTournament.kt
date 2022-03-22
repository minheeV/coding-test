package com.example.codingtest.sktilltest

import kotlin.math.ceil
import kotlin.math.log2

class SkillTestTournament {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var rr = log2(n.toDouble())
        while(answer != rr.toInt()){
            ceil(((a+1/2).toDouble()))
            ceil((b+1/2).toDouble())
            answer++
        }
        return answer
    }
}