package week3;

import java.util.Arrays;
import java.util.Scanner;

//접근법 재귀함수로 계속 탐색
//1차수정 : 스캐너 입력받는거 nextLine 추가
//2차수정 : 두명 중 가장 큰수 가진사람 순서 출력 추가
//3차수정 :
public class p_2303_숫자게임 {

    static int[] arr,now;
    static boolean[] visited;
    static int[] maxArr;
    static int[] max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        arr = new int[5];
        visited = new boolean[5];
        now = new int[3];
        maxArr = new int[3];
        max = new int[3];

        for(int i = 0 ;i<n;i++){
            maxArr[i] = 0;
            for(int j =0 ;j<5;j++){

                arr[j] = sc.nextInt();
                visited[j] = false;
            }
            calc(0,i);
        }

    }

    public static void calc(int index,int f){
        if(index == 3){
            int sum = 0;
            for(int x: now){
                sum += x;
                System.out.print(x+" ");
                if(maxArr[f] < sum){
                    maxArr[f] = sum;
                }
            }
            int temp = sum % 10;
            if(max[f] < temp){
                max[f] = temp;
            }

            System.out.println("sum : " + sum);

            }else{
            for(int i =0;i<arr.length;i++){
                if(visited[i] == false){
                    visited[i] = true;
                    now[index] = arr[i];
                    calc(index+1,f);
                    visited[i] = false;
                }
            }
        }

    }
}
