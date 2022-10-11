package week1;

import java.util.Arrays;
import java.util.Scanner;

public class p_2108_통계학 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        avg(arr);
        mid(arr);
        bin(arr);
        range(arr);

    }
    //범위를 포멧해서 최빈값을 구한뒤에
    // 다시 그 범위에 맞는 해당값들을 출력
    public static void bin(int [] arr){

    }
    public static void range(int [] arr){
        int temp = Math.abs(arr[0]) + Math.abs(arr[arr.length-1]);
        System.out.println(temp);
    }
    public static void avg(int[] arr){
        int sum= 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }

        if(sum<0){
            double temp = sum / arr.length;
            System.out.printf("%.0f\n",temp-1);
        }else{
            double temp = sum / arr.length;
            System.out.printf("%.0f\n",temp);
        }


    }
    public static void mid(int[] arr){
        Arrays.sort(arr);
        int temp = arr.length/2;
        System.out.println(arr[temp]);
    }
}
