package week4;

//반 접으면 똑같냐

//홀수, 짝수개로 차이구별
//체크배열


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1213_팬린드롬만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alpha = new int[26];
        for(int i =0;i<s.length();i++){
            int n = s.charAt(i)-65;
            alpha[n] += 1;
        }
        if(s.length() % 2 == 0){

        }else{

        }
    }
}
