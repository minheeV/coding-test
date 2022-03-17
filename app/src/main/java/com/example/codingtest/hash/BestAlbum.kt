package com.example.codingtest.hash


import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.math.min


class BestAlbum {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        var playsIdx = HashMap<String,HashMap<Int, Int>>()

        genres.forEachIndexed{idx,genre->
            if (playsIdx.containsKey(genre)) {
                playsIdx[genre]!![idx] = plays[idx]
            } else{
                var playMap = HashMap<Int, Int>()
                playMap[idx] = plays[idx]
                playsIdx[genre]  = playMap
            }
        }

        playsIdx = playsIdx.toList().sortedWith(compareByDescending {
            it.second.values.sum()
        }).toMap() as HashMap<String, HashMap<Int, Int>>

        var count = 0
        var value = 0

        var answer = IntArray(0)

        for(genre in playsIdx.keys){
            if(playsIdx[genre]!!.keys.toList().size == 1){
                answer[count] = playsIdx[genre]!!.keys.toList()[0]
                count++
            } else{
                playsIdx[genre] = playsIdx[genre]!!.toList().sortedByDescending {
                    it.second
                }.toMap() as HashMap<Int, Int>
                answer[count] = playsIdx[genre]!!.keys.toList()[0]
                answer[count+1] = playsIdx[genre]!!.keys.toList()[1]
                count+=2
            }
        }
        return answer
    }
/*    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        var playsIdx = HashMap<String,HashMap<Int, Int>>()

        genres.forEachIndexed{idx,genre->
            if (playsIdx.containsKey(genre)) {
                playsIdx[genre]!![idx] = plays[idx]
            } else{
                var playMap = HashMap<Int, Int>()
                playMap[idx] = plays[idx]
                playsIdx[genre]  = playMap
            }
        }

        var answer = IntArray(playsIdx.keys.count()*2)

        playsIdx = playsIdx.toList().sortedWith(compareByDescending {
            it.second.values.sum()
        }).toMap() as HashMap<String, HashMap<Int, Int>>

        var count =0
        for(genre in playsIdx.keys){
            playsIdx[genre] = playsIdx[genre]!!.toList().sortedByDescending {
                it.second
            }.toMap() as HashMap<Int, Int>
            if(playsIdx[genre]!!.keys.toList().size == 1){
                answer[count] = playsIdx[genre]!!.keys.toList()[0]
                count++
            } else{
                answer[count] = playsIdx[genre]!!.keys.toList()[0]
                answer[count+1] = playsIdx[genre]!!.keys.toList()[1]
                count+=2
            }
        }

        return answer
    }*/
}