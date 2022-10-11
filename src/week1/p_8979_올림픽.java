package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//무식하게 비교하는 방법
//

class Nation implements Comparable<Nation> {
    public int name;
    public int gold;
    public int silver;
    public int dong;
    public int rank;

    public Nation(int name, int gold, int silver, int dong, int rank) {
        this.name = name;
        this.gold = gold;
        this.silver = silver;
        this.dong = dong;
        this.rank = rank;
    }

    @Override
    public int compareTo(Nation o) {
        if(this.gold == o.gold){
            if(this.silver == o.silver){
                if(this.dong == o.dong){
                    return this.dong - o.dong;
                }else{
                    return this.silver - silver;
                }
            }
            return this.silver - o.silver;
        }
        return this.gold - o.gold;
    }
}

public class p_8979_올림픽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Nation> nation = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            st = new StringTokenizer(br.readLine());
            int name = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int dong = Integer.parseInt(st.nextToken());
            Nation nationtemp = new Nation(name,gold,silver,dong,0);
            nation.add(nationtemp);
        }
//        각 객체에 필드를 초기화
        Collections.sort(nation);

        // 1부터 n-1 까지 비교
        for(int i = 1; i<n;i++){
            Nation first = nation.get(i-1);
            Nation second = nation.get(i);

            if(first.gold == second.gold &&
            second.silver == first.silver &&
            first.dong == second.dong){
                first.rank = second.rank;
            }else{
                second.rank = i +1;
            }


        }
        nation.stream().
                filter(t -> t.name == m).
                map(t -> t.rank).
                forEach(System.out::println);
//
//        for(int i=0;i<n;i++){
//            System.out.println("name : " + nation[i].name + " rank : " + nation[i].rank);
//        }

        // 등수는 잘 출력됨 그런데 메달수가 같을때 등수가 같아야함
    }
}
