package com.example.codingtest;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Scanner;

public class HashPhoneList extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        solution(new String[]{"12","123","1235","567","88"});
    }

    public boolean solution1(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i = 0 ;i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }


        return answer;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(b<45){
            b+=15;
            if(a == 0){
                a=23;
            } else{
                a-=1;
            }
        }else{
            b=-45;
            if(a == 0){
                a=23;
            } else{
                a-=1;
            }
        }
        System.out.println(a+" "+b);
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0;i<phone_book.length-1;i++){
            for(int j =1;j<phone_book.length;j++){
                String next_str = phone_book[j].substring(0, phone_book[i].length());
                if(phone_book[i].equals(next_str)) {
                    answer = false;
                    break;
                }
            }
            if(!answer)
                break;
        }
        System.out.println(answer);
        return answer;
    }
}
