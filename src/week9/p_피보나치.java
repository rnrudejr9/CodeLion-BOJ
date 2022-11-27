package week9;

import java.util.Scanner;

public class p_피보나치 {
    static long[] dp;
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            dp = new long[n + 1];

            System.out.println(calc(n));
    }

    public static long calc(int n){
        if(dp[n] > 0){
            return dp[n];
        }

        if(n == 0){
            return dp[n] = 0;
        }
        else if(n == 1){
            return dp[n] = 1;
        }
        else {
            return dp[n] = calc(n-1) + calc(n-2);
        }
    }
}
