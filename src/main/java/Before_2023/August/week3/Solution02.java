package Before_2023.August.week3;

import java.util.*;

/** Solution02 : 기능개발
 *  문제 유형 : 큐
 *  출처 : 프로그래머스 - 스택/큐
 *  날짜 : 2021-08-18
 */
public class Solution02 {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++){
            int devDays = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);

            if(!queue.isEmpty() && queue.peek() < devDays){
                list.add(queue.size());
                queue.clear();
            }
            queue.add(devDays);
        }
        list.add(queue.size());

        int[] answer = new int[list.size()];
        int size = 0;
        for(int a : list) {
            answer[size++] = a;

            System.out.println("답 : " + a);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] var= {93, 30, 55};
        int[] var2= {1, 30, 5};

        solution(var, var2);
    }
}

