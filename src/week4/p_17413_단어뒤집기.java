package week4;

//1. 문자를 하나씩 탐색하면서 꺽쇄인지 띄어쓰기인지 검사
//2. 스택을 이용?
//3. 꺽쇄를 만나면 스택에 있는 값들을 팝 과 동시에 그 내용들을 스트링 빌더 저장

// 스택에서 팝할때 증감문을 쓰지않음 ..
// 스캐너 next() 로 받아서 개행문자 전까지 입력

import java.util.Scanner;
import java.util.Stack;

public class p_17413_단어뒤집기 {
    static Stack<Character> st = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int T = str.length();
        int index = 0;
        boolean isGoing = false;
        while(T > 0){
            char c = str.charAt(index);
//            System.out.println("T : "+T);
//            System.out.println("index " + index);
//            System.out.println("c " + c);


            if(c=='<'){
                isGoing = true;
                if(!st.isEmpty()){
                    for(int i =0;i<st.size();){
                        sb.append(st.pop());
                    }
                }
            }else if(c=='>'){
                sb.append(c);
                isGoing = false;
                if(!st.isEmpty()){
                    for(int i =0;i<st.size();){
                        sb.append(st.pop());
                    }
                }
            }else if(c != ' ' && isGoing == false){
                st.push(c);
            }else if(c==' ' && isGoing == false){
                for(int i =0;i<st.size();){
                    sb.append(st.pop());
                }
                sb.append(" ");
            }

            if(isGoing == true){
                sb.append(c);
            }

            index++;
            T--;
        }

        if(!st.isEmpty()){
            for(int i =0;i<st.size();){
                sb.append(st.pop());
            }
        }
        System.out.println(sb);
    }
}
