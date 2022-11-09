package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class p_5052_전화번호목록_성공 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T > 0){

            int n = Integer.parseInt(br.readLine());
            String[] str =new String[n];
            for(int i = 0;i<n;i++){
                str[i] = br.readLine();
            }
            if(solution(str)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            T--;
        }
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        for (String s : phone_book) {
            set.add(s);
        }
        int cnt = 0;
        for (String num: phone_book){
            for (int i = 1; i < num.length(); i++) {
                if (set.contains(num.substring(0, i))){
                    answer = false;
                }
            }
        }
        return answer;
    }
}
