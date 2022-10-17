package week2;

//수박이박수 회문
//수박이박수수 유사회문
//안녕하세요 일반문자열

//내가 생각한 접근법
//1. 문자열 길이의 중간까지 스택에 넣고 팝연산하면서 그 뒷자리를 비교해보는 것

//2. 투포인터로 홀수 짝수 구역 나눠서 하나씩 비교해보는것



import java.util.Scanner;
import java.util.Stack;

public class p_17609_회문 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T>0){
            int cnt = 0;
            String s = sc.nextLine();
            if(s.length()%2 == 0){
//                int end = 0;
//                int start =
            }else{

            }


//      abba 3/2 + 1 인덱스 2번까지 푸시
//      abbba 4/2 + 0 인덱스 2번까지 푸시
            T--;
        }

    }
}
