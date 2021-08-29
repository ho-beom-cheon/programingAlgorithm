package August.week4;

import java.util.*;

/** Solution05 : 자릿수 더하기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-29
 */
public class Solution05 {
    public static int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n % 10;
            n /= 10;
        }

        System.out.println("답 : " + answer);

        return answer;
    }


    public static void main(String[] args) {
        int var = 123;

        solution(var);
    }
}

