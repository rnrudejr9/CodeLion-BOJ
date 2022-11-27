package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p_카드구매하기 {
    static int[] dp;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        dp = new int[n+1];
        arr = new int[n+1];
        for(int i =1;i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 0;
        arr[0] = 0;
        System.out.println(calc(n));
    }
    public static int calc(int n){
        if(n == 1){
            return dp[1] = arr[1];
        }
        if(dp[n]>0){
            return dp[n];
        }

        

        return dp[n];
    }
}
