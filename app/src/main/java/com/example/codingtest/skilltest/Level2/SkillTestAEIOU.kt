package com.example.codingtest.skilltest.Level2
/*
* 문제 설명
사전에 알파벳 모음 'A', 'E', 'I', 'O', 'U'만을 사용하여 만들 수 있는, 길이 5 이하의 모든 단어가 수록되어 있습니다. 사전에서 첫 번째 단어는 "A"이고, 그다음은 "AA"이며, 마지막 단어는 "UUUUU"입니다.

단어 하나 word가 매개변수로 주어질 때, 이 단어가 사전에서 몇 번째 단어인지 return 하도록 solution 함수를 완성해주세요.

제한사항
word의 길이는 1 이상 5 이하입니다.
word는 알파벳 대문자 'A', 'E', 'I', 'O', 'U'로만 이루어져 있습니다.
입출력 예
word	result
"AAAAE"	6
"AAAE"	10
"I"	1563
"EIO"	1189
입출력 예 설명
입출력 예 #1

사전에서 첫 번째 단어는 "A"이고, 그다음은 "AA", "AAA", "AAAA", "AAAAA", "AAAAE", ... 와 같습니다. "AAAAE"는 사전에서 6번째 단어입니다.

입출력 예 #2

"AAAE"는 "A", "AA", "AAA", "AAAA", "AAAAA", "AAAAE", "AAAAI", "AAAAO", "AAAAU"의 다음인 10번째 단어입니다.

입출력 예 #3

"I"는 1563번째 단어입니다.

입출력 예 #4

"EIO"는 1189번째 단어입니다.
*
* */

/*
*  fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        var visit = mutableListOf<Int>()

        for(node in 0 until n){
            if(!visit.contains(node)){
                dfs(visit, node, computers)
                answer++
            }
        }

        return answer
    }

    private fun dfs(visit : MutableList<Int>, node : Int, routine : Array<IntArray>){
        visit.add(node)
        routine[node].forEachIndexed { idx, arr ->
            if(!visit.contains(idx) && arr == 1){
                dfs(visit, idx, routine)
            }
        }
    }*/
class SkillTestAEIOU {
    var arr = arrayOf("A", "E", "I", "O","U")

    fun solution(word: String): Int {
        var answer = 0
        var visit = mutableListOf<String>()
        for(i in arr){
            if(!visit.contains(i)){
                dfs(word, visit,i)
            }
        }
        return answer
    }

    fun dfs(word: String, visit : MutableList<String>,i : String ){
        visit.add(i)
        arr.forEachIndexed { index, s ->
            if(word){

            }else if(word == s){
                return
            }

        }
    }
}