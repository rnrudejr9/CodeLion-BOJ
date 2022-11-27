package week9;

import java.util.Scanner;

public class p_2xn타일링_성공 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        if(n == 1){
            System.out.println(1);
            return;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        System.out.println(dp[n]);
    }
}
