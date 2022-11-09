package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ioi 를 찾은 다음 그 다음 순찰은 적어도 선형시간에서 1단계를 앞서야됨
//왜냐면 i 다음엔 무조건 o 니까

//스트링빌더의 이퀄은 오버라이딩하지않아 주소값으로 비교함

//KMP 방식으로 반복되는 것을 얼마나 넘어 갈 것인가?

public class p_5525_ioioi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("I");
        for(int i =0 ;i<n;i++){
            sb.append("OI");
        }
        String s = br.readLine();
        int index = 0;
        int cnt =0;
        while(true){
            if(sb.length()+index > s.length()){
                break;
            }
            if( s.charAt(index) == 'I'){
                String temp =s.substring(index, index+sb.length());
                String temp2 = new String(sb);
                if(temp.equals(temp2)){
                    cnt++;
                    index++; // 값을찾아서 그다음값은 무조건 o니까
                }
            }

            index++;
        }
        System.out.println(cnt);
    }
}
