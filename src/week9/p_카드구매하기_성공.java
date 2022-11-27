package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_카드구매하기_성공 {
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
        dp[0] = arr[0] = 0;
        dp[1] = arr[1];
        System.out.println(calc(n));
    }
    public static int calc(int n){
        if(dp[n]>0){
            return dp[n];
        }
        dp[n] = arr[n];
        for(int i =1;i<=n/2;i++) {
            dp[n] = Math.min(dp[n], calc(n - i) + calc(i));
        }

        return dp[n];
    }
}
