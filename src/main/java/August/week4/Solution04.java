package August.week4;

import java.util.ArrayList;

/** Solution04 : 정수 제곱근 판별
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-29
 */
public class Solution04 {
    public static long solution(long n){
        long answer = 0;

        for(long i=1; i<=n; i++){
            if(i * i == n){
                answer = (i+1) * (i+1);
                break;
            } else answer = -1;
        }

        System.out.println("답 : " + answer);
        return answer;
    }


    public static void main(String[] args) {
        int var= 121;

        solution(var);
    }
}

