package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p_1920_수찾기_해결 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int temp = Integer.parseInt(st.nextToken());
            if(isFind(arr1,temp)){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }

    }
    public static boolean isFind(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return true;
            }
        }
        return false;
    }
}
