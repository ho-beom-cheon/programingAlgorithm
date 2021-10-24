package October.week3;

/** Solution02 : 나머지가 1이 되는 수 찾기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 월간 코드 챌린지 시즌3
 *  날짜 : 2021-10-24
 */
public class Solution02 {

    public static int solution(int n) {
        int answer = 2;
        n -= 1;
        while(answer<=n && n%answer!=0) {
            answer++;
        }

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        int val1 = 10;

        solution(val1);
    }
}
