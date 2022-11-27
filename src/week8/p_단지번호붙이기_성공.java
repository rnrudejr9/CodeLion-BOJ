package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p_단지번호붙이기_성공 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[][] map;
    static boolean[][] visited;
    static int value;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        map= new int[n][n];
        visited = new boolean[n][n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            String[] temp = br.readLine().split("");
            for(int j =0;j<temp.length;j++){
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }

        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    value = 1;
                    bfs(i,j);
                    cnt++;
                    list.add(value);
                }
            }
        }
        System.out.println(cnt);
        Collections.sort(list);
        for(Integer i : list){
            System.out.println(i);
        }
    }
    public static void bfs(int x,int y){
        if(!visited[x][y]){
            visited[x][y] = true;
            for(int i =0;i<dx.length;i++){
                int px = x + dx[i];
                int py = y + dy[i];
                if(!(px < 0 || px >= map.length || py < 0 || py >= map.length)){
                    if(map[px][py] == 1 && !visited[px][py]){
                        bfs(px,py);
                        value++;
                    }
                }
            }
        }
    }
}
