package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1로만들기_성공 {
    static int[] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
            dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 0;
        System.out.println(calc(n));

    }

    public static int calc(int n){
        if(n == 1){
            return 0;
        }
        if(dp[n] == 0) {
            if (n % 6 == 0) {
                dp[n] = Math.min(calc(n-1), Math.min(calc(n / 3), calc(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(calc(n / 3), calc(n - 1)) + 1;
            }
            else if (n % 2 == 0) {
                dp[n] = Math.min(calc(n / 2), calc(n - 1)) + 1;
            } else {
                dp[n] = calc(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
