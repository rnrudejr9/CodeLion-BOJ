package week1;

import java.util.Scanner;

public class p_1722_순열의순서 {
    static int[] arr;
    static boolean[] visited;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        visited = new boolean[n];
        dfs(0);

    }
    //1234 방문후에
    //1243 방문을 어떻게 하냐

   public static void dfs(int index){

            visited[index] = true;
            for(int i = 1;i<n;i++){
                if(visited[i] == false){
                    dfs(i);
                }
            }
            for(int i : arr) {
                System.out.println(i);
        }
    }




}
