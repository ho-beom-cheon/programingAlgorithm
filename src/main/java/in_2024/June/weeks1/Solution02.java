package in_2024.June.weeks1;

import java.util.Collections;
import java.util.PriorityQueue;

/** Solution02 : 프로세스
 *  문제 유형 : 우선순위 큐(PriorityQueue)
 *  출처 : 프로그래머스
 *  날짜 : 2024-06-09
 */

public class Solution02 {
    public static int solution(int[] priorities, int location) {
        int answer = 1;

        // 우선순위 큐 사용 : PriorityQueue
        // 일반 큐와 같이 FIFO의 형식이 아닌 들어오는 순서와 상관없이 우선순위가 높은
        // 데이터가 먼저 나가는 자료구조
        /* 우선순위 선정 방식
            PriorityQueue priority = new PriorityQueue<>(); -> 우선 순위가 낮은 숫자가 먼저 나옴(기본형)
            PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder()); -> 우선 순위가 높은 숫자가 먼저 나옴
         */
        PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder());

        for(int task : priorities){
            // add() : 우선순위 큐에 원소를 추가. 큐가 꽉 찬 경우 에러 발생
            priority.add(task);
            System.out.println(priority);
        }

        System.out.println(priority);
        while(!priority.isEmpty()){
            for(int i=0; i<priorities.length; i++){

                if(priorities[i] == (int)priority.peek()) {
                    if(i == location){
                        return answer;
                    }
                    // poll() : 우선순위 큐에서 첫 번째 값을 반환하고  제거, 비어있으면 null 반환
                    priority.poll();
                    answer++;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        solution(priorities, location);
    }
}
