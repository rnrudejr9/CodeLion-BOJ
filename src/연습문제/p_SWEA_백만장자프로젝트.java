package 연습문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//접근법
//값이 떨어지는 그 사이를 찾아내고, 또는 마지막에 도달할 시
//드롭이 되면 삿던 cost , count 만큼 판매

//디피문제  
////
//1 3 5 7 2 1 3
//1 1 1 0 3
//
//1 1 0 1 1 2 1 1 7 5 2
//1 1 2 1 1 7 3 1

public class p_SWEA_백만장자프로젝트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(T>0){
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] arr= new int[n];
            for(int i = 0; i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int std = arr[0];
            for(int i =1; i<n;i++){
                if(std < arr[i]){

                }
            }

            T--;
        }
    }

    public void calc(){

    }
}
