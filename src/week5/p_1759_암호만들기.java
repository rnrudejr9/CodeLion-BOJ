package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1759_암호만들기 {
    static boolean[] visited;
    static String[] printCharArr;
    static int L;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        visited = new boolean[C];
        String[] cArr = new String[C];
        printCharArr = new String[L];
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<C;i++) {
            cArr = br.readLine().split(" ");
        }

        DFS(0,cArr,0);


    }

    public static void DFS(int idx,String[] cArr,int level){
            visited[idx] = true;
            printCharArr[level] = cArr[idx];
            level++;

            if(level == L-1 ){
                for(String c : printCharArr){
                    System.out.printf("%c",c);
                }
                System.out.println();
                level--;
            }

            for(int i = 0; i<cArr.length;i++){
                if(!visited[idx]) {
                    DFS(i,cArr,level);
                    visited[idx] = false;
                }
            }
    }
}


