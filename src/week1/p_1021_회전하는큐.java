package week1;


import java.io.BufferedReader;
import java.util.PriorityQueue;
import java.util.Scanner;

//문제접근: DP 사용해서 풀어야될거같음,, 왼쪽돌리는 경우와 오른쪽돌리는 경우들 저장해서 계쏙 비교
public class p_1021_회전하는큐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[] arr= new int[m];
        for(int i =0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(int i = 1;i<=n;i++){
            pq.add(i);
        }





    }
}

