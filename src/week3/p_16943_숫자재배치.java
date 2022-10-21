package week3;

import java.util.Arrays;
import java.util.Scanner;

public class p_16943_숫자재배치 {
    static boolean[] visited;
    static int[] arr, now;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String temp = Integer.toString(n); //4

        arr = new int[temp.length()];  //4
        now = new int[temp.length()];
        visited = new boolean[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
                arr[i] = temp.charAt(i) - '0';
                visited[i] = false;
        }



        DFS(0);

    }
    public static void DFS(int index){
        if(index == arr.length){
            for(int x : now){
                System.out.printf("%d ",x);
            }
            System.out.println();
        }else {
            // 여기에 체크를 넣었는데..?
                for(int i = 0;i<arr.length;i++){
                    if(visited[i] == false){
                        visited[i] = true;
                        now[index] = arr[i];
                        DFS(index+1);
                        visited[i] = false;
                    }
                }
        }
    }
}
