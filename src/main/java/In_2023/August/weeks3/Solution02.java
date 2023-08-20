package In_2023.August.weeks3;

/** Solution02 : 디펜스 게임
 *  문제 유형 : 우선순위 Queue
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-08-20
 */


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution02 {
    public static int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < enemy.length; i++) {
            n -= enemy[i];
            pq.add(enemy[i]);

            if (n < 0) {

                if (k > 0 && !pq.isEmpty()) {
                    n += pq.poll();
                    k--;
                } else {
                    answer = i;
                    break;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int[] enemy = {4, 2, 4, 5, 3, 3, 1};
        solution(n, k, enemy);
    }
}
