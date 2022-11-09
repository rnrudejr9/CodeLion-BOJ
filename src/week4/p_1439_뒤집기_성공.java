package week4;

import java.util.Scanner;

//처음 접근법
//문자열을 입력받고 0이 나올때까지 탐색
//0을 찾고 다음 1이 나올때까지 탐색
//그 구간을 뒤집고 다시 0을 탐색

//0 구간 카운트 1구간 카운트 해서 구간이 작은 값을 출력하면 해결

public class p_1439_뒤집기_성공 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean triger = false;
        char std = s.charAt(0);

        int one = 0;
        int zero = 0;

        if(std == '1'){
            one++;
        }else{
            zero++;
        }
        for(int i =1 ;i<s.length();i++){
            if(s.charAt(i) != std){
                std = s.charAt(i);
                if(std == '1'){
                    one++;
                }else if(std == '0'){
                    zero++;
                }
            }
        }
        System.out.println(Math.min(one,zero));

    }
}
