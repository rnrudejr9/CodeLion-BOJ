package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p_2023_신기한소수 {

//답은 나오는데 ,, 메모리 초과의 이유를 모르겠음
////    메모리를 줄이는 방향이 궁금함
//    //에라토스테네스의 체 --> 에러
    // 경우의수를 따지고 소수인 가능성 있는 애들로 dfs해야됨.

    //메모리 오바나는거
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder temp = new StringBuilder();

        int[] n = {1,10,100,1000,10000,100000,1_000_000,10_000_000};
        int std = Integer.parseInt(br.readLine())-1;
        int t = n[std] * 10;
        int flag = 0;
        while(n[std]<t){
            String[] s = Integer.toString(n[std]).split("");
            for(int i=0;i<s.length;i++){
                temp.append(s[i]);
                if(make_prime(Integer.parseInt(temp.toString())) && flag == 0){

                }else {
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println(n[std]);
            }else {
                flag = 0;
            }
            temp.setLength(0);
            n[std]++;
        }
    }
//   stringbudlder
//    배열에 숫자를 그렇게 넣을 필요가 없다.
//    판별이 끝나면 그수를 출력하면된다.

    public static boolean make_prime(int num) {
        // 0 과 1 은 소수가 아니므로 종료
            if (num < 2) return false;

            for (int i=2; i<=Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
    }
}
