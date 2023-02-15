package com.example.codingtest.skilltest.Level1

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var input = mutableListOf<Int>()
        for(i in score.indices){
            input.add(i, score[i])
            if(input.size<k){
                answer.add(i, input.sortedDescending()[i])
            } else {
                answer.add(i, input.sortedDescending()[k-1])
            }
        }
        return answer.toIntArray()
    }
}