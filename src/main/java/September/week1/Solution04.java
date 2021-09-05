package September.week1;

/** Solution04 : 약수의 합
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-09-05
 */
public class Solution04 {
    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                answer += i;
            }
        }

        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int n = 12;
        solution(n);
    }
}
