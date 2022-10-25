package 연습문제;

import java.util.ArrayList;
import java.util.Scanner;

// 64를 2진수로 접근하는 방법도 있음. 비트마스킹
// 특이한 숫자를 보면 한번 생각만 해봐라

// DFS
// STACK, ArrayList

public class p_1094_막대기_성공 {
    static int x;
    public static boolean isTrue(ArrayList<Integer> list){
        int sum = 0;
        for(int li : list){
            sum += li;
        }
        if(sum == x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        x = sc.nextInt();
        int std = 64;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(std);
        while(true){
            int sum = 0;
            for(Integer p : list){
                sum += p;
            }

            if(sum > x){
                std = std/2;
                list.remove(list.size()-1); //6 -> 바꿔줘야됨  64 -> 32 -> 16, 4, 2, 1
                if( sum - std < x){
                    list.add(std);
                    list.add(std);
                }else if( sum - std >= x){
                    list.add(std);
                }
            }
            if(isTrue(list)){
                System.out.println(list.size());
                break;
            }

        }
    }
}
