package com.example.codingtest.skilltest.Level2;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

public class SkillTestLev2 extends AppCompatActivity {

    public int[] solution(int n, String[] words) {
        int[] answer = {};
        int num = 0;
        String[] wo = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            wo[i] = words[i];
            if (Collections.frequency(Arrays.asList(wo), words[i]) == 1) {
                if (i + 1 < words.length)
                    if(words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)){
                        num =i;
                    }
                num = i;
            }
        }

        if(num==0){
            answer = new int[]{0, 0};
        }else{
            int numo = (num+1)/n; // 턴 수
            int nww = (num+1)%n; // 사람
            if(numo != 0){
                numo += 1;
            }
            if(nww== 0){
                nww = n;
            }
            answer = new int[]{nww, numo};
        }
        return answer;
    }
}