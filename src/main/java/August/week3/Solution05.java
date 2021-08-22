package August.week3;

import java.util.PriorityQueue;

/** Solution05 : 더 맵게
 *  문제 유형 : 힙
 *  출처 : 프로그래머스 - 힙
 *  날짜 : 2021-08-22
 */
public class Solution05 {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int item : scoville) {
            heap.offer(item);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();


            int result = a + (b * 2);

            heap.offer(result);
            answer ++;
        }

        System.out.println("답 : " + answer);


        return answer;
    }


    public static void main(String[] args) {
        int[] var= {1, 2, 3, 9, 10, 12};
        int var2 = 7;

        solution(var, var2);
    }
}

