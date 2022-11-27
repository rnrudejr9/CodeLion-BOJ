package week9;

import java.util.Scanner;
//Integer 배열 사용 -> null 값 사용 위한
//100000 이상 입력시 스택오버플로 문제발생 -> 컴파일러 설정
//기존 소스사용시 dp[2] dp[3] 접근하면 에러 -> 초기화로 문제해결
public class p_1로만들기풀이 {

    static Integer[] dp;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.print(recur(N));

    }

    static int recur(int N) {

        if (dp[N] == null) {
            // 6으로 나눠지는 경우
            if (N % 6 == 0) {
                dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
            }
            // 3으로만 나눠지는 경우
            else if (N % 3 == 0) {
                dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
            }
            // 2로만 나눠지는 경우
            else if (N % 2 == 0) {
                dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
            }
            // 2와 3으로 나누어지지 않는 경우
            else {
                dp[N] = recur(N - 1) + 1;
            }
        }
        return dp[N];
    }

}