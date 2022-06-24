package com.example.codingtest.skilltest.Level2

import java.util.*

class SkillTest2괄호회전하기 {
    /*
    다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.

    (), [], {} 는 모두 올바른 괄호 문자열입니다.
    만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다.
    예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
    만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다.
     예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
    대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다.
    이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.

    s	       result
    "[](){}"	 3
    "}]()[{"	 2
    "[)(]"	     0
    "}}}"	     0

    문제 해결 1.
    먼저 체크하고 회전
    우선 하나씩 회전 시킬 수 있어야한다 큐를 만들어서 [](){}순으로 쌓는다
    다음 [를 빼고 맨뒤로

    */
    fun solution1(s: String): Int {
        var answer: Int = -1
        var temp = s
        for(i in s.indices){
            var stk = Stack<Char>()
            for(ch in temp){
                if(ch == '[' || ch == '{'|| ch == '('){
                    stk.push(ch)
                } else if(stk.empty()){
                    stk.push(ch)
                } else{
                   // if ((stk.peek() == '[' && ch == ']') || (stk.peek()))
                }
            }
        }

        return answer
    }
}
