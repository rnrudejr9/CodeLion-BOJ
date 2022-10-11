package week1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Graph {
    private int nv;
    private ArrayList<ArrayList<Integer>> dfsGraph;
    private boolean[] visited;
    private int stack;
    public Graph(int nv){
        this.nv = nv;
        this.dfsGraph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < this.nv; i++) {
            this.dfsGraph.add(new ArrayList<>());
        }
        this.visited = new boolean[this.nv+1];
        stack = -1;
    }
    public int getStack(){
        return this.stack;
    }
    public ArrayList<Integer> getNode(int i){
        return this.dfsGraph.get(i);
    }
    public void put(int x,int y){
        this.dfsGraph.get(x).add(y);
        this.dfsGraph.get(y).add(x);
    }
    public void clearVisitArr(){
        for(int i =0 ;i<this.visited.length;i++){
            this.visited[i] = false;
        }
    }
    public void dfs(int index){
        this.visited[index] = true;
        stack++;
        for(int i : this.dfsGraph.get(index)){
            if(this.visited[i] == false){
                dfs(i);
            }
        }
    }

}


public class p_9372_상근이의여행_성공 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());
        while(T>0) {
            StringTokenizer st;

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            Graph graph = new Graph(n);
            int m = Integer.parseInt(st.nextToken());

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()) - 1;
                int y = Integer.parseInt(st.nextToken()) - 1;
                graph.put(x, y);
            }

            graph.dfs(1);
            System.out.println(graph.getStack());
            T--;
        }
        bw.flush();
        bw.close();

    }
}
