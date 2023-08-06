package Before_2023.October.week3;

import java.util.Arrays;

/** Solution01 : 정수 내림차순으로 배치하기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-10-24
 */
public class Solution01 {
    public static long solution(long n) {
        String[] nArr = String.valueOf(n).split("");
        long answer;
        Arrays.sort(nArr);

        StringBuilder nStr = new StringBuilder();
        for(int i=nArr.length-1; i>=0; i--) nStr.append(nArr[i]);

        answer = Long.parseLong(nStr.toString());

        System.out.println("답 : " +  answer);

        return answer;
    }
    public static void main(String[] args) {
        int var = 118372;

        solution(var);
    }
}

