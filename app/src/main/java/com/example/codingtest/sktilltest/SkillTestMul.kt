package com.example.codingtest.sktilltest

/*
2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
곱할 수 있는 배열만 주어집니다.
입출력 예

arr1	                                 arr2	                          return
[[1, 4], [3, 2], [4, 1]]	         [[3, 3], [3, 3]]	                  [[15, 15], [15, 15], [15, 15]]
[[2, 3, 2], [4, 2, 4], [3, 1, 4]]	 [[5, 4, 3], [2, 4, 1], [3, 1, 1]]	  [[22, 22, 11], [36, 28, 18], [29, 20, 14]]
*/

class SkillTestMul {

    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array(arr1.size) { IntArray(arr2[0].size) }
        var value= 0
        if(arr1[0].size == arr2.size){
            for( i in arr1.indices) {
                for (j in 0 until arr2[0].size ) {
                    for(k in arr2.indices) {// sum
                        value += arr1[i][k] * arr2[k][j]
                    }
                    answer[i][j] = value
                }
            }
        }

        /*aswer[0][0] = arr1[0][0]* arr2[0][0] +anrr1[0][1]*arr2[1][0]
        answer[0][1] = arr1[0][0]* arr2[0][1] +arr1[0][1]*arr2[1][1]
        answer[1][0] = arr1[0][1]* arr2[0][0] +arr1[1][1]*arr2[1][0]
        answer[1][1] = arr1[0][1]* arr2[0][1] +arr1[1][1]*arr2[1][1]
        answer[2][0] = arr1[0][2]* arr2[0][0] +arr1[2][1]*arr2[1][0]
        answer[2][1] = arr1[0][2]* arr2[0][1] +arr1[2][1]*arr2[1][1]*/

        return answer
    }
}
