package 연습문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class p_SWEA_최대상금 {
    static int cnt,res;
    static int[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for (int tc = 1; tc < T+1; tc++) {
            st = new StringTokenizer(br.readLine());
            String num = st.nextToken();

            //옮기는 횟수
            cnt = Integer.parseInt(st.nextToken());

            //옮기는 횟수는 숫자판의 길이만큼이면 전부 옮길 수 있음
            if(cnt > num.length())
                cnt = num.length();

            list = new int[num.length()];

            for (int i = 0; i < num.length(); i++)
                list[i] = num.charAt(i) - '0';

            res = 0;
            dfs(0, 0);

            System.out.println("#" + tc + " " + res);

        }
    }


    public static void dfs(int start, int depth){

        if (depth == cnt){
            int sum = 0;
            String temp = "";
            for (int i = 0; i < list.length; i++) {
                temp += Integer.toString(list[i]);
            }
            sum = Integer.parseInt(temp);


            res = Math.max(res, sum);
            return;
        }



        for (int i = start; i < list.length-1; i++) {
            for (int j = i+1; j < list.length; j++) {

                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;

                dfs(i,depth +1);

                temp = list[i];
                list[i] = list[j];
                list[j] = temp;

            }
        }
    }

}