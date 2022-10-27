package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//데큐에서 뒤에 값을 뺴고 앞에다 넣는 방법을 모르겠음

public class p_5430_AC {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        while(T>0){
            System.out.println(calc());
            T--;
        }

    }
    public static String calc() throws IOException {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        String[] cmd = br.readLine().split("");
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        str = str.replaceAll("\\[", ""); //괄호를 지운다(역슬래시 특수문자 지정)
        str = str.replaceAll("\\]", ""); //괄호를 지운다(역슬래시 특수문자 지정)
        String [] temp = str.split(",");

        for(int i =0;i<n;i++){
            dq.add(Integer.parseInt(temp[i]));
        }


        for(int i =0;i<cmd.length;i++){
            if(cmd[i].equals("R")){

            }else if(cmd[i].equals("D")){
                if(dq.isEmpty()){
                    return "error";
                }else{
                    dq.pollFirst();
                }
            }
        }

        return Arrays.toString(dq.toArray());
    }
}
