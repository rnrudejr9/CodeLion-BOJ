package 자료구조;
// 큐 -> 선입 선출
//롯데월드에서 놀이기구타려 줄 설때

// 우선순위 큐 -> 정렬된 후 선출
// 아이유가 바이킹을 타러옴, 우선순위가 높은사람이 오면 앞으로 보내줘서 먼저 타게해줌

import java.util.Map;
import java.util.PriorityQueue;

public class 자바_우선순위큐 {
    public static void PriorityQueueEx(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(2);
        pq.add(1);
    }

    public static void main(String[] args) {
        PriorityQueueEx();
    }
}
