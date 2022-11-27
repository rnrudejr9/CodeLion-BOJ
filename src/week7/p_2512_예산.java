package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p_2512_예산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int std = Integer.parseInt(br.readLine());
        Arrays.sort(arr);


        int start = arr[0];
        int end = arr[arr.length-1];
        int mid=0;
        while(start <= end) {
            mid = (start + end)/2;
            if (isOver(arr, std, mid)) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        System.out.println(start);
    }
    public static boolean isOver(int[] arr, int std, int mid){
        int res = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] >= mid){
                res += mid;
            }else {
                res += arr[i];
            }
        }
        if( std < res ){
            return true;
        }else{
            return false;
        }
    }

}
