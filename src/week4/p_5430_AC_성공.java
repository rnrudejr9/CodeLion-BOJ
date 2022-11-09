package week4;

import java.io.*;
import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

//데큐에서 뒤에 값을 뺴고 앞에다 넣는 방법을 모르겠음
//결국 스택과 큐를 활용해서 뒤집기 삭제 연산 구현

//1차수정 : 시간초과 뒤집는 연산을 어떻게 처리할까
//* Arraylist 와 Collections 활용
//2차수정 : 시간초과 배열에 인덱스를 두어서 R나오면 커서이동, D 나오면 커서내용삭제 방안
//3차수정 : bufferedwriter, arraylist 읽기 방식, replace, split 추가
//4차수정 : ArraystoString() -> 출력값 stringbuilder 사용
//5차수정 : append 할때, list 값이 없으면 마지막 값을 뺴지 않는다 추가

//6차수정 : 자료구조 DEQUE로 사용해서 하기 (Arraylist에서 remove 0 시 뒤에서 다 한칸씩 땡겨야됨)
////* 덱은 앞뒤 포인터가 가리키고 있다. , 특정 인덱스 변호 상수로 접근 가능
// 덱 수정 후 성공
public class p_5430_AC_성공 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while(T>0){
            bw.write(calc());
            bw.newLine();
            T--;
        }
        bw.flush();
        bw.close();
    }
    public static String calc() throws IOException {
        Deque<String> list = new LinkedList<>();
        String[] cmd = br.readLine().split("");
        int n = Integer.parseInt(br.readLine());
        String numStr = br.readLine().replaceAll("[^0-9]", " ");
        String[] temp = numStr.split(" ");
        for(int i = 0; i<temp.length;i++){
            if(temp[i].equals("")){
                continue;
            }
            list.add(temp[i]);
        }

        for(int i =0;i<n;i++){

        }
        int pointer = 0;
        for(int i =0;i<cmd.length;i++) {

            if (cmd[i].equals("R")) {
                if(pointer == 0){
                    pointer = list.size()-1;
                }else if(pointer != 0){
                    pointer =0;
                }
            } else if (cmd[i].equals("D")) {
                if(list.isEmpty()) {
                    return "error";
                }
                if(pointer != 0){
                    list.pollLast();
                }else {
                    list.poll();
                }
            }
        }
        StringBuilder sb= new StringBuilder();
        if(pointer == 0) {
            sb.append("[");
            for(int i =0;i<list.size();){
                if(list.size() == 1){
                    sb.append(list.poll());
                }else {
                    sb.append(list.poll() + ",");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        else if(pointer != 0){
            sb.append("[");
            for(int i =0;i<list.size();){
                if(list.size() == 1){
                    sb.append(list.pollLast());
                }else {
                    sb.append(list.pollLast() + ",");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        return "";
    }
}
