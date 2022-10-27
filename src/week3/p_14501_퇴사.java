package week3;

import java.util.Scanner;
//
//클래스 만들어서 day, pay 저장
//1일차부터~ n번차까지 불러와서 for문을 통해 브루트포스탐색

//1차수정 : 1일차에서 안더하면, 1일차에서 날짜를 가져가면,
//2차수정 :


//DP 할때 이 문제를 다시 봤으면 좋겠다.

class Temp{
    int day;
    int pay;

    public Temp(int day, int pay) {
        this.day = day;
        this.pay = pay;
    }

    public int getDay() {
        return day;
    }

    public int getPay() {
        return pay;
    }
}
public class p_14501_퇴사 {
    static Temp[] arr;
    static int res;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        arr = new Temp[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Temp(sc.nextInt(),sc.nextInt());
        }
        int max =-1;
        res= 0;
        for(int i =0;i<n;i++){
            calc(arr,i,0);
            if(res > max){
                max = res;
            }
            System.out.println("------------------");
        }
        System.out.println("max : " + max);

    }
    public static void calc(Temp[] T,int index,int sum){
        System.out.println("index " + index);
        System.out.println("sum :" +sum);
        System.out.println("T.leng" + T.length);

        if(index > T.length-1){
            res = sum;
            return;
        }else if(index == T.length-1){

            if(T[index].getDay() == 1){
                sum += T[index].getPay();
                res = sum;
                return;
            }
        }

        int day = T[index].getDay();
        int pay = T[index].getPay();
        sum += pay;
        calc(T,index+day,sum);

    }

}
