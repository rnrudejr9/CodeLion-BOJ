package week1;

import java.util.Scanner;

public class p_1057_토너먼트_성공 {
   static int cnt;
   static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a != b){
            a = calc(a);
            b = calc(b);
            cnt++;
        }
        System.out.println(cnt);
    }
    public static int calc(int temp){
        temp = (temp/2) + (temp%2);
        return temp;
    }
    // 1. 배열로 풀려고 하니 홀수 짝수 일때마다의 경우의수가 커지고
    // resize하기에 소요시간이 큰 부담이 된다.
    // 수학적 접근하여 index/2 + index%2 값이 nextindex가 됨.

}
