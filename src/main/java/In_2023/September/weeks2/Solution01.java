package In_2023.September.weeks2;

import java.util.*;

/** Solution01 : 큰 수 만들기
 *  문제 유형 : 탐욕법(Greedy)
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-09-10
 */
public class Solution01 {
    public static String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int next = 0;

        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;

            for (int j = index; j <= i + k; j++) {
                int current = number.charAt(j) - '0';

                if (max < current) {
                    max = current;
                    next = j;
                }
            }
            sb.append(max);
            index = next + 1;
        }
        System.out.println("sb : " + sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
            String number = "4177252841";
            int k = 4;
            solution(number, k);
    }
}
