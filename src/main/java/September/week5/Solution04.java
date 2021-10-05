package September.week5;

/** Solution04 : 피보나치 수
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-10-03
 */
public class Solution04 {
    public static int solution(int n) {
        int answer;
        int a = 0;
        int b = 1;

        for(int i=0; i<n; i++) {
            int c = (a+b)%1234567;
            a = b%1234567;
            b = c%1234567;
        }

        answer = a;

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        int val = 3;

        solution(val);
    }
}
