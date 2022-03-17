package com.example.codingtest;

import java.util.Scanner;

public class Main {

    //2. 1차원 배열 평균
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tc = scan.nextInt();
        int[] arr;
        for(int i =0;i<tc;i++){
            int num = scan.nextInt();
            arr = new int[num];

            double sum = 0;

            for(int j =0;j<num;j++){
                int point = scan.nextInt();
                arr[j] = point;
                sum += point;
            }

            double avg = (sum/num);
            int count =0;

            for(int h =0;h<num;h++){
                if(avg<arr[h]){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(double)(count/num)*100);
        }
        scan.close();
    }

    //2. 1차원 배열
    /*public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] arr = new int[num];

        for(int i =0;i<num;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        scan.close();
        System.out.print(arr[0]+" "+arr[num-1]);
    }*/


    //1. for문 BufferedReader, Writer, StringBuilder
    /*public static void main(String[] args){
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            int n  = Integer.parseInt(br.readLine());

            StringTokenizer st;
            StringBuilder stringBuilder = new StringBuilder();

            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine(), " ");
                stringBuilder.append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())).append('\n');
            }
            br.close();
            System.out.print(stringBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

}
