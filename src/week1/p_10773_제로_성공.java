package week1;

import java.util.Scanner;
import java.util.Stack;

public class p_10773_제로_성공 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int res = 0;

        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<k;i++){
            int cmd = sc.nextInt();
            if(cmd == 0){
                st.pop();
            }else {
                st.push(cmd);
            }
        }
        for(int i : st){
            res += i;
        }
        System.out.println(res);

    }
}
