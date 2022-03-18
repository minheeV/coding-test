package com.example.codingtest.sktilltest

import androidx.appcompat.app.AppCompatActivity

class SkillCheckLev2 : AppCompatActivity() {






    fun solutionFibonacci(n: Int): Int {
        return fibo(n) % 1234567
    }

    fun fibo(num:Int):Int{
        return if(num<=1){
            num
        } else{
            fibo(num-2) + fibo(num-1)
        }
    }

    fun solutionCarpet(brown: Int, yellow: Int): IntArray {
        val answer = IntArray(2)
        val total = brown+yellow
        var count=0
        for(i in 1 until total+1){
            if(total%i == 0){
                count++
            }
        }

        val arr = IntArray(count)
        count= 0
        for(i in 1 until total+1){
            if(total%i == 0){
                arr[count] = i
                count++
            }
        }

        val center = arr.size/2
        if(arr.size%2==0){
            answer[0] = arr[center]
            answer[1] = arr[center-1]
        }else{
            answer[0] = arr[center]
            answer[1] = arr[center]
        }
        return answer
    }
}