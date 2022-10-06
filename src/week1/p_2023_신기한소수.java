package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2023_신기한소수 {


    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int[] n = {1,10,100,1000,10000,100000,1_000_000,10_000_000};
        int std = Integer.parseInt(br.readLine())-1;

        int t = n[std]*10;
        while(n[std]<t){
            check(n[std]);
            n[std]++;
        }

    }
    public static void check(int num){
        String[] s = Integer.toString(num).split("");
        String temp = "";
        for(int i=0;i<s.length;i++){
            temp += s[i];
            if(!make_prime(Integer.parseInt(temp))){
                return;
            }
        }
        System.out.println(num);
    }


    public static boolean make_prime(int number) {
        // 0 과 1 은 소수가 아니므로 종료
        if(number < 2) {
            return false;
        }
        // 2 는 소수다
        if(number == 2) {
            return true;
        }
        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(number); i++) {
            // 소수가 아닐경우 종료
            if(number % i == 0) {
                return false;
            }
        }
        // 위 반복문에서 약수를 갖고 있지 않는경우 소수다.

        return true;
    }



}
