package com.example.codingtest.dfsbfs

class Dfs {
    var count = 0
    fun solutionDfs(numbers: IntArray, target: Int): Int {
        var answer = 0
        dfs(numbers,0,target,0)
        answer = this.count
        return answer
    }

    fun dfs(numbers: IntArray, depth : Int, target: Int, result:Int){
        if(depth == numbers.size){
            if(target == result){
                this.count++
            }
            return;
        }

        var add = result+numbers[depth]
        var sub = result-numbers[depth]

        dfs(numbers,depth+1, target, add)
        dfs(numbers,depth+1, target, sub)
    }
}