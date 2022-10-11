package week1;

import java.util.Arrays;
import java.util.Scanner;
//접근한 생각 : dfs 로 모든 배열에 대한 경우의수를 체크 (순열체크)
//제한적인 요소 : dfs 구현에 제한이 됨
//방향성을 찾기 힘들었음, 여러 알고리즘 구현 방법을 확인하고 스스로 코딩

public class p_1722_순열의순서 {
    static int[] arr;
    static int[] pm;
    static boolean[] visited;
    static int n;
    static int cnt;
    static int value;
    static int[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        visited = new boolean[n];
        pm = new int[n];
        check = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = i+1;
            visited[i] = false;
            pm[i] = 0;
            check[i] = 0;
        }

        cnt = 0;
        int cmd = sc.nextInt();
        switch (cmd){
            case 1:
                value = sc.nextInt();
                DFS(0);
                break;
            case 2:
                for(int i = 0 ;i<n;i++){
                    check[i] = sc.nextInt();
                }
                DFS(0);
                break;
        }

    }

    public static void DFS(int L) {
        if (L == n) { // m개 만큼 수를 뽑았다면 입력된 순열을 출력
            cnt++;
            if(value == cnt){
                for(int x : pm){
                    System.out.print(x + " ");
                }
                System.exit(0);
            }
            if(Arrays.equals(pm,check)){  //배열의 성분값 비교시 arrays equals 사용!
                System.out.println(cnt);
                System.exit(0);
            }
        } else { // 아직 덜 뽑았다면 다음 수를 뽑아줌
            for (int i = 0; i < n; i++) {
                // 체크하지 않은, 곧 이전에 뽑지 않은 수만 다음 재귀함수로
                if (visited[i] == false) {
                    visited[i] = true; // 뽑았으니 체크
                    pm[L] = arr[i]; // 뽑은 수를 순열에 추가
                    DFS(L + 1); // 다음 수를 뽑으러
                    visited[i] = false; // 재귀함수가 끝났다면 현재 뽑은 수를 체크해제
                }
            }
        }
    }
}
    //1234 방문후에
    //1243 방문을 어떻게 하냐

