package com.example.codingtest.sktilltest

import java.util.*

class SkillTest2 {
    /*
    * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
* */
    fun solution(s: String): String {
        val answer = s.split(" ").map { it.toInt()}.sorted()
        return answer[0].toString()+ " " +answer[answer.size-1]
    }

    /*
    다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.

(), [], {} 는 모두 올바른 괄호 문자열입니다.
만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.
     */
    fun solution1(s: String): Int {
        var answer: Int = -1
        var stack = Stack<Char>()

        for(str in s){
            when(str){
                '[' -> stack.push(str)
                ']' -> if(stack.peek()!='[')
                        stack.push(str)
                '{' -> stack.push(str)
                '}' -> stack.push(str)
                '(' -> stack.push(str)
                ')' -> stack.push(str)


            }
        }
        return answer
    }
}