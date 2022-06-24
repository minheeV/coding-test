package com.example.codingtest.skilltest.Level2

import java.util.*

class SkillTestReturn {
    fun solution(s: String): Int {
        var answer: Int = -1
        return if(s.length%2==0){
            var queue : Queue<Char> = LinkedList()
            for(i in s){
              queue.add(i)
            }
            for(j in s.indices){
                queue.add(queue.element())
                queue.poll()
            }
            0
        } else{
            0
        }


    }
}