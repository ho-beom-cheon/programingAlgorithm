package Before_2023.October.week1;

/** Solution04 : 숫자의 표현
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-10-09
 */
public class Solution04 {
    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum += j;
                if(sum==n) {
                    answer++;
                    break;
                } else if(sum>n) {
                    break;
                }
            }
        }

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        int val1 = 15;

        solution(val1);
    }
}
