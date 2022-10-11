package week1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p_1026_보물_성공 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Integer[] brr = new Integer[n];

        for(int i = 0; i<n;i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(brr,Comparator.reverseOrder());

        System.out.println(calc(arr,brr));

    }
    public static int calc(int[] arr, Integer[] brr){
        int temp = 0 ;
        for(int i = 0; i<arr.length;i++){
            temp += arr[i] * brr[i];
        }
        return temp;
    }
}
