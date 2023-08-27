package In_2023.August.weeks4;
/** Solution02 : 멀리뛰기
 *  문제 유형 : DP
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-08-27
 */
public class Solution02 {
    public static long solution(int n) {
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<2001; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        solution(4);
        solution(3);
        System.out.println(solution(4));
        System.out.println(solution(3));
    }
}
