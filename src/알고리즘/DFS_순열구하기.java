package 알고리즘;

import java.util.Scanner;

public class DFS_순열구하기 {
    static int[] pm, ch, arr;
    static int n, m;

    public static void main(String[] args) {
        DFS_순열구하기 T = new DFS_순열구하기();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n]; // 나열할 수들
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        ch = new int[n]; // 수를 선택했는지 체크
        pm = new int[m]; // 현재 입력된 순열
        T.DFS(0);
    }

    // 해결방법
    // 입력된 수를 중복을 하지 않고 뽑는 경우의 수
    // 입력된 수 중에 이전에 뽑지 않았던 수만 재귀함수로 돌림
    // 입력되었음을 체크하고 재귀함수가 끝나면 그 수를 다시 체크해제
    // 이때 입력된 수를 순열에 추가
    // 뽑아야하는 개수만큼 뽑았다면 출력
    public void DFS(int L) {
        if (L == m) { // m개 만큼 수를 뽑았다면 입력된 순열을 출력
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else { // 아직 덜 뽑았다면 다음 수를 뽑아줌
            for (int i = 0; i < n; i++) {
                // 체크하지 않은, 곧 이전에 뽑지 않은 수만 다음 재귀함수로
                if (ch[i] == 0) {
                    ch[i] = 1; // 뽑았으니 체크
                    pm[L] = arr[i]; // 뽑은 수를 순열에 추가
                    DFS(L + 1); // 다음 수를 뽑으러
                    ch[i] = 0; // 재귀함수가 끝났다면 현재 뽑은 수를 체크해제
                }
            }
        }
    }
}