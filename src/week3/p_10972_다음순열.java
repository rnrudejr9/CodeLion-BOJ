package week3;

//접근법
//DFS를 이용한 전체순열탐색

import java.util.Scanner;

public class p_10972_다음순열 {
    static int[] arr;
    static int[] now;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        visit = new boolean[n];
        for(int i = 0; i<n;i++){
            arr[i] = i+1;
        }

    }

    public static void DFS(int index){

    }
}
