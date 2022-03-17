package com.example.codingtest;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class StackQueDev : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = IntArray(progresses.size)
        for(i in progresses.indices){
            answer[i] = (100-progresses[i])/speeds[i]
        }

        for(j in answer.indices){
            if(answer[j]!=0){
                println(j)
                for(h in j+1 until answer.size){
                    println(j)
                    if(answer[j]>answer[h]){
                        answer[h]=0
                    }else{
                        break
                    }
                }
            }else{
                break
            }
        }

        var innn = IntArray(answer.count{it>0 })


        for(g in answer.indices){
            if(answer[g]==0){
                answer[g-1]++

            } else{
                answer[g]=1
            }
        }

        println(answer)
        return answer
    }
}