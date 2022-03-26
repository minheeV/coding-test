package com.example.codingtest.greedy

class GymSuit {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        var num =n
        for(i in lost.size-1..0){
            if(i+1 <= lost.size && i-1 >= 0)
                if(!(lost[i]== reserve[i-1] || lost[i]== reserve[i+1]))

                    num-=1
        }


        return answer
    }
}