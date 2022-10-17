package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//
//접근법
//이중포문 돌리면 시간초과날거같음
//투포인터로 서로 비교해가면서 하나씩 대입하는 방안으로 생각


//소스코드 간결화 필요
//1차 시간초과 -> bufferedreader 수정
//2차 시간초과 -> for문 변경 + continue문 추가
//3차 시간초과 -> 메소드 삭제, if, for 문으로 수정


public class p_11728_배열합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] brr= new int[m];
        int[] crr = new int[n+m];
        int apoint = 0;
        int bpoint = 0;
        int cnt =  0;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            brr[i] = Integer.parseInt(st.nextToken());
        }

       for( int i = 0 ;i<crr.length;i++) {
           if (arr.length == apoint) {
               crr[cnt] = brr[bpoint];
               bpoint++;
               cnt++;
               continue;
           } else if (brr.length == bpoint) {
               crr[cnt] = arr[apoint];
               apoint++;
               cnt++;
               continue;
           }

           if (arr[apoint] >= brr[bpoint]) {
               crr[cnt] = brr[bpoint];
               bpoint++;
               cnt++;
           } else if (arr[apoint] < brr[bpoint]) {
               crr[cnt] = arr[apoint];
               apoint++;
               cnt++;
           }
       }

        for(int i : crr){
            System.out.print(i+ " ");
        }
    }
}
