package In_2023.October.weeks3;
/** Solution01 : 뒤에 있는 큰 수 찾기
 *  문제 유형 : 스택
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-10-22
 */

import java.util.*;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Solution01 {
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> s = new Stack<>();

        for(int i=numbers.length-1; i>=0; i--){
            while(!s.isEmpty()){
                if(s.peek() > numbers[i]){
                    answer[i] = s.peek();
                    break;
                }else{
                    s.pop();
                }
            }
            if(s.isEmpty()){
                answer[i] = -1;
            }
            s.push(numbers[i]);
        }
        System.out.println(Arrays.toString(answer));
        return answer;

    }

    public static void main(String[] args) {
        int[] numbers = {2,3,3,5};
        solution(numbers);
    }
}
