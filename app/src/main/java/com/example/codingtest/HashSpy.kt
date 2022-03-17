package com.example.codingtest;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HashSpy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 0
        var map = clothes.groupBy { (_, type) -> type }

        //.values
            //.fold(1) { acc, v -> acc * (v.size + 1) } - 1

        return answer
    }

}