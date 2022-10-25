package 연습문제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


//문제를 만날때 입력받는 부분까지만 해두고 문제를 보고 생각을 정리하고 로직을 생각해라
//어떻게 접근하셨나요?
//파이프에 관해서 mapping

//m , z dfs 해서 좌표
//

public class p_연습문제 {
    static int[] x,y;
    static int C,R;
    static int[] dx = {0,1,-1, 0};
    static int[] dy = {1,0, 0,-1};
    static int[][] visited;
    static char[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        x = new int[2];
        y = new int[2];
        map = new char[C][R];
        visited = new int[C][R];

        for(int i=0;i<C;i++){
            String s = br.readLine();
            for(int j=0;j<R;j++){
                map[i][j] = s.charAt(j);
                visited[i][j] = 0;
                if(s.charAt(j) == 'M'){
                   x[0] = i;
                   y[0] = j;
                }
                if(s.charAt(j) == 'Z'){
                    x[1] = i;
                    y[1] = j;
                }
            }
        }

        DFS(x[0],y[0]);
    }

    public static void DFS(int x, int y) {
        visited[x][y] = 1;
        System.out.println("map: " + map[x][y]);
        System.out.println("x , y" + x + " " + y);
        if(map[x][y] == 'Z'){
            System.out.println("find");
            System.exit(0);
        }

        for (int i = 0; i < 4; i++) {
            int fx = x + dx[i];
            int fy = y + dy[i];
            if (fx < 0 || fx >= C || fy < 0 || fy >= R) {
                continue;
            }else {
                DFS(fx, fy);
            }
        }
    }
}
