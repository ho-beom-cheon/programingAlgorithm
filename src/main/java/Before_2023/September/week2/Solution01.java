package Before_2023.September.week2;

/** Solution01 : x만큼 간격이 있는 n개의 숫자
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-09-08
 */
public class Solution01 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int val = x;

        for(int i =0; i<n; i++) {
            answer[i] = ((long)x * (i+1));
            System.out.println("답 : " + answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int var = 2;
        int var2 = 5;
        solution(var, var2);
    }
}

