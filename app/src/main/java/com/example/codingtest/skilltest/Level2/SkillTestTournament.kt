package com.example.codingtest.skilltest.Level2

import kotlin.math.ceil
import kotlin.math.log2

class SkillTestTournament {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var x = a
        var y = b
        var rr = log2(n.toDouble())
        println(rr)
        for(i in 1..rr.toInt()){
            x = ceil((x/2).toDouble()).toInt()
            y = ceil((y/2).toDouble()).toInt()
            println(x)
            println(y)
            if(x==y){
                answer=i
                break
            }
        }
        return answer
    }
/*    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var rr = log2(n.toDouble())
        while(answer != rr.toInt()){

            ceil(((a+1/2).toDouble()))
            ceil((b+1/2).toDouble())
            answer++
        }
        return answer
    }*/
}