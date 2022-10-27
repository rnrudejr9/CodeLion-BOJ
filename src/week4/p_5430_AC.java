package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//데큐에서 뒤에 값을 뺴고 앞에다 넣는 방법을 모르겠음
//결국 스택과 큐를 활용해서 뒤집기 삭제 연산 구현

//1차수정 : 시간초과 뒤집는 연산을 어떻게 처리할까
//* Arraylist 와 Collections 활용
//2차수정 : 시간초과 배열에 인덱스를 두어서 R나오면 커서이동, D 나오면 커서내용삭제 방안


public class p_5430_AC {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        while(T>0){
            System.out.println(calc());
            T--;
        }

    }
    public static Object calc() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();

        String[] cmd = br.readLine().split("");
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        str = str.replaceAll("\\[", ""); //괄호를 지운다(역슬래시 특수문자 지정)
        str = str.replaceAll("\\]", ""); //괄호를 지운다(역슬래시 특수문자 지정)
        String [] temp = str.split(",");

        for(int i =0;i<n;i++){
            list.add(Integer.parseInt(temp[i]));
        }
        int pointer = 0;
        for(int i =0;i<cmd.length;i++) {
            if (cmd[i].equals("R")) {
                if(pointer == 0){
                    pointer = list.size()-1;
                }else if(pointer != 0){
                    pointer =0;
                }
                System.out.println(pointer);
            } else if (cmd[i].equals("D")) {
                if(pointer != 0){
                    list.remove(pointer);
                    pointer -= 1;
                }else {
                    list.remove(pointer);
                }

            }

        }

        if(pointer == 0){
            return list.toArray();
        }else{
            Collections.reverse(list);
            return list.toArray();
        }
    }
}
