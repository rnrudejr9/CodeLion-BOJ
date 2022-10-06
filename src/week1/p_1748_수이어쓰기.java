package week1;

import java.util.Scanner;

public class p_1748_수이어쓰기 {
//    규칙이
//    1~9 = 1*9
//    10~99 = 2*90
//    100~999 = 3*900
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int target = 1; //현재 위치
        int plus = 1; //자리수별 플러스 비율
        int cnt = 0;
        int length = 1; // 자리수
        while (true){
            if(target > n){
                break;
            }
            if(target==length*10-1){
                cnt+=plus;
                length *= 10;
                plus = plus+1;
            }else {
                cnt = cnt+plus;
            }

            target++;

        }
        System.out.println(cnt);

    }
}
