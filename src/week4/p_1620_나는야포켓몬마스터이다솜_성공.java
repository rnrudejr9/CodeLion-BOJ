package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//한줄씩 입력 받아서 Map 에 Key, value로 저장
//값 출력할때 입력받은 값이 정수인지 문자열인지 판별하는 논리
//1차수정 : 시간초과 아무래도 찾는과정에서 선형시간이 좀 걸릴것으로 판단
// * map 두개를 선언해서 시간 단축시도

public class p_1620_나는야포켓몬마스터이다솜_성공 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");

        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        for(int i = 0;i<n;i++){
            String str = br.readLine();
            map1.put(str,i+1);
            map2.put(i+1,str);
        }

        for(int i =0;i<m;i++){
            String str = br.readLine();
            boolean integerOrNot = str.matches("-?\\d+");
            if(integerOrNot){//숫자일경우
                int find = Integer.parseInt(str);
                System.out.println(map2.get(find));
            }else{//숫자 아닐경우
                System.out.println(map1.get(str));
            }
        }
    }
}
